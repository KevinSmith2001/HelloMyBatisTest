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
public void selectComment(){
    Comment comment = commentMapper.findById(1);
    System.out.println(comment);
}

}
