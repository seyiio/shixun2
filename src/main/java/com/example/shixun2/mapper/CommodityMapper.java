package com.example.shixun2.mapper;

import com.example.shixun2.bean.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {
    List<Commodity> getCommodityList();

    int addCommodity(Commodity commodity);

    void del(int id);

    int updCommodity(Commodity commodity);

    Commodity getCommodityById(int id);
}
