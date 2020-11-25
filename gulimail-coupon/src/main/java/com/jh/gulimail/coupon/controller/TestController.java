package com.jh.gulimail.coupon.controller;

import com.jh.common.utils.R;
import com.jh.gulimail.coupon.entity.CouponEntity;
import com.jh.gulimail.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

@RestController
@RequestMapping("/test/coupon")
public class TestController {
    @Autowired
    private CouponService couponService;
    @Value("${server.port}")
    private String info;
    @GetMapping(value = "/feign")
    public R testFeign() {

        CouponEntity coupon = couponService.getById(1);
        return R.ok(coupon.toString());
    }
    @GetMapping(value = "/config")
    public R testConfig(){
        return R.ok(info);
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");

        //stream.forEach((s)-> System.out.println(s));
        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s1) {
                System.out.println(s1);
                return s1.length()>2;
            }
        };
        boolean b=test1("1ewq", stringPredicate);
        System.out.println(b);

    }
    public static Boolean test1(String s,Predicate<String > predicate){
        return predicate.test(s);
    }
}
