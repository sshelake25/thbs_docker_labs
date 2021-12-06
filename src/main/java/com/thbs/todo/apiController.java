package com.thbs.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController 
public class apiController {

    @GetMapping("/employees")
    public String getApi()  {
        return "testing api";
    }
}

