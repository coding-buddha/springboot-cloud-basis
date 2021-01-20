package edu.pasudo123.study.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StaticConfigService {

    @Value("${buddha.profile:none}") private String profile;
    @Value("${buddha.comment:none}") private String comment;

    private static final Map<String, Object> STORE = new ConcurrentHashMap<>();

    public Map<String, Object> getConfig() {
        STORE.put("profile", profile);
        STORE.put("comment", comment);
        return STORE;
    }
}
