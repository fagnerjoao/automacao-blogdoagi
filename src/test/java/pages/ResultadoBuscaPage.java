package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.Driver;
import support.Utils;

public class ResultadoBuscaPage  extends Driver {

     private By artigo = By.cssSelector("a[rel='bookmark']");

    private By tituloPagina = By.cssSelector("h1[class='entry-title']");

    public void verificarTitulo(String termoDaBusca){
        String result = getDriver().findElement(artigo).getText();
        Assert.assertEquals(termoDaBusca, result);
    }

    public void verificarTermoArtigo(String termoDaBusca){
        String result = getDriver().findElement(artigo).getText();
        Assert.assertTrue(result.contains(termoDaBusca));
        Utils.takesScreenShot();
    }

    public void verificarResultadoVazio(){
        String result = getDriver().findElement(tituloPagina).getText();
        Assert.assertEquals("Nenhum resultado", result);
        Utils.takesScreenShot();
    }

}
