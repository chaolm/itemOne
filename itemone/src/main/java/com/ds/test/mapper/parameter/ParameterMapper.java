package com.ds.test.mapper.parameter;

import com.ds.test.dto.Parameter;
import com.ds.test.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface ParameterMapper {
    List<Parameter> getParameter();

    Parameter getParameterByParam(Map map);
}
