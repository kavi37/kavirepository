package aaa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="extent/feature1.feature",glue="aaa",tags= {"@login"},plugin="json:target\\JsonReport.json")
public class class3 
{

}
