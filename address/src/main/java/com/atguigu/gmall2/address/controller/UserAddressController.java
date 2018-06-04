package com.atguigu.gmall2.address.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAddressController {

    @RequestMapping("index")
    public String index(){
        return "hello";
    }

}
