package com.simbirsoft.kafkaconsumertest.model;

import lombok.Data;

@Data
public class EmployeeDTO {

    private String name;
    private String lastname;
    private Integer age;
    private Position position;
}
