package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author jack
 * @email jack@atguigu.com
 * @date 2019-08-01 20:50:06
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
