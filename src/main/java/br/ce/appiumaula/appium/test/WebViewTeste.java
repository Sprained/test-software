package br.ce.appiumaula.appium.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.MenuPage;
import br.ce.appiumaula.appium.pages.WebViewPage;

public class WebViewTeste extends BaseTest{

    private MenuPage menu = new MenuPage();
    private WebViewPage page = new WebViewPage();

    @After
    public void tearDown(){
        page.exitContextoWeb();
    }

    @Test
    public void doLogin(){
        menu.acessarHibrido();
        esperar(3000);
        page.contextoWeb();

        page.setEmail("a@a");

        page.setSenha("a");

        page.entrat();

        Assert.assertEquals("Bem Vindo, Wagner!", page.getMensagem());
    }
    
}