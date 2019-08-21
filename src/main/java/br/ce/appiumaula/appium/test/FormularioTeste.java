package br.ce.appiumaula.appium.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.core.DriverFactor;
import br.ce.appiumaula.appium.pages.FormularioPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormularioTeste extends BaseTest {
	
	private AndroidDriver<MobileElement> driver;
	
	private FormularioPage formPage = new FormularioPage();
	
	@Before
	public void drvierAppium() throws MalformedURLException {
		driver = DriverFactor.getDriver();
	}
	
	@Test
	//Preencher campo text
	public void preencherCampo() throws MalformedURLException {
	    //entrar no formulario
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Formulário']")).click();
	    
	    //escrever nome
		formPage.escreverNome("Lucifer");
	    
	    //checar nome escrito
	    assertEquals("Lucifer", formPage.obterNome());
	}
	
	@Test
	//interagir com comb box
	public void comboBox() throws MalformedURLException {
	    //entrar no formulario
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Formulário']")).click();
	    
	    //abrir combo
	    formPage.selectCombo("Nintendo Switch");
	    
	    //verificar opção
	    assertEquals("Nintendo Switch", formPage.valorCombo());
	}
	
	@Test
	//interagir com switch e check box
	public void switchChekBox() throws MalformedURLException {
	    //entrar no formulario
	    driver.findElement(MobileBy.xpath("//*[@text='Formulário']")).click();
	    
	    //verificar estatus do elemento
	    assertFalse(formPage.isCheck());
	    assertTrue(formPage.isSwitch());
	    
	    //interagir com elemento
	    formPage.clickCheck();
	    formPage.clickSwitch();
	    
	    //verificar estatus alterado
	    assertTrue(formPage.isCheck());
	    assertFalse(formPage.isSwitch());
	}
	
	@Test
	//desafio
	public void desafio() throws MalformedURLException {
	    //entrar no formulario
	    driver.findElement(MobileBy.xpath("//*[@text='Formulário']")).click();
	    
	    //preencher text com nome
	    MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
	    campoNome.sendKeys("Desafio");
	    
	    //abrir combo
	    driver.findElement(MobileBy.AccessibilityId("console")).click();
	    
	    //selecionar opção
	    driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']")).click();
	    
	    //verificar estatus do elemento
	    MobileElement checkBox = driver.findElement(By.className("android.widget.CheckBox"));
	    MobileElement switchBox = driver.findElement(MobileBy.AccessibilityId("switch"));
	    assertTrue(checkBox.getAttribute("checked").equals("false"));
	    assertTrue(switchBox.getAttribute("checked").equals("true"));
	    
	    //interagir com elemento
	    checkBox.click();
	    switchBox.click();
	    
	    //clicar em salvar
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='SALVAR']")).click();
	    
	    //verificar dados
	    String name = campoNome.getText();
	    assertEquals("Desafio", name);//textbox
	    String comboBox = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
	    assertEquals("Nintendo Switch", comboBox);//combobox
	    assertFalse(checkBox.getAttribute("checked").equals("false"));
	    assertFalse(switchBox.getAttribute("checked").equals("true"));
	}
	
	@Test
	public void alterarData() {
		driver.findElement(MobileBy.xpath("//*[@text='Formulário']")).click();
		formPage.clickText("01/01/2000");
		formPage.clickText("20");
		formPage.clickText("OK");
		Assert.assertTrue(formPage.elementoTexto("20"));
	}
	
	@Test
	public void alterarHora(){
		driver.findElement(MobileBy.xpath("//*[@text='Formulário']")).click();
		formPage.clickText("06:00");
		formPage.click(MobileBy.AccessibilityId("10"));
		formPage.click(MobileBy.AccessibilityId("40"));
		formPage.clickText("OK");
		Assert.assertTrue(formPage.elementoTexto("10:40"));
	}
	
	@Test
	public void seekbar() {
		driver.findElement(MobileBy.xpath("//*[@text='Formulário']")).click();
		
		formPage.clickSeekbar(0.25, 30);
		
		formPage.salvar();
	}
}
