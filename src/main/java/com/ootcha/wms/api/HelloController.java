package com.ootcha.wms.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/hello")
public class HelloController {

    @GetMapping
    public String hello(){

        return "Hello-World22-22133";
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String,Object>> test(@RequestParam Map<String,Object> map){

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
