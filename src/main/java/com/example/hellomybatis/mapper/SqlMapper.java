package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SqlMapper {
    public List<Shop> selectSql();
    public Shop selectSql1(int goodsId);
    public List<Shop>selectSql2();
    public List<Shop> selectSql3(Shop shop);
    public List<Shop> selectSql4(Shop shop);
}
