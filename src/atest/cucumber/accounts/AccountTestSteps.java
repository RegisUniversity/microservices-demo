package accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class AccountTestSteps {
	private static WebDriver driver = null;


	@Given("^User is on the demo page$")
	public void Enter_the_demo_page_url() throws Throwable {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("http://localhost:3333");
		throw new PendingException();
	}
	
	@When("^User navigates to the account by user page$")
	public void User_navigate_to_the_accountby_user_page() throws Throwable {
		driver.findElement(By.xpath(".//accounts/123456789")).click();
	    throw new PendingException();
	}

	@Then("^The account by user page is displayed$")
	public void The_account_by_user_page_is_displayed() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
}
