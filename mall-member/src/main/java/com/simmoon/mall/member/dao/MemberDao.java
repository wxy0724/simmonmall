package com.simmoon.mall.member.dao;

import com.simmoon.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 00:20:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
