package com.springboot01.springboot.web;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
