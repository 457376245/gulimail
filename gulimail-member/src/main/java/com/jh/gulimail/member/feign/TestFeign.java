package com.jh.gulimail.member.feign;

import com.jh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service("feign")
@FeignClient(value = "gulimall-coupon")
public interface TestFeign {
    @GetMapping(value = "/test/coupon/feign")
    public R testFeign();
}
