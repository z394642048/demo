package com.thymeleaf.controller;

import com.thymeleaf.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by acer on 2017/12/15.
 */
@Controller
public class HelloController {

    @Autowired
    private Message message;

    @RequestMapping({"","/","index"})
    public String index(Model model){
        model.addAttribute("name","开户费的上课分号是款到发货");
        System.out.println(message.getId()+":"+message.getName()+":"+message.getContent());
        model.addAttribute("message",message);
        return "must";
    }
}
