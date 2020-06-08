package com.sun.mall.member.dao;

import com.sun.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sunyan
 * @email syan_2019@163.com
 * @date 2020-05-18 20:51:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
