package com.example.datastructure.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.example.datastructure.util.R;

@RestController
@RequestMapping(value ="/test")
public class helloWorldController {

    public static Map<Integer,Double> map1 = new HashMap<>();
    static Map<Integer,Double> map2 = new HashMap<>();
    Map<Integer,Double> map3 = new HashMap<>();

    @GetMapping(value = "/sale")
    public R <Map<?,?>> example1(Float money, String product){
        Map<Object, Object> map1 = new HashMap<>();
        System.out.println("product:"+ product);
        System.out.println("money:"+ money);
        map1.put(product, money);
        return R.success(map1);
    }

    @PostMapping(value = "/add")
    public R <Map<?,?>>  example2(Float money, String product){
    return R.success();
    }
}
