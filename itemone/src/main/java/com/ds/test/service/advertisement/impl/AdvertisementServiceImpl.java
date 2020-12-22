package com.ds.test.service.advertisement.impl;

import com.ds.test.dto.Advertisement;
import com.ds.test.dto.Order;
import com.ds.test.dto.User;
import com.ds.test.exception.ServiceException;
import com.ds.test.mapper.advertisement.AdvertisementMapper;
import com.ds.test.mapper.order.OrderMapper;
import com.ds.test.mapper.user.UserMapper;
import com.ds.test.service.advertisement.AdvertisementService;
import com.ds.test.until.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;
    /**
     * 获取广告、活动表
     * @param param
     * @return
     */
    @Override
    public List<Advertisement> getAdvertisementList(Map param) {
        return advertisementMapper.getAdvertisementList(param);
    }

    /**
     * 新增广告、活动表
     * @param advertisement
     * @return
     */
    @Override
    @Transactional
    public void add(Advertisement advertisement) {
        //业务层设置主键值
        String itemId = StringUtil.getUUID();
        advertisement.setAdvertisementId(itemId);
        advertisementMapper.add(advertisement);
        Order order = new Order();
        order.setOrderId(StringUtil.getUUID());
        order.setUserCode(advertisement.getUserCode());
        order.setItemId(itemId);
        order.setItemMainTitle("主图片地址");
        order.setOrderType(2);
        order.setPayMoney(advertisement.getNeedMoney());
        order.setHangStartTime(advertisement.getHangStartTime());
        order.setHangEndTime(advertisement.getHangEndTime());
        order.setPayType(1);
        order.setOrgCode(advertisement.getOrgCode());
        orderMapper.addOrder(order);
        User user = new User();
        user.setUserCode(advertisement.getUserCode());
        //更新用户为发布者
        user.setUserType(1);
        userMapper.updateUser(user);
    }

    /**
     * 更新广告、活动表
     * @param advertisement
     * @return
     */
    @Override
    @Transactional
    public void update(Advertisement advertisement) {
        if(StringUtil.isBlank(advertisement.getAdvertisementId())){
            throw new ServiceException("广告id不允许为空！");
        }
        //修改悬挂时间 要与订单去结合操作 代做
        advertisementMapper.update(advertisement);
    }


}
