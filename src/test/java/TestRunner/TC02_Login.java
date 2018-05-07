package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Feature",
glue="stepDef",
tags="@LoginFeature2"





)
public class TC02_Login extends AbstractTestNGCucumberTests{

}
