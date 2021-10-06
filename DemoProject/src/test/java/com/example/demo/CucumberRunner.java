package com.example.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/example/demo/features"}
		,glue={"src/test/java/com/example/demo"}
		)

public class CucumberRunner {
	
}