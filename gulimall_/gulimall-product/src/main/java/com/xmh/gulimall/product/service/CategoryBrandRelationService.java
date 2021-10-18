package com.xmh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmh.common.utils.PageUtils;
import com.xmh.gulimall.product.entity.BrandEntity;
import com.xmh.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 09:56:23
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    List<BrandEntity> getBrandsByCatId(Long catId);

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);
}

