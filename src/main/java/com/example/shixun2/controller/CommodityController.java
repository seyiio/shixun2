package com.example.shixun2.controller;

import com.example.shixun2.bean.Commodity;
import com.example.shixun2.service.CommodityService;
import com.example.shixun2.util.Base64util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
    @RequestMapping("/getCommodityList")
    @ResponseBody
    public Map<String,Object> getCommodityList(){

        return commodityService.getCommodityList();
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/upload")
    @ResponseBody
    public Map<String,Object> upload(MultipartFile file) {
        String base64 = Base64util.converToBase64(file);
        HashMap<String,Object> map=new HashMap<>();
        map.put("img",base64);
        return  map;
    }
    @RequestMapping("/addCommodity")
    public String addCommodity(Commodity commodity){
        if (commodityService.addCommodity(commodity)>0)
            return "redirect:/user/index";
        return "redirect:/addCommodity";

    }
    @RequestMapping("/del")
    public String del(int id){
        commodityService.del(id);
        return "redirect:/user/index";
    }
    @RequestMapping("/upd")
    public ModelAndView upd(int id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("upd");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @RequestMapping("/updCommodity")
    public String upd(Commodity commodity){
        if (commodityService.updCommodity(commodity)>0)
            return "redirect:/user/index";
        return "redirect:/updCommodity";

    }
    @RequestMapping("/getCommodityById")
    @ResponseBody
    public Map<String,Object> getCommodityById(int id){
        Map<String,Object>map=new HashMap<>();
        Commodity commodity=commodityService.getCommodityById(id);
        map.put("data",commodity);
        return map;
    }

}
