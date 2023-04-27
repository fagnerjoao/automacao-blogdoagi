#language: pt

Funcionalidade: Busca por Artigos
Como usuário da página
Quero realizar buscas por artigos
Para eu m einformar mais sobre o AgiBank


  Contexto:
    Dado que eu estou na tela de buca

  @busca @titulo
  Esquema do Cenário: Buscar artigo por título
    Quando realizo a busca pelo "<titulo>" do artigo
    Então visualizo o artigo retornado de acordo com o "<titulo>" informado
  Exemplos:
    |titulo|
    |Agibank lança programa interno de diversidade e inclusão|
    |Agibank participa do South Summit Brazil 2023|

  @busca @termo-expecifíco
  Esquema do Cenário: Buscar utilizando termo expecifíco
    Quando realizo a busca informando um "<termo-expecifico>"
    Então visualizo que um único artigo foi retornado de acordo com o "<termo-expecifico>"
  Exemplos:
    |termo-expecifico|
    |consultora virtual|
    |Imposto de Renda 2023|

  @busca @termo-inexistente
  Esquema do Cenário: Buscar utilizando termo inexistente
     Quando realizo a busca informando um "<termo-inexistente>"
    Então visualizo o retorno da busca sem resultados
    Exemplos:
      |termo-inexistente|
      |Kamen Rider Black RX|
      |Esquadrão Especial Winspector|

