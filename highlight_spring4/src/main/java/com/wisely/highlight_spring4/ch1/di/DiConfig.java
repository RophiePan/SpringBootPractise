package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //1配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di") //2 自动扫描包名下所有使用@Service, @Component, @Repository, @Controller
public class DiConfig {

}
