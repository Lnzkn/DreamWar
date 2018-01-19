package org.starrier.dreamwar.common.service;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.R;
import org.starrier.dreamwar.common.entity.SysLogEntity;

import java.util.Map;

/**
 * 系统日志
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
public interface SysLogService {

    Page<SysLogEntity> listLog(Map<String, Object> params);

    R batchRemove(Long[] id);

    R batchRemoveAll();

}

