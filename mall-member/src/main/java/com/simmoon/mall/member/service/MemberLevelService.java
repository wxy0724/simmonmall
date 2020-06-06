package com.simmoon.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.simmoon.common.utils.PageUtils;
import com.simmoon.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 00:20:50
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

