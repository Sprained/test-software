package br.ce.appiumaula.appium.pages;

import org.openqa.selenium.By;

import br.ce.appiumaula.appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	//abri op��o 1
	public void selectOp1() {
		clickText("Op��o 1");
	}
	
	//retorna valor da op��o 1
	public String valorOp1() {
		return obterText(By.xpath("//*[@text='Op��o 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}

}
