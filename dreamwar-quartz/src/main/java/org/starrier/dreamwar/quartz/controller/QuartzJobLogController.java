package org.starrier.dreamwar.quartz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.starrier.dreamwar.common.annotation.SysLog;
import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.R;
import org.starrier.dreamwar.quartz.entity.QuartzJobLogEntity;
import org.starrier.dreamwar.quartz.service.QuartzJobLogService;

import java.util.Map;

/**
 * @Author Starrier
 * @Time 2018/1/18.
 */
@RestController
@RequestMapping("/quartz/job/log")
public class QuartzJobLogController {

    @Autowired
    private QuartzJobLogService quartzJobLogService;

    /**
     * 列表
     * @param params
     * @return
     */
    @RequestMapping("/list")
    public Page<QuartzJobLogEntity> list(@RequestBody Map<String, Object> params) {
        return quartzJobLogService.listForPage(params);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @SysLog("删除定时任务日志")
    @RequestMapping("/remove")
    public R batchRemove(@RequestBody Long[] id) {
        return quartzJobLogService.batchRemove(id);
    }

    /**
     * 清空
     * @return
     */
    @SysLog("清空定时任务日志")
    @RequestMapping("/clear")
    public R batchRemoveAll() {
        return quartzJobLogService.batchRemoveAll();
    }

}
