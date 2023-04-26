package pages;

import org.openqa.selenium.By;
import runner.Driver;
import support.Utils;

public class HomePage extends Driver {


    private By btnBuscar= By.id("search-open");

    private By txtBuscar = By.cssSelector("input[placeholder='Pesquisar …']");

   private By btnPesquisar = By.cssSelector("input[value='Pesquisar']");




    public void acessarHome(){
        getDriver().manage().window().maximize();
        getDriver().get("https://blogdoagi.com.br/");
        Utils.waitElementBePresent(btnBuscar, 20);
    }

    public void fazerBusca(String titulo){
        getDriver().findElement(btnBuscar).click();
        getDriver().findElement(txtBuscar).clear();
        getDriver().findElement(txtBuscar).click();
        //getDriver().findElement(txtBuscar).sendKeys("Agibank lança programa interno de diversidade e inclusão");
        getDriver().findElement(txtBuscar).sendKeys(titulo);
        getDriver().findElement(btnPesquisar).click();
    }
}
