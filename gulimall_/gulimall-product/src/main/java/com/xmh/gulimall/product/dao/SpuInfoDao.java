package com.xmh.gulimall.product.dao;

import com.xmh.gulimall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 * 
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 09:56:23
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void updataSpuStatus(@Param("spuId") Long spuId, @Param("code") int code);
}
