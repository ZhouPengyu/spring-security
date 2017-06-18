package org.zyou.security;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping(value="/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
