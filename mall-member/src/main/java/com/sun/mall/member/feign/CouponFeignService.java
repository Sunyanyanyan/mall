package com.sun.mall.member.feign;

import com.sun.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 这是一个声明式的远程调用
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
