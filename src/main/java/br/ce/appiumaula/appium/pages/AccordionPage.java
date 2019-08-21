package br.ce.appiumaula.appium.pages;

import org.openqa.selenium.By;

import br.ce.appiumaula.appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	//abri opção 1
	public void selectOp1() {
		clickText("Opção 1");
	}
	
	//retorna valor da opção 1
	public String valorOp1() {
		return obterText(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}

}
