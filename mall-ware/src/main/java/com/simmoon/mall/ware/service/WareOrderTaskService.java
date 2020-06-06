package com.simmoon.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.simmoon.common.utils.PageUtils;
import com.simmoon.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 搴撳瓨宸ヤ綔鍗�
 *
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 09:36:21
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

