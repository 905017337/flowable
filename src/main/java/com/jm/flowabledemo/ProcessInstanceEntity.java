package com.jm.flowabledemo;

import lombok.Data;

@Data
public class ProcessInstanceEntity {
    String processInstanceId;
    String processDeploymentId;
    String activityId;
}
