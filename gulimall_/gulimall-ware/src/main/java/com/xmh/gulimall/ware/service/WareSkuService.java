package com.xmh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmh.common.to.SkuHasStockTo;
import com.xmh.common.utils.PageUtils;
import com.xmh.gulimall.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 12:39:40
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void addStock(Long skuId, Long wareId, String skuName, Integer skuNum);

    List<SkuHasStockTo> getSkuHasStock(List<Long> skuIds);
}

