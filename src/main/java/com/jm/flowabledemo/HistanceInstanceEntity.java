package com.jm.flowabledemo;

import lombok.Data;

import java.util.Date;

@Data
public class HistanceInstanceEntity {
    private String processInstanceId;
    private String taskId;

    private Date startTime;

    private Date endTime;
}
