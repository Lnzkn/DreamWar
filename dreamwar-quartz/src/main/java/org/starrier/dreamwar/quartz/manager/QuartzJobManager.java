package org.starrier.dreamwar.quartz.manager;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.quartz.entity.QuartzJobEntity;

import java.util.List;

/**
 * 定时任务
 *
 * @Author Starrier
 * @Time 2018/1/19.
 */
public interface QuartzJobManager {

    List<QuartzJobEntity> listForPage(Page<QuartzJobEntity> page, Query query);

    List<QuartzJobEntity> listNormalJob();

    int saveQuartzJob(QuartzJobEntity job);

    QuartzJobEntity getQuartzJobById(Long jobId);

    int updateQuartzJob(QuartzJobEntity job);

    int batchRemoveQuartzJob(Long[] id);

    int batchUpdate(Long[] jobId, Integer status);

}
