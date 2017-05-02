package br.edu.ifes.serra.config;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/resources", glue = "br.edu.ifes.serra.controller")
public class CucumbRunnerTest {

}