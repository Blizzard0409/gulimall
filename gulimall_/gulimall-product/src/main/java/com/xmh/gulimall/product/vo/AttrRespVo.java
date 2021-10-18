package com.xmh.gulimall.product.vo;

import com.xmh.gulimall.product.entity.AttrEntity;
import lombok.Data;

/**
 * @author dinner
 * @description
 * @create 2021/8/8
 */
@Data
public class AttrRespVo extends AttrVo {
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
}