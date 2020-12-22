package com.ds.test.mapper.advertisement;

import com.ds.test.dto.Advertisement;
import com.ds.test.dto.Recruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface AdvertisementMapper {
    /**
     * 获取广告、活动表
     * @param param
     * @return
     */
    List<Advertisement> getAdvertisementList(Map param);

    /**
     * 新增广告、活动表
     * @param advertisement
     * @return
     */
    int add(Advertisement advertisement);

    /**
     * 更新广告、活动表
     * @param advertisement
     * @return
     */
    int update(Advertisement advertisement);

}
