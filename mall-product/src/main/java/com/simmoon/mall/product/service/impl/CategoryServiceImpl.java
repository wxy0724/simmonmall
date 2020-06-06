package com.simmoon.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.simmoon.common.utils.PageUtils;
import com.simmoon.common.utils.Query;

import com.simmoon.mall.product.dao.CategoryDao;
import com.simmoon.mall.product.entity.CategoryEntity;
import com.simmoon.mall.product.service.CategoryService;


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
        // 1. 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2. 组装成父子的树形结构
        if (entities != null && !entities.isEmpty()) {
            entities.stream()
                    .filter(item -> item.getParentCid() == 0)
                    .map(root -> {
                        root.setChildrenList(getChildrens(root, entities));
                        return root;
                    })
                    .sorted(Comparator.comparing(CategoryEntity::getSort,Comparator.nullsLast(Comparator.naturalOrder())))
                    .collect(Collectors.toList());

        }
        return entities;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity categoryEntity, List<CategoryEntity> allCategoryEntity) {
        return allCategoryEntity.stream()
                .filter(item -> categoryEntity.getCatId() == item.getParentCid())
                .map(menu -> {
                    menu.setChildrenList(getChildrens(menu, allCategoryEntity));
                    return menu;
                }).sorted(Comparator.comparing(CategoryEntity::getSort, Comparator.nullsLast(Comparator.naturalOrder())))
                .collect(Collectors.toList());
    }

}