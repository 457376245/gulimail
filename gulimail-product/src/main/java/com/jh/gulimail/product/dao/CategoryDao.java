package com.jh.gulimail.product.dao;

import com.jh.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author JH
 * @email 457376245@qq.com
 * @date 2020-10-28 15:35:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
