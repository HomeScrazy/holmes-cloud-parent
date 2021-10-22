package com.holmes.cloud.service.one.controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("service/one")
public class ServiceOneController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@RequestParam("name") String name) {
        return "Hello service one  " + name;
    }
}
