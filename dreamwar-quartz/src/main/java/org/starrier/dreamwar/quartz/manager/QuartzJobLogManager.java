package org.starrier.dreamwar.quartz.manager;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.quartz.entity.QuartzJobLogEntity;

import java.util.List;

/**
 * 定时任务日志
 *
 * @Author Starrier
 * @Time 2018/1/19.
 */
public interface QuartzJobLogManager {

    List<QuartzJobLogEntity> listForPage(Page<QuartzJobLogEntity> page, Query query);

    int saveQuartzJobLog(QuartzJobLogEntity log);

    int batchRemove(Long[] id);

    int batchRemoveAll();

}

