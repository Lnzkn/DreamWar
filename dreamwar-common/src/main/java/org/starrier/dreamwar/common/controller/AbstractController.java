package org.starrier.dreamwar.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.starrier.dreamwar.common.entity.SysUserEntity;
import org.starrier.dreamwar.common.utils.ShiroUtils;



/**
 * Controller Common 组件
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
public abstract class AbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected SysUserEntity getUser() {
        return ShiroUtils.getUserEntity();
    }

    protected Long getUseId() {
        return getUser().getUserId();
    }
}
