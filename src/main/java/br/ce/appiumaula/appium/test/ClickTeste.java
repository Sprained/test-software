package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.ClickPage;
import br.ce.appiumaula.appium.pages.MenuPage;

public class ClickTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private ClickPage page = new ClickPage();
	
	@Before
	public void acessarCliques() {
		menu.acessarCliques();
	}
	
	@Test
	public void clickLongo() {
		page.clickLongo();
		
		Assert.assertEquals("Clique Longo", page.obterText());
	}
	
	@Test
	public void clickDuplo() {
		page.clickText("Clique duplo");
		page.clickText("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterText());
	}

}
