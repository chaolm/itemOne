package com.ds.test.mapper.recruit;

import com.ds.test.dto.Recruit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface RecruitMapper {

    void addRecruit(Recruit recruit);

    List<Recruit> getRecruitByParam(Map param);

    void updateRecruit(Recruit recruit);
}
