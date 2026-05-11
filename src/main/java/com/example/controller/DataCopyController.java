package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.DataCopyService;
import java.io.IOException;
import java.nio.file.Files;

@Controller
public class DataCopyController {
    
    @Autowired
    private DataCopyService dataCopyService;
    
    @RequestMapping("/")
    public @ResponseBody Resource servePage() {
        return new ClassPathResource("static/index.html");
    }
    
    @GetMapping("/copy-data")
    public @ResponseBody String copyData(@RequestParam String policyNumber, @RequestParam String sourceEnv,
    		@RequestParam String targetEnv,@RequestParam String policyPrefix) {
        dataCopyService.copyData(policyNumber,policyPrefix,sourceEnv,targetEnv);
        return "Data Copied Successfully";
    }
}
