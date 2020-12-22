package com.ds.test.controller;

import com.ds.test.commonDto.ResultInfo;
import com.ds.test.dto.Advertisement;
import com.ds.test.dto.User;
import com.ds.test.service.advertisement.AdvertisementService;
import com.ds.test.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Controller
@RequestMapping(value = "/advertisement")
public class AdvertisementController extends BaseController{

    @Autowired
    private AdvertisementService advertisementService;

    /**
     * 根据参数获取广告、活动表
     * @param
     * @return
     */
    @RequestMapping(value = "/getAdvertisementList",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo getAdvertisementList(@RequestBody Map param) {
        List<Advertisement> advertisements = advertisementService.getAdvertisementList(param);
        return returnSuccess(advertisements);

    }

    /**
     * 新增广告、活动表
     * @param advertisement
     * @return
     */
    @RequestMapping(value = "/addAdvertisement",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo add(@RequestBody Advertisement advertisement) {

        try {
            advertisementService.add(advertisement);
        } catch (Exception e) {
            e.printStackTrace();
            return returnFail(e.getMessage());
        }
        return returnSuccess();
    }

    /**
     * 更新广告、活动表
     * @param advertisement
     * @return
     */
    @RequestMapping(value = "/updateAdvertisement",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo update(@RequestBody Advertisement advertisement) {
            advertisementService.update(advertisement);
        return returnSuccess();

    }


}
