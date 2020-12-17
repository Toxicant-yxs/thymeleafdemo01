package com.yxs.thymeleafdemo01.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yxs.thymeleafdemo01.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
public class ThymeleafController {
    @GetMapping("/index")
    public String indexPage(Model model) {
        System.out.println("进入控制层=========");
        model.addAttribute("msg","hello thymeleaf");
        return "index";
    }

    @GetMapping("/index2")
    public String indexPage2(Model model) {
        User lucy = new User(1001, "lucy", 10);
        model.addAttribute("user",lucy);
        Map map = new HashMap<>();
        map.put("pic1","j2.jpg");
        map.put("pic2","j3.jpg");
        map.put("pic3","j4.jpg");
        model.addAttribute("map",map);
        model.addAttribute("msg","welcome to thymeleaf");
        return "index2";
    }

    @GetMapping("/index3")
    public String indexPage3(Model model) {
        User lucy = new User(1001, "lucy", 10);
        User jack = new User(1002, "jack", 11);
        User tom = new User(1003, "tom", 12);
        User tim = new User(1004, "tim", 13);
        List list = new ArrayList<>();
        list.add(lucy);
        list.add(jack);
        list.add(tom);
        list.add(tim);
        model.addAttribute("list",list);
        return "index3";
    }

    @GetMapping("/index4")
    public String indexPage4(Model model) {
        model.addAttribute("userName","youdu");
        model.addAttribute("href","www.baidu.com");
        return "index4";
    }

    @GetMapping("/index5")
    public String indexPage5(Model model) {
        model.addAttribute("result","yes");
        model.addAttribute("menu","ii");
        model.addAttribute("manager","ii");
        return "index5";
    }

    @GetMapping("/index7")
    public String indexPage7(Model model) {
        //日期
        Date date = new Date();
        //字符串
        String str1 = "敖奉俊昊妇女违反叽歪飞机而我覅今晚";
        String str2 = "骄傲发呢哇哦凤凰网呢艾佛我就爱佛欸";
        //数字
        double price = 3.1415926;
        model.addAttribute("date",date);
        model.addAttribute("str1",str1);
        model.addAttribute("str2",str2);
        model.addAttribute("price",price);
        return "index7";
    }
}
