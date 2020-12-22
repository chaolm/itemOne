package com.ds.test.service.advertisement;

import com.ds.test.dto.Advertisement;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
public interface AdvertisementService {
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
    void add(Advertisement advertisement);

    /**
     * 更新广告、活动表
     * @param advertisement
     * @return
     */
    void update(Advertisement advertisement);


}
