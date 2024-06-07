package com.example.restfulbooker.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"com.example.restfulbooker.stepdefinitions", "com.example.restfulbooker.hooks"},
        plugin = {"pretty", "html:target/cucumber"}
)
class Runner {
}