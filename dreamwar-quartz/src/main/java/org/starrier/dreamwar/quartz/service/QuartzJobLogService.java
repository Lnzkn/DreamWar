package org.starrier.dreamwar.quartz.service;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.R;
import org.starrier.dreamwar.quartz.entity.QuartzJobLogEntity;

import java.util.Map;

/**
 * @Author Starrier
 * @Time 2018/1/19.
 */
public interface QuartzJobLogService {

    Page<QuartzJobLogEntity> listForPage(Map<String, Object> params);

    R batchRemove(Long[] id);

    R batchRemoveAll();

}
