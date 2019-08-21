package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.MenuPage;
import br.ce.appiumaula.appium.pages.SplashPage;

public class SplashTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void aguardarSplash() {
		//abrir splash
		menu.acessarSplah();
		
		//verificar splash
		page.isSplash();
		
		//aguardar saida da splash
		page.aguardarSplash();
		
		//verificar splash
		Assert.assertTrue(page.elementoTexto("Formulário"));
	}

}
