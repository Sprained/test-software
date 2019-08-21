package br.ce.appiumaula.appium.test;

import static br.ce.appiumaula.appium.core.DriverFactor.getDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.MenuPage;

public class ScrollTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void opcaoEscondida() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@text='Formulário']")));
		menu.scroll(0.9, 0.1);
		
		menu.clickText("Opção bem escondida");
		
		Assert.assertEquals("Você achou essa opção", menu.mensagemAlerta());
		
		menu.clickText("OK");
	}

}
