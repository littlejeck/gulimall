package com.atguigu.gulimall.sms.service;

import com.atguigu.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author jack
 * @email jack@atguigu.com
 * @date 2019-08-01 21:05:47
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

