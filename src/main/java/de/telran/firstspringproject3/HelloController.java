package de.telran.firstspringproject3;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Привет, как дела, как жизнь?";
    }


    @GetMapping(value = "/calculator")
    public Integer calculate(@RequestParam(name = "first") Integer a, @RequestParam(name = "second") Integer b) {
        return a + b;
    }

    @GetMapping(value = "/what-is-your-name")
    public String sayYourName(@RequestParam(name = "name") String name, @RequestParam(name = "lang") String lang) {
        if (lang.equals("eng")) {
            return "Hello, " + name;
        }
        if (lang.equals("rus")) {
            return "Привет, " + name;
        }

        return "Привет всем";
    }




}
