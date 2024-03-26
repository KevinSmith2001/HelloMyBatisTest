package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    public Article selectArticle(int aid);
    public int addArticle(Article article);
    public int update(Article article);
    public int delete(int aid);

}
