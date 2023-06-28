package com.jm.flowabledemo.entity;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * @author caozhenhao
 * @version 1.0
 * @date 2023/6/28 21:14
 */

public class ManagerTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("经理");
    }

}
