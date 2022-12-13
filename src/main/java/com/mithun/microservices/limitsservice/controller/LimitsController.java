package com.mithun.microservices.limitsservice.controller;

import com.mithun.microservices.limitsservice.bean.Limits;
import com.mithun.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired // to automatically take the components from the below class
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
   // return new Limits(1,1000);
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
