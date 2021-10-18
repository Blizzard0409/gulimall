package com.xmh.gulimall.ware.service.impl;

import com.mysql.cj.util.StringUtils;
import com.xmh.gulimall.ware.constant.WareConstant;
import com.xmh.gulimall.ware.entity.PurchaseEntity;
import com.xmh.gulimall.ware.vo.MergeVo;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmh.common.utils.PageUtils;
import com.xmh.common.utils.Query;

import com.xmh.gulimall.ware.dao.PurchaseDetailDao;
import com.xmh.gulimall.ware.entity.PurchaseDetailEntity;
import com.xmh.gulimall.ware.service.PurchaseDetailService;
import org.springframework.transaction.annotation.Transactional;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<PurchaseDetailEntity> wrapper = new QueryWrapper<>();

        String key  = (String) params.get("key");
        if (!StringUtils.isNullOrEmpty(key)){
            wrapper.and(w -> {
               w.eq("sku_id", key).or().eq("purchase_id", key);
            });
        }

        String status  = (String) params.get("status");
        if (!StringUtils.isNullOrEmpty(status)){
            wrapper.eq("status", status);
        }

        String wareId  = (String) params.get("wareId");
        if (!StringUtils.isNullOrEmpty(wareId)){
            wrapper.eq("ware_id", wareId);
        }

        IPage<PurchaseDetailEntity> page = this.page(
                new Query<PurchaseDetailEntity>().getPage(params),
                wrapper
        );

        return new PageUtils(page);
    }


}