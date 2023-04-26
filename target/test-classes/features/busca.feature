#language: pt

Funcionalidade: Busca por Artigos
Como usuário da página
Quero realizar buscas por artigos
Para eu m einformar mais sobre o AgiBank


  Contexto:
    Dado que eu estou na tela de buca

  @busca-sucesso @titulo
  Esquema do Cenário: Buscar artigo por título
    Quando realizo a busca pelo "<titulo>" do artigo
    Então visualizo o artigo retornado de acordo com o "<titulo>" informado
  Exemplos:
    |titulo|
    |Agibank lança programa interno de diversidade e inclusão|
    |Agibank participa do South Summit Brazil 2023|


  @busca-sucesso @termo-expecifíco
  Cenario: Buscar utilizando termo expecifíco
    Quando realizo a busca informando um termo expecifíco em um artigo
    Então visualizo o artigo retornado de acordo com o termo informado

  @busca-sem-sucesso @termo-inexistente
  Cenario: Buscar utilizando termo inexistente
    Quando realizo a busca informando um termo inexistente nos artigos
    Então visualizo o retorno da busca sem resultados