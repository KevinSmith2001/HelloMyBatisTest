package com.example.hellomybatis;

import com.example.hellomybatis.entity.Article;
import com.example.hellomybatis.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloMybatisApplicationXMLTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void selectArticle(){
        Article articleSelect = articleMapper.selectArticle(1);
        System.out.println(articleSelect);
    }
    @Test
    void insertArticle(){
        Article add = new Article();
        add.setContent("aaa");
        add.setTitle("kkk");
        add.setAid(122);
        add.setTitlePic("222");
        articleMapper.addArticle(add);
    }
    @Test
    void updateArticle(){

        Article update = new Article();
        update.setTitle("title");
        update.setAid(122);
        articleMapper.update(update);
    }
    @Test
    void deleteArticle(){
        articleMapper.delete(12);
    }
}