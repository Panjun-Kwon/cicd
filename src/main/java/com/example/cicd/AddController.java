package com.example.cicd;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String numberAdd1() {
        return "hello";
    }

    @GetMapping("/add")
    public int numberAdd(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        int num = add(n1, n2);
        return num;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }


}
