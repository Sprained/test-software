package br.ce.appiumaula.appium.pages;

import static br.ce.appiumaula.appium.core.DriverFactor.getDriver;

import org.openqa.selenium.By;

import br.ce.appiumaula.appium.core.BasePage;
import io.appium.java_client.TouchAction;

public class ClickPage extends BasePage {
	
	//realizar ação de click longo
	public void clickLongo() {
		new TouchAction(getDriver()).longPress(getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))).perform();
	}
	
	//buscar resposta do click longo por texto
	public String obterText() {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}

}
