package br.ce.appiumaula.appium.pages;

import br.ce.appiumaula.appium.core.BasePage;

import static br.ce.appiumaula.appium.core.DriverFactor.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

public class WebViewPage extends BasePage{

    public void contextoWeb(){
        Set<String> contextHandles = getDriver().getContextHandles();
        getDriver().context((String) contextHandles.toArray()[1]);
    }

    public void setEmail(String email){
        getDriver().findElement(By.id("email")).sendKeys(email);;
    }

    public void exitContextoWeb(){
        getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
    }

    public void setSenha(String senha){
        getDriver().findElement(By.id("senha")).sendKeys(senha);
    }

    public void entrat(){
        click(By.xpath("//button[@type='submit']"));
    }

    public String getMensagem(){
        return obterText(By.xpath("//div[@class='alert alert-success']"));
    }
    
}