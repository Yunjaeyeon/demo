package com.example.demo.ibatis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter@Setter@ToString
@AllArgsConstructor
public class TestEntity {

    private String id;
    private String username;
    private int age;

    //중복없게 만들기
    public  TestEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
