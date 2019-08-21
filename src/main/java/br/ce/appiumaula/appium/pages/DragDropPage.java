package br.ce.appiumaula.appium.pages;

import br.ce.appiumaula.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import static br.ce.appiumaula.appium.core.DriverFactor.getDriver;

import java.util.List;

import org.openqa.selenium.By;

public class DragDropPage extends BasePage{

    public void arrastar(String start, String end){
        MobileElement startElement = getDriver().findElement(By.xpath("//*[@text='"+start+"']"));
        MobileElement endElement = getDriver().findElement(By.xpath("//*[@text='"+end+"']"));

        new TouchAction(getDriver()).longPress(startElement).moveTo(endElement).release().perform();
    }

    public String[] list(){
        List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
        String[] retorno = new String[elements.size()];
        for(int i = 0; i < elements.size(); i++){
            retorno[i] = elements.get(i).getText();
        }
        return retorno;
    }
    
}