package a_selenium_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.Windows;

public class CaptureAllElements {
	
	WebDriver driver;
@Test(enabled=false)
public void allelements(){
	
	ArrayList al=new ArrayList();
	
	al.add(null);
	al.addAll(null);
	
	al.remove(null);
	al.removeAll(null);
	
	al.size();
	al.set(0,null);
	
	al.isEmpty();
	al.clear();
	
	al.contains(null);
	al.containsAll(null);
	
	
}
@BeforeTest
public void init(){
	
	driver=new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
//	driver.navigate().to("");
	WebElement webele=driver.findElement(null);
	
//	ACTIONS CLASS
	
	Actions obj=new Actions(driver);
//	obj.
	
	
//	  JAVASCRIPTEXECUTOR 
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)","");  // scroll down
	js.executeScript("window.scrollBy(0,-250)", ""); // scroll up
    js.executeScript("window.scrollBY(0,250);");//also works
    js.executeScript("aruguments[0].scrollIntoView(true);", webele); // scroll to a particular ele visible
//   if u dont know coordinates for scrolling till the bottom of the page
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
    
//    Alert class
    Alert al=driver.switchTo().alert();
    al.getText();
    al.accept();
    al.dismiss();
    al.sendKeys("");
    al.authenticateUsing(null);
    al.setCredentials(null);

    
//     active element example
    
    driver.switchTo().activeElement().sendKeys("example@gmail.com");
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    driver.switchTo().activeElement().sendKeys("Password");
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    driver.switchTo().activeElement().click();
    
}
@Test(enabled=true)
public void allLinks_verify() throws IOException{
	
	List<WebElement>links=driver.findElements(By.tagName("a"));

	System.out.println("Total links:"+links.size());	
//	for(WebElement link:links){
	for(int i=0;i<links.size();i++){
		
		WebElement ele=links.get(i);
		String linktext=ele.getAttribute("href");
		String text=ele.getText();
		verifyLinkActive(linktext,text);
	}
}	
public void verifyLinkActive(String linkUrl,String text){ 
    try 
{ 
         URL url = new URL(linkUrl); 
         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection(); 
         httpURLConnect.setConnectTimeout(3000); 
         httpURLConnect.connect(); 
      
         if(httpURLConnect.getResponseCode()==200) 
       { 
 System.out.println(linkUrl+"---"+text+"--"+httpURLConnect.getResponseMessage()); 
        } 
      if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)   
       { 
System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND); 
        }}
      catch(Exception e){}
    
} 
@Test(enabled=false)
public void dropdown()  {
// this code printing all the values in the dropdown but 
//i want only the elements for a particular select so
//	count the no.of dropdowns in an page
//	then all the elements one by one
	

	int dcount=driver.findElements(By.tagName("select")).size();
	System.out.println("Total dropdowns:"+dcount);
	if(dcount==0){
		System.out.println("No dropdowns.");
	}else{
	boolean v=driver.findElement(By.id("Adults")).isDisplayed();
	if(v){
//	if(driver.findElement(By.id("Adults")) != null){
		System.out.println("printing all the elements");
		List<WebElement>ele=driver.findElements(By.tagName("option"));
		for(WebElement e:ele){
			System.out.print(e.getText()+",");			
		}
	}
	else{  System.out.println("no such dropdown");	 }
	}
	
}
@Test(enabled=false)
public void dropdownSpecific(){
	
//	print total count of dropdowns
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement> count=driver.findElements(By.tagName("select"));
	System.out.println("Total no.of dropdowns:"+count.size());
	
//	find only Adults dropdown ele
	boolean find=driver.findElement(By.id("Adults")).isDisplayed();
	String  name=driver.findElement(By.id("Adults")).getAttribute("name");	
	
	if(find){
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='Adults']/option"));
		System.out.println("Elements present in "+name+" dropdown are :");

// selecting alternative options in dropdown
	  for(int i=0;i<list.size();i=i+2){
		 
		  WebElement ele=list.get(i);
		  System.out.print(ele.getText()+",");
		   
	        }	
	  System.out.println(" ");
	}
	
//	find only children dd
	boolean find_child=driver.findElement(By.id("Childrens")).isDisplayed();
	String  name_child=driver.findElement(By.id("Childrens")).getAttribute("name");	
	
	if(find_child){
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='Childrens']/option"));
		System.out.println("Elements present in "+name_child+" dropdown are :");
		for(WebElement e:list){ System.out.print(e.getText()+","); 	}
		System.out.println(" ");
	}
