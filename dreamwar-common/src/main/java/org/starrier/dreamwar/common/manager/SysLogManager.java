package org.starrier.dreamwar.common.manager;

import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.common.entity.SysLogEntity;

import java.util.List;

/**
 * 系统日志
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
public interface SysLogManager {

    void saveLog(SysLogEntity log);

    List<SysLogEntity> listLog(Page<SysLogEntity> page, Query query);

    int batchRemove(Long[] id);

    int batchRemoveAll();

}