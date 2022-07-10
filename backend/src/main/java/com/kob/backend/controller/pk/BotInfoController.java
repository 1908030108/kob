package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//前后端分离写法
@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getbotInfo/")
    public  Map<String, String> getBotInfo() {
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name", "tiger");
        bot1.put("rating", "15000");
        return bot1;
    }
}
