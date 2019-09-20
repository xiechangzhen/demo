package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    //@GetMapping("/reg.do")
    public String handleReg(@RequestParam("name") String name){
        System.out.println("login:"+name);
        return "success.html";
    }

    @RequestMapping(value = "/reg.do",method = RequestMethod.POST)
    public Result handleReg2(@RequestParam("name") String name){
        System.out.println("reg"+name);
        Result r =  new Result();
        r.setData("success.html");
        return r;
    }

}
