package com.holmes.cloud.service.two;

import com.holmes.cloud.service.one.api.ServiceOneApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("service/two")
public class ServiceTwoController {

    @Autowired
    private ServiceOneApi serviceOneApi;

    @GetMapping(value = "/echo")
    public String echo(String name) {

        return "Hello service two Discovery " + serviceOneApi.echo(name);
    }
}
