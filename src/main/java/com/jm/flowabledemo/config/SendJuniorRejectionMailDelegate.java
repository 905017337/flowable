package com.jm.flowabledemo.config;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

@Slf4j
public class SendJuniorRejectionMailDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        String requestUser = (String) execution.getVariable("requestUser");
        String resourceId = (String) execution.getVariable("resourceId");
        System.out.println("SendJuniorRejectionMailDelegate");
        log.info("send approval success mail for user [" + requestUser + "] with apply resource [" + resourceId + "]");
    }
}
