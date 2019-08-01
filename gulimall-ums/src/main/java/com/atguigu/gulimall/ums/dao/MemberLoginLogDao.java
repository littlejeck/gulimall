package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author jack
 * @email jack@atguigu.com
 * @date 2019-08-01 21:19:45
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
