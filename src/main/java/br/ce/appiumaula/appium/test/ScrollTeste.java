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
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@text='Formul�rio']")));
		menu.scroll(0.9, 0.1);
		
		menu.clickText("Op��o bem escondida");
		
		Assert.assertEquals("Voc� achou essa op��o", menu.mensagemAlerta());
		
		menu.clickText("OK");
	}

}
