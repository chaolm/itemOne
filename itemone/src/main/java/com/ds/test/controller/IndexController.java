package com.ds.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author clm
 * @date 2020/12/17
 * hh
 **/
@Controller
public class IndexController extends BaseController{

    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public ModelAndView testFtl(){
        return createView("index");
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public ModelAndView testFt2(){
        return createView("user/login");
    }

    @RequestMapping(value = "/register" ,method = RequestMethod.GET)
    public ModelAndView testFt3(){
        return createView("user/registerUser");
    }

    @RequestMapping(value = "/addAdvertisementftl" ,method = RequestMethod.GET)
    public ModelAndView addAdvertisement(){
        return createView("advertisement/addAdvertisement");
    }
}
