package com.thymeleaf.controller;

import com.thymeleaf.util.ConfigFile;
import com.thymeleaf.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by acer on 2017/12/15.
 */
@Controller
public class ConfigfileController {

    @Autowired
    private ConfigFile configFile;

    @RequestMapping("config")
    public String index(Model model){
        model.addAttribute("name","第欧根欧东方国际覆盖");
        System.out.println(configFile.getId()+"："+configFile.getName()+":"+configFile.getContent());
        model.addAttribute("config",configFile);
        return "config";
    }
}
