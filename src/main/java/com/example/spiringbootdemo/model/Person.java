package com.example.spiringbootdemo.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private int id;
    private String name;
    private List<String> hobby;
    private Map<String,Integer> map;
}
