package com.ranfordbank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	public static void main(String[] args)
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:////183.82.100.55/ranford2");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("jyothi");
		driver.findElement(By.id("txtAdd1")).sendKeys("karimnagar");
		driver.findElement(By.id("txtArea")).sendKeys("abcdef");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		Select ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		ctry.selectByVisibleText("INDIA");
		Sleeper.sleepTightInSeconds(5);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText("GOA");
		Sleeper.sleepTightInSeconds(5);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText("GOA");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("btn_insert")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.id("btnRoles")).click();
		driver.findElement(By.id("txtRname")).sendKeys("jyothi");
		driver.findElement(By.id("txtRDesc")).sendKeys("bdhbhdiushdij");
		Select rt=new Select(driver.findElement(By.id("lstRtypeN")));
		rt.selectByVisibleText("E");
		driver.findElement(By.id("btninsert" )).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath(".//*[@id='DGRoles']/tbody/tr[2]/td[2]")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.id(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.id("BtnNew")).click();
		driver.findElement(By.id("txtUname")).sendKeys("jyothi");
		driver.findElement(By.id("txtLpwd")).sendKeys("123456");
		Select role=new Select(driver.findElement(By.id("lst_Roles")));
		role.selectByVisibleText("accounting");
		Select branch=new Select(driver.findElement(By.id("lst_Branch")));
		branch.selectByVisibleText("jyothi");
		driver.findElement(By.id("BtnSubmit")).click();
		driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath(xpathExpression))
		
		
		
		
		
		
	}

}
