package com.sun.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.common.utils.PageUtils;
import com.sun.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author sunyan
 * @email syan_2019@163.com
 * @date 2020-05-18 19:53:06
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

