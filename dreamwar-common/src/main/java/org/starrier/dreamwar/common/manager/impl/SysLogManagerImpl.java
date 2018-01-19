package org.starrier.dreamwar.common.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.starrier.dreamwar.common.dao.SysLogMapper;
import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.Query;
import org.starrier.dreamwar.common.entity.SysLogEntity;
import org.starrier.dreamwar.common.manager.SysLogManager;

import java.util.List;

/**
 * 系统日志
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
@Component("sysLogManager")
public class SysLogManagerImpl implements SysLogManager {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public void saveLog(SysLogEntity log) {
        sysLogMapper.save(log);
    }

    @Override
    public List<SysLogEntity> listLog(Page<SysLogEntity> page, Query query) {
        return sysLogMapper.listForPage(page, query);
    }

    @Override
    public int batchRemove(Long[] id) {
        return sysLogMapper.batchRemove(id);
    }

    @Override
    public int batchRemoveAll() {
        return sysLogMapper.batchRemoveAll();
    }

}