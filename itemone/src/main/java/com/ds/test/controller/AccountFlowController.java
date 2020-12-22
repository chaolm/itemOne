package com.ds.test.controller;

import com.ds.test.commonDto.ResultInfo;
import com.ds.test.dto.AccountFlow;
import com.ds.test.dto.Advertisement;
import com.ds.test.service.accountflow.AccountFlowService;
import com.ds.test.service.advertisement.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Controller
public class AccountFlowController extends BaseController{

    @Autowired
    private AccountFlowService accountFlowService;

    /**
     * 根据用户编码获取广告、活动表
     * @return
     */
    @RequestMapping(value = "/getAccountFlowList",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getAccountFlowList() {
        List<AccountFlow> advertisements = accountFlowService.getAccountFlowList();
        return returnSuccess(advertisements);

    }

    /**
     * 新增广告、活动表
     * @param accountFlow
     * @return
     */
    @RequestMapping(value = "/addAccountFlow",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addAccountFlow(@RequestBody AccountFlow accountFlow) {
        accountFlowService.addAccountFlow(accountFlow);
        return returnSuccess();
    }

    /**
     * 更新广告、活动表
     * @param accountFlow
     * @return
     */
    @RequestMapping(value = "/updateAccountFlow",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo updateAccountFlow(@RequestBody AccountFlow accountFlow) {
        accountFlowService.updateAccountFlow(accountFlow);
        return returnSuccess();

    }


}
