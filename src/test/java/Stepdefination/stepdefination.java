package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {
	WebDriver driver;
	

	@Given("^Open new the chrome and launch the application$")
	public void open_new_the_chrome_and_launch_the_application()  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/V1/index.php"); 
		 driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr490717");
		    driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("YdApedU");
		    driver.findElement(By.name("btnLogin")).click();
		    driver.close();
		
	}
	
	@When("^enter username and password$")
	public void enter_username_and_password()  {
	 System.out.println("enter uid and password");  
	    
	}

	@Then("^user succesfully redirect home page$")
	public void user_succesfully_redirect_home_page()  {
		
	    System.out.println("user succesfully redirect to home page");
	    
	}

	@When("^user succesfully lonch app$")
	public void user_succesfully_lonch_app()  {
	    System.out.println("user able to lonch app");
	    
	}

	@Then("^user is navigated to search results$")
	public void user_is_navigated_to_search_results()  {
		
	    System.out.println("close the application");
	    
	    
	}
	@Given("^Open new the chrome and launch the app$")
	public void open_new_the_chrome_and_launch_the_app()  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/");
		driver.close();
	    
	}

	@Given("^Open new the chrome and launch the application for reset password$")
	public void open_new_the_chrome_and_launch_the_application_for_reset_password()  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/V1/index.php"); 
		 driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr490717");
		    driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("pass");
		    driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[2]")).click();
		    driver.close();
	    
	}

	@When("^user succesfully lonch web app$")
	public void user_succesfully_lonch_web_app() throws Throwable {
	    System.out.println("user able to login ");

	}

	@Then("^user successfully land on reset password page$")
	public void user_successfully_land_on_reset_password_page() throws Throwable {
	    System.out.println("successfully land on reset password screen");
	   
	}

	@Given("^Open home new the chrome and launch the application$")
	public void open_home_new_the_chrome_and_launch_the_application()  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/V1/html/Managerhomepage.php");
	    String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).getText();
	    System.out.println(text);
	    driver.close();
	}

	@When("^get text$")
	public void get_text()  {
	    System.out.println("user get text guru99");
	   
	}

	@Then("^user succesfully close home page$")
	public void user_succesfully_close_home_page()  {
	    System.out.println("close app");
	   
	}

	@Given("^Open new the chrome for guru(\\d+) bank$")
	public void open_new_the_chrome_for_guru_bank(int arg1)  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/");
		
		String text2 =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/h2[1]")).getText();
		System.out.println("text2");
		driver.close();
	    
	}

	@When("^get text guru(\\d+) bank$")
	public void get_text_guru_bank(int arg1)  {
	    System.out.println("get text ");
	    
	}

	@Then("^user succesfully close home page one\\.$")
	public void user_succesfully_close_home_page_one()  {
	    System.out.println("close web Application");
	    
	}

	


	


}
