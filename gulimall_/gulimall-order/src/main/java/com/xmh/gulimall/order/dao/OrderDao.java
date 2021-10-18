package com.xmh.gulimall.order.dao;

import com.xmh.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 12:32:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
