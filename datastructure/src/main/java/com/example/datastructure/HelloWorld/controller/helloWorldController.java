package com.example.datastructure.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value ="/test")
public class helloWorldController {
    Map<Object, Object> res = new HashMap<>();

    @GetMapping(value = "/sale")
    public Map<?, ?> example1(Float money, String product){
        Map<Object, Object> map1 = new HashMap<>();
        System.out.println("product:"+ product);
        System.out.println("money:"+ money);
        map1.put(product, money);
        res.put("code", 200);
        res.put("val", map1);
        return res;
    }

    @PostMapping(value = "/add")
    public Map<?, ?> example2(Float money, String product){
    return res;
    }
}
