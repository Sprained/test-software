package br.ce.appiumaula.appium.pages;

import br.ce.appiumaula.appium.core.BasePage;

public class AlertPage extends BasePage {
	
	//clicar no alerta confirm
	public void alertaConfirm() {
		clickText("ALERTA CONFIRM");
	}
	
	//clicar no alerta simples
	public void alertaSimples() {
		clickText("ALERTA SIMPLES");
	}
	
	//clicar em confirmar
	public void confirmar() {
		clickText("CONFIRMAR");
	}
	
	//clicar em sair
	public void sair() {
		clickText("SAIR");
	}

	//clicar fora do popup
	public void clickFora() {
		tap(100, 150);
	}
}
