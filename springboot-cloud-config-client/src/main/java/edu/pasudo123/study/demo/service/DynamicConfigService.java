package edu.pasudo123.study.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @RefreshScope 를 이용하여, Config server 에 반영된 부분이 client 까지 적용되도록 한다.
 */
@Service
@RefreshScope
public class DynamicConfigService {

    @Value("${buddha.profile:none-profile}") private String profile;
    @Value("${buddha.comment:none-comment}") private String comment;

    private static final Map<String, Object> STORE = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        STORE.put("profile", profile);
        STORE.put("comment", comment);
    }

    public Map<String, Object> getConfig() {
        return STORE;
    }
}
