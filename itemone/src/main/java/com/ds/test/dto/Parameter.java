package com.ds.test.dto;

import com.ds.test.commonDto.BaseDto;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
public class Parameter extends BaseDto {
    private String paramId;
    private String paramName;
    private String paramValue;
    private String orgCode;

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
