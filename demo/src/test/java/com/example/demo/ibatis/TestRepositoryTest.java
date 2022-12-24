package com.example.demo.ibatis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestRepositoryTest {

    @Autowired
    TestRepository repository;

    @Test
    @DisplayName("유저이름과 나이가 TBL_TEST 테이블에 저장되어야 한다")
    void saveTest() {
        //given : 테스트 상황에 주어질 데이터
        TestEntity entity = new TestEntity();
        entity.setUsername("김철수");
        entity.setAge(11);

        //when : 실제 테스트 실행 (repository에 저장)
        boolean flag = repository.save(entity);

        //then : 테스트 결과 단언 (id는 랜덤으로 만들어짐)
        assertTrue(flag);
        assertNotNull(entity.getId());
    }

    @Test
    @DisplayName("유저이름과 나이 수정")
    @Transactional
    @Rollback
    void modifyTest() {
        //given
        TestEntity entity = new TestEntity();
        entity.setUsername("최수정");
        entity.setAge(25);
        entity.setId("7ab29204-b0b5-414e-8ba4-4e7c0dbef918");

        //when
        boolean flag = repository.modify(entity);

        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("유저이름 삭제")
    @Transactional
    @Rollback
    void deleteTest() {
        //given
        String id = "7ab29204-b0b5-414e-8ba4-4e7c0dbef918";

        //when
        boolean flag = repository.remove(id);

        //then
        assertTrue(flag);
    }

    void findAll(){
        //given
        //when
        List<TestEntity> entityList = repository.findAll();

        //then
        System.out.println(entityList);
        assertEquals(2,entityList.size());
    }
}


