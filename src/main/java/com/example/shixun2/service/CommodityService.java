package com.example.shixun2.service;

import com.example.shixun2.bean.Commodity;

import java.util.Map;

public interface CommodityService {
    Map<String, Object> getCommodityList();

    int addCommodity(Commodity commodity);

    void del(int id);

    int updCommodity(Commodity commodity);

    Commodity getCommodityById(int id);
}
