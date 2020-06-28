//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginDemoSteps2 {
//
//WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step - google browser is open");
//
//		String projectpath = System.getProperty("user.dir");
//
//		System.out.println(" Project path is:"+projectpath);
//
//
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		
////		driver.manage().window().maximize();
//		
//	}
//
//	
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	 driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys("NagarajSJ");
//		driver.findElement(By.id("password")).sendKeys("12345");
//		Thread.sleep(3000);
//		
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.id("login")).click();
//		
//	}
//	@Then("user is novigated to home page")
//	public void user_is_novigated_to_home_page() throws InterruptedException {
//		driver.findElement(By.id("logout")).isDisplayed();
//	
//		Thread.sleep(3000);
//		
//		driver.close();
//		driver.quit();
//	}
//
//
//
//}
