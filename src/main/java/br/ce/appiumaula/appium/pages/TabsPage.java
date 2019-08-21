package br.ce.appiumaula.appium.pages;

import br.ce.appiumaula.appium.core.BasePage;

public class TabsPage extends BasePage {
	
	//verificar conteudo da aba1
	public boolean isAba1() {
		return elementoTexto("Este é o conteúdo da Aba 1");
	}
	
	//verificar conteudo da aba2
	public boolean isAba2() {
		return elementoTexto("Este é o conteúdo da Aba 2");
	}
	
	public void clickAba2() {
		clickText("ABA 2");
	}

}
