package org.starrier.dreamwar.common.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.starrier.dreamwar.common.entity.SysLogEntity;

/**
 * 系统日志
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
@MapperScan
public interface SysLogMapper extends BaseMapper<SysLogEntity> {

    int batchRemoveAll();

}