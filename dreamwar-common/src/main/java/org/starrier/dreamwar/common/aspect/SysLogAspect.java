package org.starrier.dreamwar.common.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.starrier.dreamwar.common.manager.SysLogManager;

/**
 *  系统日志 切面处理类
 *
 * @Author Starrier
 * @Time 2018/1/18.
 */
@Aspect
@Component
public class SysLogAspect {

    @Autowired
    private SysLogManager sysLogManager;

    @Pointcut("@annotation(org.starrier.dreamwar.common.annotation.SysLog)")
    public void logPointCut() {

    }
}
