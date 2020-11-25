package com.jh.gulimail.coupon.controller;

import com.jh.common.utils.R;
import com.jh.gulimail.coupon.entity.CouponEntity;
import com.jh.gulimail.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/coupon")
public class TestController {
    @Autowired
    private CouponService couponService;
    @GetMapping(value = "feign")
    public R testFeign() {
        CouponEntity couponEntity=new CouponEntity();
        couponEntity.setId((long) 1);
        couponEntity.setCode("满100-10");
        couponService.save(couponEntity);
        CouponEntity coupon = couponService.getById(1);
        return R.ok(coupon.toString());
    }
}
