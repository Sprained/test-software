package br.ce.appiumaula.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.appiumaula.appium.core.BasePage;
import br.ce.appiumaula.appium.core.DriverFactor;

public class SplashPage extends BasePage {
	
	public boolean isSplash() {
		return elementoTexto("Splash!");
	}
	
	public void aguardarSplash() {
		WebDriverWait wait = new WebDriverWait(DriverFactor.getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
	}

}
