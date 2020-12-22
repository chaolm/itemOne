package com.ds.test.controller;

import com.ds.test.commonDto.ResultInfo;
import com.ds.test.commonDto.TokenDto;
import com.ds.test.dto.User;
import com.ds.test.service.user.UserService;
import com.ds.test.until.RedisUtil;
import com.ds.test.until.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;





    @RequestMapping(value = "testFtl" ,method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView testFtl(){
        List<User> users = userService.getUser();
        /*ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("users",users);*/
        return createViewAndResult("index",users,"users");
        //return returnSuccess(users);
    }


    @RequestMapping(value = "getUser" ,method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getUser(){
        List<User> users = userService.getUser();
        RedisUtil.INSTANCE.set("a","chaoleiming",100000);
        return returnSuccess(users);
    }

    /**
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addUser(@RequestBody User user){

        String userCode = null;
        try {
            userCode = userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return returnFail(e.getMessage());
        }
        return returnSuccess(userCode);
    }

    /**
     * 用户手机号 账号编码 密码登陆
     * @param user
     * @return
     */
    @RequestMapping(value = "/loginByPassword",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo loginByPassword(@RequestBody User user){
       userService.loginByPassword(user);
        //TokenDto tokenDto = UserUtil.refreshToken(user);
        return returnSuccess();
    }

    /**
     * 用户通过用户编码 修改信息
     * @param user
     * @return
     */
    @RequestMapping(value = "updateUserInfoByUserCode",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo updateUserInfoByUserCode(@RequestBody User user){
        String status = userService.updateUserInfoByUserCode(user);
        return returnSuccess(status);
    }

    /**
     * 用户通过用户编码 修改密码
     * @param user
     * @return
     */
    @RequestMapping(value = "updateUserPassword",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo updateUserPassword(@RequestBody User user){
        String status = userService.updateUserPassword(user);
        return returnSuccess(status);
    }

}
