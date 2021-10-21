package com.holmes.cloud.service.one.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hesp-cloud-service-one"
        , path = "/service/one")
public interface HelloWorldApi {
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    String echo(@RequestParam("name") String name);
}
