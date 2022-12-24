package com.example.demo.ibatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //이 인터페이스의 의존서을 마이바티스에게 위임(TestEntity)
public interface TestRepository {

    //데이터 저장 기능, 저장할 값이 여러개일때는 하나의 객체로 만들어 저장
    boolean save(TestEntity entity);


    //데이터 수정 기능
    boolean modify(TestEntity entity);


    //데이터 삭제 기능 (pk값으로 삭제)
    boolean remove(String id);


    //데이터 전체 조회 기능 (리스트로 처리)
    List<TestEntity> findAll();


}
