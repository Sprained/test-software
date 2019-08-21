package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.MenuPage;
import br.ce.appiumaula.appium.pages.TabsPage;

public class TabsTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private TabsPage page = new TabsPage();
	
	@Test
	public void acessarAbas() {
		//acessar abas
		menu.acessarAbas();
		
		//verificar aba1
		Assert.assertTrue(page.isAba1());
		
		//mudar para aba2
		page.clickAba2();
		
		//verificar se ta na aba2
		Assert.assertTrue(page.isAba2());
	}

}
