package com.larry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hangyanjiang on 2017/6/14.
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
