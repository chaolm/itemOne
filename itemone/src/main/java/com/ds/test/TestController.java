package com.ds.test;

import com.ds.test.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/19
 * hh
 **/
@Controller
public class TestController {

    @RequestMapping("/test")
    //@ResponseBody
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView();
        //ModelAndView mv=new ModelAndView("welcome");
        mv.setViewName("index"); //返回的文件名


        return mv;
    }
}
