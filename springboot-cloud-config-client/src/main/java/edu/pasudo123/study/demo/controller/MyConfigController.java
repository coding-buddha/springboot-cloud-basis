package edu.pasudo123.study.demo.controller;

import edu.pasudo123.study.demo.service.DynamicConfigService;
import edu.pasudo123.study.demo.service.StaticConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MyConfigController {

    private final StaticConfigService staticConfigService;
    private final DynamicConfigService dynamicConfigService;

    @GetMapping("/static")
    public Map<String, Object> getConfigFromStatic() {
        return staticConfigService.getConfig();
    }

    @GetMapping("/dynamic")
    public Map<String, Object> getConfigFromDynamic() {
        return dynamicConfigService.getConfig();
    }
}
