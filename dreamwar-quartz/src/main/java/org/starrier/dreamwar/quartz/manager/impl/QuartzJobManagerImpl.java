package org.starrier.dreamwar.quartz.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.quartz.dao.QuartzJobMapper;
import org.starrier.dreamwar.quartz.entity.QuartzJobEntity;
import org.starrier.dreamwar.quartz.manager.QuartzJobManager;

import java.util.List;

/**
 * 定时任务
 *
 * @Author Starrier
 * @Time 2018/1/19.
 */
@Component("quartzJobManager")
public class QuartzJobManagerImpl implements QuartzJobManager {

    @Autowired
    private QuartzJobMapper quartzJobMapper;

    @Override
    public List<QuartzJobEntity> listNormalJob() {
        return quartzJobMapper.list();
    }

    @Override
    public List<QuartzJobEntity> listForPage(Page<QuartzJobEntity> page, Query query) {
        return quartzJobMapper.listForPage(page, query);
    }

    @Override
    public int saveQuartzJob(QuartzJobEntity job) {
        return quartzJobMapper.save(job);
    }

    @Override
    public QuartzJobEntity getQuartzJobById(Long jobId) {
        return quartzJobMapper.getObjectById(jobId);
    }

    @Override
    public int updateQuartzJob(QuartzJobEntity job) {
        return quartzJobMapper.update(job);
    }

    @Override
    public int batchRemoveQuartzJob(Long[] id) {
        return quartzJobMapper.batchRemove(id);
    }

    @Override
    public int batchUpdate(Long[] jobId, Integer status) {
        Query query = new Query();
        query.put("jobIdList", jobId);
        query.put("status", status);
        return quartzJobMapper.batchUpdate(query);
    }

}
