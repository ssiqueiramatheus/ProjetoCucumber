package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	final String CAMPODEBUSCA = "//*[@id='twotabsearchtextbox']";
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void realizaBusca(String produto) {
		
		driver.findElement(By.xpath(CAMPODEBUSCA)).sendKeys(produto);
		driver.findElement(By.xpath(CAMPODEBUSCA)).sendKeys(Keys.ENTER);
	}

}
