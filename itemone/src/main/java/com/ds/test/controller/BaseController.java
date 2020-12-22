package com.ds.test.controller;

import com.ds.test.commonDto.ResultInfo;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by liyou on 2017/9/5.
 */
public class BaseController {


    public ResultInfo returnSuccess(Object data) {
        ResultInfo result = new ResultInfo();
        result.setStatus(0);
        result.setBody(data);
        return result;
    }

    public ResultInfo returnFail(Object data,String message) {
        ResultInfo result = new ResultInfo();
        result.setStatus(1);
        result.setBody(data);
        result.setMessage(message);
        return result;
    }
    public ResultInfo returnFail(String message) {
        ResultInfo result = new ResultInfo();
        result.setStatus(1);
        result.setMessage(message);
        return result;
    }
    public ResultInfo returnSuccess() {
        ResultInfo result = new ResultInfo();
        result.setStatus(0);
        return result;
    }

    public ModelAndView createView(String viewName) {
        ModelAndView view = new ModelAndView(viewName);
        return view;
    }

    public ModelAndView createViewAndResult(String viewName,Object object,String objectName) {
        ModelAndView view = new ModelAndView(viewName);
        view.addObject(objectName,object);
        return view;
    }

}
