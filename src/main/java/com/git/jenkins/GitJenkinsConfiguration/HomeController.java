package com.git.jenkins.GitJenkinsConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "WECLOME HOME FAAAL";
    }
    @GetMapping("/bello")
    public String home2(){
        return "BABABABABBABAB";
    }
    @GetMapping("/bingo")
    public String home3(){
        return "hello bingo";
    }
}
