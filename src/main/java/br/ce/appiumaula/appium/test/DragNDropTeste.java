package br.ce.appiumaula.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.appiumaula.appium.core.BaseTest;
import br.ce.appiumaula.appium.pages.DragDropPage;
import br.ce.appiumaula.appium.pages.MenuPage;

public class DragNDropTeste extends BaseTest{

    private MenuPage menu = new MenuPage();
    private DragDropPage page = new DragDropPage();

    private String[] state = new String[]{};

    @Test
    public void runDragNDrop(){
        menu.acessarDragNDrop();

        esperar(1000);
        Assert.assertArrayEquals(state, page.list());
    }
    
}