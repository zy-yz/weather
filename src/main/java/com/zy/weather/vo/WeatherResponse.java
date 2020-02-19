package com.zy.weather.vo;

import lombok.Data;

import java.io.Serializable;


/**
 * 未来天气
 * */
@Data
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private Weather data;
    private Integer status;
    private String desc;
}