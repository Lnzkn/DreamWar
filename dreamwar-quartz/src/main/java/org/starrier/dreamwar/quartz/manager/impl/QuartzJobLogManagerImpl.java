package org.starrier.dreamwar.quartz.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.quartz.dao.QuartzJobLogMapper;
import org.starrier.dreamwar.quartz.entity.QuartzJobLogEntity;
import org.starrier.dreamwar.quartz.manager.QuartzJobLogManager;

import java.util.List;

/**
 * 定时任务日志
 *
 * @Author Starrier
 * @Time 2018/1/19.
 */
@Component("quartzJobLogManager")
public class QuartzJobLogManagerImpl implements QuartzJobLogManager {

    @Autowired
    private QuartzJobLogMapper quartzLobLogMapper;

    @Override
    public List<QuartzJobLogEntity> listForPage(Page<QuartzJobLogEntity> page, Query query) {
        return quartzLobLogMapper.listForPage(page, query);
    }

    @Override
    public int saveQuartzJobLog(QuartzJobLogEntity log) {
        return quartzLobLogMapper.save(log);
    }

    @Override
    public int batchRemove(Long[] id) {
        return quartzLobLogMapper.batchRemove(id);
    }

    @Override
    public int batchRemoveAll() {
        return quartzLobLogMapper.batchRemoveAll();
    }

}
