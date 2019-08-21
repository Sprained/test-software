package br.ce.appiumaula.appium.core;

import static br.ce.appiumaula.appium.core.DriverFactor.getDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class BasePage {
	
	public void escrever(By by, String text) {
	    getDriver().findElement(by).sendKeys(text);
	}
	
	public String obterText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void selectCombo(By by, String valor) {
		getDriver().findElement(by).click();
		clickText(valor);
	}
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clickText(String texto) {
		click(By.xpath("//*[@text='"+texto+"']"));
	}
	
	public boolean isCheck(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	public boolean elementoTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
		return elementos.size() > 0;
	}
	
	public void tap(int x, int y) {
		new TouchAction(getDriver()).tap(x, y).perform();
	}
	
	public void scroll(double start, double end) {
		Dimension size = getDriver().manage().window().getSize();
		
		//metade da tela
		int x = size.width / 2;
		
		int startY = (int) (size.height * start);
		int endY = (int) (size.height * end);
		
		new TouchAction(getDriver()).press(x, startY).waitAction(Duration.ofMillis(500)).moveTo(x, endY).release().perform();
	}
	
	public void scrollDown() {
		scroll(0.9, 0.1);
	}
	
	public void scrollUp() {
		scroll(0.1, 0.9);
	}
	
	//buscar titulo do alerta
	public String tituloAlerta() {
		return obterText(By.id("android:id/alertTitle"));
	}
		
	//buscar texto do alerta
	public String mensagemAlerta() {
		return obterText(By.id("android:id/message"));
	}
	
	//swipe
	public void swipe(double start, double end) {
		Dimension size = getDriver().manage().window().getSize();
		
		int y = size.height / 2;
		
		int startX = (int) (size.width * start);
		int endX = (int) (size.width * end);
		
		new TouchAction(getDriver()).press(startX, y).waitAction(Duration.ofMillis(500)).moveTo(endX, y).release().perform();
	}
	
	public void swipeLeft() {
		swipe(0.1, 0.9);
	}
	
	public void swipeRight() {
		swipe(0.9, 0.1);
	}
	
	public void swipeElement(MobileElement element, double start, double end) {
		int y = element.getLocation().y + (element.getSize().height / 2);
		
		int startX = (int) (element.getSize().width * start);
		int endX = (int) (element.getSize().width * end);
		
		new TouchAction(getDriver()).press(startX, y).waitAction(Duration.ofMillis(500)).moveTo(endX, y).release().perform();
	}

}
