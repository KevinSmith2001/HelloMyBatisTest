package com.example.hellomybatis;


import com.example.hellomybatis.entity.*;
import com.example.hellomybatis.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SqlTest{
    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    void contextLoads() {
    }
    @Test
    public void test1() {
        System.out.println(goodsMapper.selectOne());
    }
    @Test
    public void test2(){
        System.out.println(goodsMapper.selectTwo(1));
    }
    @Test
    public void test3() {
        System.out.println(goodsMapper.selectThree());
    }
}
