package org.starrier.dreamwar.quartz.task;

import org.springframework.stereotype.Component;

/**
 * 测试任务Author Starrier
 * @Time 2018/1/19.
 */
@Component("testTasl")
public class TestTask {
    public void test() {
        System.out.println("current timestapmp is :" + System.currentTimeMillis());
    }
}
