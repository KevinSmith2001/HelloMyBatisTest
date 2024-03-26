package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.Goods;
import com.example.hellomybatis.mapper.GoodsMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsMapper {
    public List<Goods> selectOne();
    public Goods selectTwo(int goodsId);
    public List<Goods> selectThree();

}
