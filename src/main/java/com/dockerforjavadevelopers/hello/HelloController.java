package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        //return "I am using SSH keys for deploying images from Jenkins in Kubernetes cluster!!!!\n";
        System.out.println("I am using Github Webhook for Jenkins-Jira integration!!!");
    }
    
}
