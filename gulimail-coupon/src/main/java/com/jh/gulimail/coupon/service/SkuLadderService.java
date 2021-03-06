package com.jh.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jh.common.utils.PageUtils;
import com.jh.gulimail.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author JH
 * @email 457376245@qq.com
 * @date 2020-10-29 10:11:25
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

