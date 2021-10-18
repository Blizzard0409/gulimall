package com.xmh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmh.common.utils.PageUtils;
import com.xmh.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 09:56:24
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> catIds);

    /*
     *找到catelogId的完整路径
     */
    Long[] findCatelogPath(Long catelogId);

    /*
    * 级联更新所有关联的数据
    */
    void updateCascade(CategoryEntity category);
}

