package com.simmoon.mall.product.dao;

import com.simmoon.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-03 22:33:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
