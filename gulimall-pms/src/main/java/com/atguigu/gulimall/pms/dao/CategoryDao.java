package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jack
 * @email jack@atguigu.com
 * @date 2019-08-01 20:07:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
