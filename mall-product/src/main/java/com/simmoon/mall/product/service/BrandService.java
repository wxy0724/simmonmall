package com.simmoon.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.simmoon.common.utils.PageUtils;
import com.simmoon.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-03 22:33:38
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

