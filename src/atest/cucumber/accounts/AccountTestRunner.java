package accounts;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "target/test-classes/accounts"
		,glue={"stepDefinition"}
		)

public class AccountTestRunner {

}