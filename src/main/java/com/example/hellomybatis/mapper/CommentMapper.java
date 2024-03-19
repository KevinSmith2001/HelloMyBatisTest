package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CommentMapper {
    @Select("SELECT * FROM comment WHERE cid =#{cid}")
    public Comment findById(Integer id);
    @Insert("INSERT INTO comment(content,author,cid)"+
    "values (#{content},#{aunthor},#{cid})")
    public int insertComment(Comment comment);
}
