package org.starrier.dreamwar.quartz.service;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.R;
import org.starrier.dreamwar.quartz.entity.QuartzJobEntity;

import java.util.Map;

/**
 * @Author Starrier
 * @Time 2018/1/19.
 */
public interface QuartzJobService {

    Page<QuartzJobEntity> list(Map<String, Object> params);

    R saveQuartzJob(QuartzJobEntity job);

    R getQuartzJobById(Long jobId);

    R updateQuartzJob(QuartzJobEntity job);

    R batchRemoveQuartzJob(Long[] id);

    R run(Long[] id);

    R pause(Long[] id);

    R resume(Long[] id);

}