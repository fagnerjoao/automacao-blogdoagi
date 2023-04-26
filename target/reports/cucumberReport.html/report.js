$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("busca.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Busca por Artigos",
  "description": "Como usuário da página\r\nQuero realizar buscas por artigos\r\nPara eu m einformar mais sobre o AgiBank",
  "id": "busca-por-artigos",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Buscar artigo por título",
  "description": "",
  "id": "busca-por-artigos;buscar-artigo-por-título",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 12,
      "name": "@busca-sucesso"
    },
    {
      "line": 12,
      "name": "@titulo"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "realizo a busca pelo \"\u003ctitulo\u003e\" do artigo",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "visualizo o artigo retornado de acordo com o \"\u003ctitulo\u003e\" informado",
  "keyword": "Então "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "busca-por-artigos;buscar-artigo-por-título;",
  "rows": [
    {
      "cells": [
        "titulo"
      ],
      "line": 17,
      "id": "busca-por-artigos;buscar-artigo-por-título;;1"
    },
    {
      "cells": [
        "Agibank lança programa interno de diversidade e inclusão"
      ],
      "line": 18,
      "id": "busca-por-artigos;buscar-artigo-por-título;;2"
    },
    {
      "cells": [
        "Agibank participa do South Summit Brazil 2023"
      ],
      "line": 19,
      "id": "busca-por-artigos;buscar-artigo-por-título;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que eu estou na tela de buca",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaSteps.que_eu_estou_na_tela_de_buca()"
});
formatter.result({
  "duration": 2286882600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Buscar artigo por título",
  "description": "",
  "id": "busca-por-artigos;buscar-artigo-por-título;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 12,
      "name": "@titulo"
    },
    {
      "line": 12,
      "name": "@busca-sucesso"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "realizo a busca pelo \"Agibank lança programa interno de diversidade e inclusão\" do artigo",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "visualizo o artigo retornado de acordo com o \"Agibank lança programa interno de diversidade e inclusão\" informado",
  "matchedColumns": [
    0
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Agibank lança programa interno de diversidade e inclusão",
      "offset": 22
    }
  ],
  "location": "BuscaSteps.realizo_a_busca_pelo_título_do_artigo(String)"
});
formatter.result({
  "duration": 799377600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Agibank lança programa interno de diversidade e inclusão",
      "offset": 46
    }
  ],
  "location": "BuscaSteps.visualizo_o_artigo_retornado_de_acordo_com_o_informado(String)"
});
formatter.result({
  "duration": 30050899,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que eu estou na tela de buca",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaSteps.que_eu_estou_na_tela_de_buca()"
});
formatter.result({
  "duration": 534935300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Buscar artigo por título",
  "description": "",
  "id": "busca-por-artigos;buscar-artigo-por-título;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 12,
      "name": "@titulo"
    },
    {
      "line": 12,
      "name": "@busca-sucesso"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "realizo a busca pelo \"Agibank participa do South Summit Brazil 2023\" do artigo",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "visualizo o artigo retornado de acordo com o \"Agibank participa do South Summit Brazil 2023\" informado",
  "matchedColumns": [
    0
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Agibank participa do South Summit Brazil 2023",
      "offset": 22
    }
  ],
  "location": "BuscaSteps.realizo_a_busca_pelo_título_do_artigo(String)"
});
formatter.result({
  "duration": 700581201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Agibank participa do South Summit Brazil 2023",
      "offset": 46
    }
  ],
  "location": "BuscaSteps.visualizo_o_artigo_retornado_de_acordo_com_o_informado(String)"
});
formatter.result({
  "duration": 28904301,
  "status": "passed"
});
});