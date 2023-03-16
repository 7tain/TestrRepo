package com.aoptest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan({"com.aoptest.service","com.aoptest.msg"})
@EnableAspectJAutoProxy
public class AppConfig {
}
