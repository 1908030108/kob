package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//前后端不分离写法
@Controller
@RequestMapping("/pk/")  //副目录
public class IndexController {

    @RequestMapping("Index/")
    public  String index() {
        return "pk/Index.html";
    }
}
