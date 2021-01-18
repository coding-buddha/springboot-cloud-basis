package edu.pasudo123.study.demo.config;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * external configuration
 * embeddable spring boot application using @EnableConfigServer
 */
@Configuration
@EnableConfigServer
public class ConfigEnableConfiguration {
}
