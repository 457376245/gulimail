package com.jh.gulimail.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jh.common.utils.PageUtils;
import com.jh.common.utils.Query;

import com.jh.gulimail.product.dao.CategoryDao;
import com.jh.gulimail.product.entity.CategoryEntity;
import com.jh.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //找到1级菜单
        List<CategoryEntity> firstMenu = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map(menu ->{
            menu.setChildrens(getChildrens(menu,entities));
            return menu;
        }).collect(Collectors.toList());


        return entities;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前的菜单是否被别的地方所引用
        baseMapper.deleteBatchIds(asList);

    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream().filter(menu ->
                menu.getParentCid().equals(root.getCatId())).map(menu ->{
                    menu.setChildrens(getChildrens(menu,all));
                    return menu;
        }).collect(Collectors.toList());
        return collect;
    }

}