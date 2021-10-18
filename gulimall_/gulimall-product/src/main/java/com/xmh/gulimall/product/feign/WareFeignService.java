package com.xmh.gulimall.product.feign;

import com.xmh.common.to.SkuHasStockTo;
import com.xmh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("gulimall-ware")
public interface WareFeignService {

    @PostMapping("/ware/waresku/hasStock")
    List<SkuHasStockTo> hasStock(@RequestBody List<Long> skuIds);

}
