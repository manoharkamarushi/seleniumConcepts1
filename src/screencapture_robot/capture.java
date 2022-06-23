package screencapture_robot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;


import org.openqa.selenium.WebDriver;

public class capture{// capture scrrenshots
	public static void alertScreenCapture(WebDriver driver, String fileName) throws Exception {
		try {
			// Time Stamp
			//java.text
			DateFormat df = new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");
			Date d = new Date(); // java util
			String Time = df.format(d);
			
			Robot r = new Robot();
			// get the window height and store in an integer
			int h = driver.manage().window().getSize().getHeight();
			// get window width and store in an integer
			int w = driver.manage().window().getSize().getWidth();
			// Take the screen shot and store in buffred image
			BufferedImage bi = r.createScreenCapture(new Rectangle(0, 0, h, w));
			// write the image to hard disc location
			// create the folder 'screen shots' in D drive
			
ImageIO.write(bi,"png", new File("D:\\screen shots\\" + fileName + Time + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

//	static boolean status = false;
}