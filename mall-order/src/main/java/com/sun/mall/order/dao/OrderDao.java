package com.sun.mall.order.dao;

import com.sun.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunyan
 * @email syan_2019@163.com
 * @date 2020-05-18 20:58:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
