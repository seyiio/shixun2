package com.example.shixun2.service.impl;

import com.example.shixun2.bean.Commodity;
import com.example.shixun2.mapper.CommodityMapper;
import com.example.shixun2.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public Map<String, Object> getCommodityList() {
        List<Commodity> commodities=commodityMapper.getCommodityList();
        Map<String,Object> map=new HashMap<>();
        map.put("data",commodities);
        return map;
    }

    @Override
    public int addCommodity(Commodity commodity) {
        return commodityMapper.addCommodity(commodity);
    }

    @Override
    public void del(int id) {
        commodityMapper.del(id);
    }

    @Override
    public int updCommodity(Commodity commodity) {
        return commodityMapper.updCommodity(commodity);
    }

    @Override
    public Commodity getCommodityById(int id) {
        return commodityMapper.getCommodityById(id);
    }

}
