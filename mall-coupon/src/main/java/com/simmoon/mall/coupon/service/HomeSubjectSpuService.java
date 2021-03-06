package com.simmoon.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.simmoon.common.utils.PageUtils;
import com.simmoon.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 00:17:13
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

