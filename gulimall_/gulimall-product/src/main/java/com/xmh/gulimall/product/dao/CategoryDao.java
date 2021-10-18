package com.xmh.gulimall.product.dao;

import com.xmh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 09:56:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
