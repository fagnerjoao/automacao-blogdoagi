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

    public void fazerBusca(String termoDaBusca){
        getDriver().findElement(btnBuscar).click();
        String valorCampoBuscar = getDriver().findElement(txtBuscar).getAttribute("value");

        if (valorCampoBuscar != null) {
            getDriver().findElement(txtBuscar).click();
            getDriver().findElement(txtBuscar).clear();
            getDriver().findElement(txtBuscar).sendKeys(termoDaBusca);
            getDriver().findElement(btnPesquisar).click();
        } else {
            getDriver().findElement(txtBuscar).click();
            getDriver().findElement(txtBuscar).sendKeys(termoDaBusca);
            getDriver().findElement(btnPesquisar).click();

        }

    }
}
