package com.xmh.gulimall.ware.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.xmh.common.to.SkuHasStockTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xmh.gulimall.ware.entity.WareSkuEntity;
import com.xmh.gulimall.ware.service.WareSkuService;
import com.xmh.common.utils.PageUtils;
import com.xmh.common.utils.R;



/**
 * 商品库存
 *
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 12:39:40
 */
@RestController
@RequestMapping("ware/waresku")
public class WareSkuController {
    @Autowired
    private WareSkuService wareSkuService;

    /**
     * 根据skuid，查询每个skuid下是否有库存
     */
    @PostMapping("/hasStock")
    //@RequiresPermissions("ware:waresku:list")
    public List<SkuHasStockTo> hasStock(@RequestBody List<Long> skuIds){
        List<SkuHasStockTo> skuHasStockTos = wareSkuService.getSkuHasStock(skuIds);
        return skuHasStockTos;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:waresku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:waresku:info")
    public R info(@PathVariable("id") Long id){
		WareSkuEntity wareSku = wareSkuService.getById(id);

        return R.ok().put("wareSku", wareSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:waresku:save")
    public R save(@RequestBody WareSkuEntity wareSku){
		wareSkuService.save(wareSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:waresku:update")
    public R update(@RequestBody WareSkuEntity wareSku){
		wareSkuService.updateById(wareSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:waresku:delete")
    public R delete(@RequestBody Long[] ids){
		wareSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
