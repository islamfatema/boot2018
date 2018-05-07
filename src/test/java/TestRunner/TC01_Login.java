package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Feature",
glue="stepDef",
tags="@LoginFeature1"




)
public class TC01_Login  extends AbstractTestNGCucumberTests{


}//end class
