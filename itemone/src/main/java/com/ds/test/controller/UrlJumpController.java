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
@RequestMapping(value = "/jump")
public class UrlJumpController extends BaseController{

    @RequestMapping(value = "/loginToRegister" ,method = RequestMethod.GET)
    public ModelAndView loginToRegister(){
        return createView("user/registerUser");
    }
}
