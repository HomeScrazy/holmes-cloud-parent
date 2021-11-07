package com.holmes.cloud.service.one.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("service/one")
@Slf4j
public class ServiceOneController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@RequestParam("name") String name) {
        log.info("print a simple log in service ont");
        return "Hello service one  " + name;
    }
}
