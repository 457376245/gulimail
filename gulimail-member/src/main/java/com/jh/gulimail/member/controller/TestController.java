package com.jh.gulimail.member.controller;

import com.jh.common.utils.R;
import com.jh.gulimail.member.feign.TestFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/test/member")
public class TestController {
    @Resource()
    private TestFeign Feign;

    @GetMapping(value = "/test/coupon/feign")
    public R testFeign(){
        return Feign.testFeign();
    }

}
