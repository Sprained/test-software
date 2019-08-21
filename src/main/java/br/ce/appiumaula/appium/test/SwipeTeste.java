package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.MenuPage;

public class SwipeTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void realizarSwipe() {
		menu.scroll(0.9, 0.5); //adaptar ou remover conforme o smartphone
		menu.acessarSwipe();
		
		//verificar texto
		Assert.assertTrue(menu.elementoTexto("a esquerda"));
		
		//swipe direita
		menu.swipeRight();
		
		//verificar texto
		Assert.assertTrue(menu.elementoTexto("E veja se"));
		
		//botao direito
		menu.clickText("›");
		
		//verificar texto
		Assert.assertTrue(menu.elementoTexto("Chegar até o fim!"));
		
		//swipe esquerda
		menu.swipeLeft();
		
		//botão esqueda
		menu.clickText("‹");
		
		//verificar texto
		Assert.assertTrue(menu.elementoTexto("a esquerda"));
	}

}
