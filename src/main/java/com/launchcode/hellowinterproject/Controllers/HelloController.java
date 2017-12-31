package com.launchcode.hellowinterproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //Use RequestMapping annotation on every controller method you want to respond to a request
    @RequestMapping(value="") //value specifies route to be mapped to controller method
    @ResponseBody
    public String index() {
        return "Hello Winter Project!";
    }

    @RequestMapping(value="goodbye")
    @ResponseBody
    public String goodbye() {
        return "goodbye";
    }

}
