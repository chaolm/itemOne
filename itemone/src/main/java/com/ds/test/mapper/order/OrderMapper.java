package com.ds.test.mapper.order;

import com.ds.test.dto.Order;
import com.ds.test.dto.Parameter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface OrderMapper {
    /**
     * 获取订单表
     * @param order
     * @return
     */
    List<Order> getOrder(Order order);

    /**
     * 新增订单表
     * @param order
     * @return
     */
    int addOrder(Order order);

    /**
     * 更新订单表
     * @param order
     * @return
     */
    int updateOrder(Order order);

}
