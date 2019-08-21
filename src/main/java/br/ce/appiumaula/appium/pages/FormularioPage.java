package br.ce.appiumaula.appium.pages;

import static br.ce.appiumaula.appium.core.DriverFactor.getDriver;

import org.openqa.selenium.By;

import br.ce.appiumaula.appium.core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

/**
 * @author Men
 *
 */
public class FormularioPage extends BasePage {
	
	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterText(MobileBy.AccessibilityId("nome"));
	}
	
	public void selectCombo(String valor) {
		selectCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String valorCombo() {
		return obterText(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clickCheck() {
		click(By.className("android.widget.CheckBox"));
	}
	
	public void clickSwitch() {
		click(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheck() {
		return isCheck(By.className("android.widget.CheckBox"));
	}
	
	public boolean isSwitch() {
		return isCheck(MobileBy.AccessibilityId("switch"));
	}

	//clicar no seekbar
	public void clickSeekbar(double posicao, int delta){
		MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
		
		//calcular posição y na seekbar
		int y = seek.getLocation().y + (seek.getSize().height / 2);
		System.out.println(y);
		
		//calcular posição x na seekbar
		int xInicial = seek.getLocation().x + delta;
		int x = (int) (xInicial + ((seek.getSize().width - 2*delta) * posicao));
		System.out.println(x);
		
		tap(x, y);
	}
	
	public void salvar() {
		clickText("SALVAR");
	}
}
