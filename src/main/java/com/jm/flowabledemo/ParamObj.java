package com.jm.flowabledemo;


import lombok.Data;

@Data
public class ParamObj {
    //startProcess--the following 5 params
    String resourceId;
    String requestUser;
    String juniorAdmin;
    String seniorAdmin;
    String assignee;
    //handleTask--the following 3 params
    String comment;
    boolean approved;
    String taskId;
    //delete/get processInstance
    String processInstanceId;
    String deleteReason;

    //rollback
    String targetTaskKey;
}


