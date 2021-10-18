package com.xmh.gulimall.member.dao;

import com.xmh.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xmh
 * @email 1264551979@qq.com
 * @date 2021-07-27 12:26:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
