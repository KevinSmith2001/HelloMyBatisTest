package com.example.hellomybatis;

import com.example.hellomybatis.entity.Comment;
import com.example.hellomybatis.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloMyBatisApplicationTests {
    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void selectComment() {
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);}
    @Test
    public void insertComment() {
        Comment c = new Comment();
        c.setCid(6);
        c.setAuthor("小明");
        c.setContent("好好学习");
        commentMapper.insertComment(c);

        Comment c1 = new Comment();
        c1.setCid(7);
        c1.setAuthor("小刚");
        c1.setContent("好好学习");
        commentMapper.insertComment(c1);

    }
    @Test
    public void deletetComment() {
        commentMapper.deleteComment(6);
    }
    @Test
    public void updateComment() {
        Comment c1 = new Comment();
        c1.setCid(7);
        c1.setAuthor("小hong");
        c1.setContent("好好学习tiant123 ");
        commentMapper.updateComment(c1);
    }}