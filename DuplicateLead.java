package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		//Calling WDM for the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the username and pwd using id locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the leads button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the Company name using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepthi");
		//Enter the last name using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thimma");
		//Enter First name(local) using any locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deeps");
		//Enter the department using any locator
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		//Description using any locator
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Friends fan");
		//Email using id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("12deep@gmail.com");
		//Select the province as NY using visble text
		WebElement  dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("New York");
		//Click Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		//Get and print the title of the page
		String title = driver.getTitle();
		System.out.println("Title "+title);
		//Click on duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//CLear the company name textbox
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//Enter new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BCBS");
		//Clear the firstname
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		//Enter the new first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dia");
		//Click create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		//Get the title
		String title1 = driver.getTitle();
		System.out.println("New Title is "+ title1);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
