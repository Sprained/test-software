package br.ce.appiumaula.appium.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@AfterClass
	public static void finalizar() {
		DriverFactor.killDriver();
	}
	
	@After
	public void tearDown() {
		screenShot();
		DriverFactor.getDriver().resetApp();
	}
	
	public void screenShot() {
		File img = ((TakesScreenshot) DriverFactor.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(img, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
