package com.xmh.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author dinner
 * @description
 * @create 2021/8/18
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}