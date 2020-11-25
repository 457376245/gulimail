package com.jh.gulimail.order.dao;

import com.jh.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author JH
 * @email 457376245@qq.com
 * @date 2020-10-29 10:07:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
