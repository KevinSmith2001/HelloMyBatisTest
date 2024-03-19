package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    @Select("SELECT * FROM comment WHERE cid =#{cid}")
    public Comment findById(Integer id);
    @Insert("INSERT INTO comment(content,author,cid) " +
            "values (#{content},#{author},#{cid})")
    public int insertComment(Comment comment);
    @Update("UPDATE comment SET content=#{content} WHERE cid=#{cid}")
    public int updateComment(Comment comment);
    @Delete("DELETE FROM comment WHERE cid=#{cid}")
    public int deleteComment(Integer cid);
}
