package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fblogin {
	// Develop the automation script using selenium
	public WebDriver driver;

	@Given("Open Chrome with FB URL")
	public void open_chrome_with_fb_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@And("USer type invald UN and PWSD")
	public void u_ser_type_invald_un_and_pwsd() {
		driver.findElement(By.id("email")).sendKeys("asfasfasf@sdgda.adfs");
		driver.findElement(By.name("pass")).sendKeys("adsasdg");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws Exception {
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
	}

	@Then("Application should display validation Message")
	public void application_should_display_validation_message() {

	}

	@And("USer type vald UN and PWSD")
	public void u_ser_type_vald_un_and_pwsd() {
		driver.findElement(By.id("email")).sendKeys("abctest@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dsyregfdhd");
	}

	@And("User enter invalid {string} and {string}")
    public void retest(String username,String password) throws Throwable
    {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);       
    }
	
}
