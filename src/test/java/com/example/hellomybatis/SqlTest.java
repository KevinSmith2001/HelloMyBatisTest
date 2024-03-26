package com.example.hellomybatis;

import com.example.hellomybatis.entity.Article;
import com.example.hellomybatis.entity.Shop;
import com.example.hellomybatis.mapper.ArticleMapper;
import com.example.hellomybatis.mapper.SqlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SqlTest {
    @Autowired
    private SqlMapper sqlMapper;
    @Autowired
    private ArticleMapper articleMapper;
    //    @Test
//    void select(){
//        List<Shop> sqlSelect = sqlMapper.selectSql();
//        System.out.println(sqlSelect);
//        System.out.println("1==============1");
//    }
//    @Test
//    void select1(){
//        Shop sqlSelect = sqlMapper.selectSql1(2);
//        System.out.println(sqlSelect);
//        System.out.println("2==============2");
//    }
//    @Test
//    void select2(){
//        List<Article> sqlSelect = articleMapper.selectArticle1();
//        System.out.println(sqlSelect);
//    }
    @Test
    void select3(){
        Shop shop =new Shop();
        shop.setGoodsPrice(10);
        shop.setGoodsName("精华");
        List<Shop> sqlSelect = sqlMapper.selectSql3(shop);
        System.out.println(sqlSelect);
    }
}
