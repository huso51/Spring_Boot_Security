package com.huseyinaydin.springbootsecurity.com.huseyinaydin.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class HomeResource {
    //@GetMapping(path = "/")
    @RequestMapping(path = "/",method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView home(){
        //return "<h1>Hoş geldiniz</h1>";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.jsp");
        double s1 = 10 + 2.7;
        modelAndView.addObject("toplam",s1);
        return modelAndView;
    }
    @GetMapping(path = "/user")
    public String user(){
        return "<h1>Hoş geldiniz sayın kullanıcı</h1>";
    }
    @GetMapping(path = "/admin")
    public String admin(){
        return "<h1>Hoş geldiniz sayın admin</h1>";
    }

}
