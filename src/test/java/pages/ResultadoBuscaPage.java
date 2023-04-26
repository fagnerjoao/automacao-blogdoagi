package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.Driver;

public class ResultadoBuscaPage  extends Driver {

     private By artigo = By.cssSelector("a[rel='bookmark']");

    public void verificarResultadoBusca(String titulo){
        String result = getDriver().findElement(artigo).getText();
        Assert.assertEquals(titulo, result);
    }

}
