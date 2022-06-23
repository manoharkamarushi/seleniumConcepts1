package poi;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class myDataprovider {
	WebDriver driver;
	String url;
@Test(dataProvider="poiexcel")
public void myexcelread(String uname,String pwd){

	driver=new FirefoxDriver();
	
	driver.get(url);
	driver.findElement(By.id("id")).sendKeys(uname);
	driver.findElement(By.id("pwssd")).sendKeys(pwd);
	driver.findElement(By.xpath("//*[@id='login']")).click();
	
	Assert.assertTrue(driver.getTitle().contains("Dashboard"),"user unable to login with username"+uname+"");
}	

@DataProvider()
public Object[][] passdata() throws FileNotFoundException, IOException{
	
	MyPOI.readExcelFile("E:\\work space\\SELENIUM2\\SeleniumTraining_new\\Testdata\\myinputdata.xlsx");
	int rws=MyPOI.rowCount(0);
	
Object[][]data=new Object[rws][2];
	
	for(int i=0;i<rws;i++){
		data[i][1]=MyPOI.readData(0, rws, 1);
		data[i][2]=MyPOI.readData(0, rws, 2);
	}
	
	return data;
	
}
}
