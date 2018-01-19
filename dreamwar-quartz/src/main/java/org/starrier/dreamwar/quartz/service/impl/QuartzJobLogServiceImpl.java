package org.starrier.dreamwar.quartz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.common.entity.R;
import org.starrier.dreamwar.common.utils.CommonUtils;
import org.starrier.dreamwar.quartz.entity.QuartzJobLogEntity;
import org.starrier.dreamwar.quartz.manager.QuartzJobLogManager;
import org.starrier.dreamwar.quartz.service.QuartzJobLogService;

import java.util.Map;

/**
 * @Author Starrier
 * @Time 2018/1/19.
 */
@Service("quartzJobLogService")
public class QuartzJobLogServiceImpl implements QuartzJobLogService {

    @Autowired
    private QuartzJobLogManager quartzJobLogManager;

    @Override
    public Page<QuartzJobLogEntity> listForPage(Map<String, Object> params) {
        Query query = new Query(params);
        Page<QuartzJobLogEntity> page = new Page<>(query);
        quartzJobLogManager.listForPage(page, query);
        return page;
    }

    @Override
    public R batchRemove(Long[] id) {
        int count = quartzJobLogManager.batchRemove(id);
        return CommonUtils.msg(id, count);
    }

    @Override
    public R batchRemoveAll() {
        int count = quartzJobLogManager.batchRemoveAll();
        return CommonUtils.msg(count);
    }

}