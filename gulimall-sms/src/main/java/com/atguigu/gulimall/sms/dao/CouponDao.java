package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jack
 * @email jack@atguigu.com
 * @date 2019-08-01 21:05:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
