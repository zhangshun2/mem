package com.baizhi.mem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("index")
    public ModelAndView index(ModelAndView modelAndView) {

        modelAndView.setViewName("index2");
        modelAndView.addObject("zs", "杜梦媛");
        modelAndView.addObject("zs1", "熊琳");
        return modelAndView;
    }

    @RequestMapping("index2")
    public ModelAndView index2(ModelAndView modelAndView) {

        modelAndView.setViewName("index3");
        modelAndView.addObject("zs", "杜梦媛");
        modelAndView.addObject("zs1", "熊琳");
        return modelAndView;
    }
}
