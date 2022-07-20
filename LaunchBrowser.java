package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals("Logout")) {
			System.out.println("Successfully logged in");
		}
		//Click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		//Click Create Leads link
		driver.findElement(By.linkText("Create Lead")).click();
		//Input the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Input thee first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepthi");
		//Input the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thimma");
		//Input the firstname_local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deeps");
		//Input the department name
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		//Input the description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Friends fanatic and artistic person");
		//Input the mail-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deep123@gmail.com");
		//Select the Province
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown1);
		//Select the CIty
		select.selectByVisibleText("New York");
		//Click the submit button
		driver.findElement(By.className("smallSubmit")).click();
		//Get and print the title of the page
		String title = driver.getTitle();
		System.out.println("Title is " + title);
	}

}
