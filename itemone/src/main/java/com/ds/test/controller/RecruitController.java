package com.ds.test.controller;

import com.ds.test.commonDto.ResultInfo;
import com.ds.test.dto.Advertisement;
import com.ds.test.dto.Recruit;
import com.ds.test.service.advertisement.AdvertisementService;
import com.ds.test.service.recruit.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Controller
public class RecruitController extends BaseController{

    @Autowired
    private RecruitService recruitService;

    /**
     * 根据参数获取广告、活动表
     * @param
     * @return
     */
    @RequestMapping(value = "/getRecruitList",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo getRecruitList(@RequestBody Map param) {
        List<Recruit> recruits = recruitService.getRecruitByParam(param);
        return returnSuccess(recruits);

    }

    /**
     * 新增招聘
     * @param recruit
     * @return
     */
    @RequestMapping(value = "/addRecruit",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo add(@RequestBody Recruit recruit) {
        recruitService.addRecruit(recruit);
        return returnSuccess();
    }

    /**
     * 更新招聘
     * @param recruit
     * @return
     */
    @RequestMapping(value = "/updateRecruit",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo update(@RequestBody Recruit recruit) {
        recruitService.updateRecruit(recruit);
        return returnSuccess();

    }


}
