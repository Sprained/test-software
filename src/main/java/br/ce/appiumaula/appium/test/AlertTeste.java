package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.AlertPage;
import br.ce.appiumaula.appium.pages.MenuPage;

public class AlertTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertPage page = new AlertPage();
	
	@Before
	public void acessar() {
		menu.acessarAlerta();
	}
	
	@Test
	public void confirmarAlerta() {
		//alerta confirm
		page.alertaConfirm();
		
		//verificar textos
		Assert.assertEquals("Info", page.tituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.mensagemAlerta());
		
		//clicar em confirmar
		page.confirmar();
		
		// verificar nova mensagem
		Assert.assertEquals("Confirmado", page.mensagemAlerta());
		
		//sair
		page.sair();
	}
	
	@Test //clicar fora do popup de alerta
	public void clicarFora() {
		page.alertaSimples();
		
		esperar(1000); //atraso de 1s para o teste
		page.clickFora();
		
		//verificar popup desapareceu
		Assert.assertFalse(page.elementoTexto("Pode clicar no OK ou fora da caixa para sair"));
	}

}
