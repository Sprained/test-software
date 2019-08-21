package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.MenuPage;
import br.ce.appiumaula.appium.pages.SwipeListPage;

public class SwipeListTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void swipeList() {
		menu.acessarSwipeList();
		
//		esperar(1000);
		page.swipeElementRight("Op��o 1");
		page.clickBotaoMais();
		Assert.assertTrue(page.elementoTexto("Op��o 1 (+)"));
		
		page.swipeElementRight("Op��o 4");
		page.clickText("(-)");
		Assert.assertTrue(page.elementoTexto("Op��o 4 (-)"));
		
		page.swipeElementLeft("Op��o 5 (-)");
		Assert.assertTrue(page.elementoTexto("Op��o 5"));
	}

}