//	find only infants dd
	boolean find_infant=driver.findElement(By.id("Infants")).isDisplayed();
	String  name_infant=driver.findElement(By.id("Infants")).getAttribute("name");	
	
	if(find_infant){
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='Infants']/option"));
		System.out.println("Elements present in "+name_infant+" dropdown are :");
		for(WebElement e:list){ System.out.print(e.getText()+","); 	}
		System.out.println(" ");

			       }
//	find only class of travel dd
	boolean find_travel=driver.findElement(By.id("Class")).isDisplayed();
	String  name_travel=driver.findElement(By.id("Class")).getAttribute("name");	
	
	if(find_travel){
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='Class']/option"));
		System.out.println("Elements present in "+name_travel+" dropdown are :");
		for(WebElement e:list){ System.out.print(e.getText()+","); 	}
		  System.out.println(" ");

			       }
}
@Test(enabled=false)
public void buttons(){
	
//	type=submit,type=button,<button /button>
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	List<WebElement>b=driver.findElements(By.tagName("button"));
	
	System.out.println("Page Title:"+driver.getTitle());
	
	System.out.println("Total buttons in this page:"+b.size());
	
	for(int i=1;i<b.size();i++){
		
		WebElement eachbutton=b.get(i); 
		System.out.println(eachbutton.getText());
	}
		
	
}
@Test(enabled=false)
public void radiobuttons_1(){
//	 it works in some pages only
	List<WebElement>ele= driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("Total radio buttons:"+ele.size());
	 
	  for(int i=1;i<ele.size();i++){
		  WebElement radio=ele.get(i);
		  
		  System.out.println(radio.getAttribute("value"));
	  }
}
@Test(enabled=false)
public void radio_2(){
//	perfect-works
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement>ele= driver.findElements(By.xpath("//input[@type='radio']/following::strong[1]"));
	System.out.println("Total radio buttons:"+ele.size());
	 
	      for(int i=1;i<ele.size();i++){
		  WebElement radio=ele.get(i);
		 System.out.println(radio.getText());
	  }
}
@Test(enabled=false)
public void checkbox(){
//	use http://demoqa.com/registration/
	
//	perfect
	
	List<WebElement>ele= driver.findElements(By.xpath("//input[@type='checkbox']/preceding::label[1]"));
	System.out.println("Total check buttons:"+ele.size());
	 
	      for(int i=0;i<ele.size();i++){
		  WebElement check=ele.get(i);
		 System.out.println(check.getText());
	  }
	
}
@Test(enabled=false)
public void webTableCapture(){
//	http://toolsqa.com/automation-practice-table/
//	count the rows,columns
//	capture all the table data
//	its not best way
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	System.out.println("----"+driver.getTitle()+"----");

	WebElement table=driver.findElement(By.xpath("//table[@summary='Sample Table']/caption/thead/tfoot/tbody"));
	System.out.println(table.isSelected());
	WebElement tcaption=driver.findElement(By.xpath("//table[@summary='Sample Table']/following::caption/strong[1]"));
	System.out.println("Table caption:"+tcaption.getText());
	
}
@Test
public void dropdownDuplicate_cognizant(){
//	asked in cognizant interview
//	imagine their is a list of several options and there is a name 'cognizant' duplicated 3 times...
//	so write a selenium snippet to select the 3rd time  of name- cognizant
	
	Select dd=new Select(driver.findElement(By.xpath("//select[@id='companynames']")));
	List<WebElement>options=dd.getOptions();
	int count=0;
	for(int i=0;i<options.size();i++){
		
		  if(options.get(i).toString()=="cognizant"){
			  
			    count++;
			    if(count==3){
			    	
			    	new Select(driver.findElement(By.xpath("//select[@id='companynames']/option"))).selectByIndex(i);
			    	break;
			    }
			  
		  }
	}
}
@Test
public void checkbox_Cognizant(){
// image a scenario there are check boxes in a web table ,
//	click the checkbox 'cognizant'if it is enabled only.
	
	WebElement table=driver.findElement(By.xpath("//table[@id='checktable']/tbody"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(WebElement eachrow:rows){
			List<WebElement>cols=eachrow.findElements(By.tagName("td"));
				for(WebElement eachcol:cols){
					
					WebElement IsEnabled=driver.findElement(By.xpath("//input[@type='checkbox']"));
					
					if(IsEnabled.isEnabled()){
					
					WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']/following::label[1]"));
						
					         if(checkbox.getText()=="cognizant"){
					        	 	checkbox.click();
					        	 	break;
					         }
						
					}
					
				}
		
	}
	
}
@Test
public void datepicker(){
	
}
@AfterTest
public void teardown(){
	
//	driver.quit();
	
	}
}


