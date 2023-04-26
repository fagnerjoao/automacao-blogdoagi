package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.ResultadoBuscaPage;
import runner.Driver;

public class BuscaSteps extends Driver {

    HomePage homePage = new HomePage();
    ResultadoBuscaPage resultadoBuscaPage = new ResultadoBuscaPage();

    @Dado("^que eu estou na tela de buca$")
    public void que_eu_estou_na_tela_de_buca() throws Throwable {
        homePage.acessarHome();
    }

    @Quando("^realizo a busca pelo \"([^\"]*)\" do artigo$")
    public void realizo_a_busca_pelo_título_do_artigo(String titulo) throws Throwable {
        homePage.fazerBusca(titulo);
    }

    @Então("^visualizo o artigo retornado de acordo com o \"([^\"]*)\" informado$")
    public void visualizo_o_artigo_retornado_de_acordo_com_o_informado(String titulo) throws Throwable {
       resultadoBuscaPage.verificarResultadoBusca(titulo);
    }

    @Quando("^realizo a busca informando um termo expecifíco em um artigo$")
    public void realizo_a_busca_informando_um_termo_expecifíco_em_um_artigo() throws Throwable {

    }

    @Então("^visualizo o artigo retornado de acordo com o termo informado$")
    public void visualizo_o_artigo_retornado_de_acordo_com_o_termo_informado() throws Throwable {

    }

    @Quando("^realizo a busca informando um termo inexistente nos artigos$")
    public void realizo_a_busca_informando_um_termo_inexistente_nos_artigos() throws Throwable {

    }

    @Então("^visualizo o retorno da busca sem resultados$")
    public void visualizo_o_retorno_da_busca_sem_resultados() throws Throwable {

    }

}
