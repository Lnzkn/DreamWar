package org.starrier.aop;

import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;

public class FormService {
    private TransactionManager transactionManager;
    private PerformanceMonitor performanceMonitor;
    private TopicDao topicDao;
    private ForumDao forumDao;

    public void removeTopic(int topicId) {
        pmonitor.start();
    }
}