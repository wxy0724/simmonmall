package com.simmoon.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.simmoon.common.utils.PageUtils;
import com.simmoon.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 閲囪喘淇℃伅
 *
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 09:36:21
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

