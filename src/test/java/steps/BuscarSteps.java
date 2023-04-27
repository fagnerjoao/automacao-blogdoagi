package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Test;
import pages.HomePage;
import pages.ResultadoBuscaPage;
import runner.Driver;

public class BuscarSteps extends Driver {

    HomePage homePage = new HomePage();
    ResultadoBuscaPage resultadoBuscaPage = new ResultadoBuscaPage();

    @Test

    @Dado("^que eu estou na tela de buca$")
    public void que_eu_estou_na_tela_de_buca() throws Throwable {
        homePage.acessarHome();
    }

    @Quando("^realizo a busca pelo \"([^\"]*)\" do artigo$")
    public void realizo_a_busca_pelo_título_do_artigo(String termoDaBusca) throws Throwable {
        homePage.fazerBusca(termoDaBusca);
    }

    @Então("^visualizo o artigo retornado de acordo com o \"([^\"]*)\" informado$")
    public void visualizo_o_artigo_retornado_de_acordo_com_o_informado(String termoDaBusca) throws Throwable {
       resultadoBuscaPage.verificarTitulo(termoDaBusca);
    }

    @Quando("^realizo a busca informando um \"([^\"]*)\"$")
    public void realizo_a_busca_informando_um(String termoDaBusca) throws Throwable {
        homePage.fazerBusca(termoDaBusca);
    }

    @Então("^visualizo que um único artigo foi retornado de acordo com o \"([^\"]*)\"$")
    public void visualizo_que_um_único_artigo_foi_retornado_de_acordo_com_o(String termoDaBusca) throws Throwable {
        resultadoBuscaPage.verificarTermoArtigo(termoDaBusca);
    }

    @Então("^visualizo o retorno da busca sem resultados$")
    public void visualizo_o_retorno_da_busca_sem_resultados() throws Throwable {
        resultadoBuscaPage.verificarResultadoVazio();
    }

}
