package com.example.demo;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes=DemoProjectApplication.class)
public class CucumberConfig {

}
