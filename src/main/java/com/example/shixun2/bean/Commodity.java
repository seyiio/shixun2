package com.example.shixun2.bean;

import lombok.Data;

@Data
public class Commodity {
    private int id;
    private String commodity_name;
    private Double commodity_price;
    private String commodity_img;
    private String commodity_status;
    private Double commodity_num;
}
