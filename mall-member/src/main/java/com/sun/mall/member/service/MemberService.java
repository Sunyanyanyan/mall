package com.sun.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.common.utils.PageUtils;
import com.sun.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author sunyan
 * @email syan_2019@163.com
 * @date 2020-05-18 20:51:12
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

