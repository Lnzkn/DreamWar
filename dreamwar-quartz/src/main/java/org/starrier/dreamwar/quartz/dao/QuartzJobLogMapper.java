package org.starrier.dreamwar.quartz.dao;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.quartz.entity.QuartzJobLogEntity;

import java.util.List;

/**
 * @Author Starrier
 * @Time 2018/1/18.
 */
public interface QuartzJobLogMapper {
    List<QuartzJobLogEntity> listForPage(Page<QuartzJobLogEntity> page, Query query);

    int batchRemoveAll();

    int batchRemove(Long[] id);

    int save(QuartzJobLogEntity log);
}


