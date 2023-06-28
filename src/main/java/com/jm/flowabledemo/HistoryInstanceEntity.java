package com.jm.flowabledemo;

import lombok.Data;

import java.util.Date;

@Data
public class HistoryInstanceEntity {
    String processInstanceId;
    String taskId;
    Date startTime;
    Date endTime;
}





