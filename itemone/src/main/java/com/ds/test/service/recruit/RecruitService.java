package com.ds.test.service.recruit;

import com.ds.test.dto.Recruit;
import com.ds.test.dto.User;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
public interface RecruitService {

    void addRecruit(Recruit recruit);

    List<Recruit> getRecruitByParam(Map param);

    void updateRecruit(Recruit recruit);
}
