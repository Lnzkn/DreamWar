package org.starrier.dreamwar.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.starrier.dreamwar.common.annotation.SysLog;
import org.starrier.dreamwar.common.entity.Page;
import org.starrier.dreamwar.common.entity.R;
import org.starrier.dreamwar.common.entity.SysLogEntity;
import org.starrier.dreamwar.common.service.SysLogService;

import java.util.Map;

/**
 * 系统日志
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
@RestController
@RequestMapping("/sys/log")
public class SysLogController extends AbstractController {

    @Autowired
    private SysLogService sysLogService;

    /**
     * 日志列表
     * @param params
     * @return
     */
    @RequestMapping("/list")
    public Page<SysLogEntity> listLog(@RequestBody Map<String, Object> params) {
        return sysLogService.listLog(params);
    }

    /**
     * 删除日志
     * @param id
     * @return
     */
    @SysLog("删除日志")
    @RequestMapping("/remove")
    public R batchRemove(@RequestBody Long[] id) {
        return sysLogService.batchRemove(id);
    }

    /**
     * 清空日志
     * @return
     */
    @SysLog("清空日志")
    @RequestMapping("/clear")
    public R batchRemoveAll() {
        return sysLogService.batchRemoveAll();
    }

}
