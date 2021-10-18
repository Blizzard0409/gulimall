package com.xmh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmh.common.utils.PageUtils;
import com.xmh.gulimall.ware.entity.PurchaseDetailEntity;
import com.xmh.gulimall.ware.vo.MergeVo;

import java.util.Map;

/**
 * 
 *
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 12:39:41
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

