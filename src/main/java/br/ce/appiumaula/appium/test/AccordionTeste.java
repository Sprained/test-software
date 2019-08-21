package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.AccordionPage;
import br.ce.appiumaula.appium.pages.MenuPage;

public class AccordionTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void interagirAccordion() {
		//acessar menu
		menu.acessarAccordion();
		
		//clicar op 1
		page.selectOp1();
		
		//verificar op 1
		esperar(1000);
		Assert.assertEquals("Esta é a descrição da opção 1", page.valorOp1());
		
	}

}
