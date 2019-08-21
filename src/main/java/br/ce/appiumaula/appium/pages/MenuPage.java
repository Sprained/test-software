package br.ce.appiumaula.appium.pages;

import br.ce.appiumaula.appium.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarSplah() {
		clickText("Splash");
	}
	
	public void acessarAlerta() {
		clickText("Alertas");
	}
	
	public void acessarAbas() {
		clickText("Abas");
	}
	
	public void acessarAccordion() {
		clickText("Accordion");
	}
	
	public void acessarCliques() {
		clickText("Cliques");
	}
	
	public void acessarSwipe() {
		clickText("Swipe");
	}
	
	public void acessarSwipeList() {
//		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@text='Formul�rio']")));
		scrollDown();
		clickText("Swipe List");
	}

	public void acessarDragNDrop() {
//		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@text='Formul�rio']")));
		scrollDown();
		clickText("Drag and drop");
	}

	public void acessarHibrido(){
		clickText("SeuBarriga Híbrido");
	}

}
