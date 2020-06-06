package com.simmoon.mall.order.dao;

import com.simmoon.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 09:31:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
