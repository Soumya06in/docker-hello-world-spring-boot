package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        //return "I am using SSH keys for deploying images from Jenkins in Kubernetes cluster!!!!\n";
        retun "I am using Github Webhook for Jenkins-Jira integration. I made a small change. Test it now!!!\n";
    }
    
}
