$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/alugarfilme.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Alugar filme",
  "description": "Como um usuario\r\nEu quero cadastrar alugueis de filmes \r\nPara controlar precos e datas de entrega",
  "id": "alugar-filme",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Deve alugar um filme com sucesso",
  "description": "",
  "id": "alugar-filme;deve-alugar-um-filme-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "em filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "que o preco do aluguel seja R$ 3",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "alugar",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "o preco do aluguel sera R$ 3",
  "keyword": "Entao "
});
formatter.step({
  "line": 13,
  "name": "a data de entrega sera no dia seguinte",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o estoque do filme sera 1 unidade",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "AlugarFilmeSteps.em_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "duration": 387344200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 31
    }
  ],
  "location": "AlugarFilmeSteps.que_o_preco_do_aluguel_seja_R$(int)"
});
formatter.result({
  "duration": 186900,
  "status": "passed"
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "duration": 3392300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 27
    }
  ],
  "location": "AlugarFilmeSteps.o_preco_do_aluguel_sera_R$(int)"
});
formatter.result({
  "duration": 1558100,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.AlugarFilmeSteps.o_preco_do_aluguel_sera_R$(AlugarFilmeSteps.java:47)\r\n\tat ✽.Entao o preco do aluguel sera R$ 3(src/test/resources/features/alugarfilme.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AlugarFilmeSteps.a_data_de_entrega_sera_no_dia_seguinte()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "AlugarFilmeSteps.o_estoque_do_filme_sera_unidade(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Nao deve alugar um filme sem estoque",
  "description": "",
  "id": "alugar-filme;nao-deve-alugar-um-filme-sem-estoque",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 17,
  "name": "em filme com estoque de 0 unidades",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "alugar",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "nao sera possivel por falta de estoque",
  "keyword": "Entao "
});
formatter.step({
  "line": 20,
  "name": "o estoque do filme sera 0 unidade",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 24
    }
  ],
  "location": "AlugarFilmeSteps.em_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "duration": 204600,
  "status": "passed"
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "duration": 218400,
  "status": "passed"
});
formatter.match({
  "location": "AlugarFilmeSteps.nao_sera_possivel_por_falta_de_estoque()"
});
formatter.result({
  "duration": 3202600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 24
    }
  ],
  "location": "AlugarFilmeSteps.o_estoque_do_filme_sera_unidade(int)"
});
formatter.result({
  "duration": 181500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Deve dar condicoes especiais para categoria extendida",
  "description": "",
  "id": "alugar-filme;deve-dar-condicoes-especiais-para-categoria-extendida",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 23,
  "name": "em filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.step({
  "line": 24,
  "name": "que o preco do aluguel seja R$ 4",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "que o tipo do aluguel seja extendido",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "alugar",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "o preco do aluguel sera R$ 8",
  "keyword": "Entao "
});
formatter.step({
  "line": 28,
  "name": "a data de entrega sera em 3 dias",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "a pontuacao recebida sera de 2 pontos",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "AlugarFilmeSteps.em_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "duration": 721400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 31
    }
  ],
  "location": "AlugarFilmeSteps.que_o_preco_do_aluguel_seja_R$(int)"
});
formatter.result({
  "duration": 156800,
  "status": "passed"
});
formatter.match({
  "location": "AlugarFilmeSteps.que_o_tipo_do_aluguel_seja_extendido()"
});
formatter.result({
  "duration": 66000,
  "status": "passed"
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "duration": 222100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 27
    }
  ],
  "location": "AlugarFilmeSteps.o_preco_do_aluguel_sera_R$(int)"
});
formatter.result({
  "duration": 701200,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.AlugarFilmeSteps.o_preco_do_aluguel_sera_R$(AlugarFilmeSteps.java:47)\r\n\tat ✽.Entao o preco do aluguel sera R$ 8(src/test/resources/features/alugarfilme.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "AlugarFilmeSteps.a_data_de_entrega_sera_em_dias(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "AlugarFilmeSteps.a_pontuacao_recebida_sera_de_pontos(int)"
});
formatter.result({
  "status": "skipped"
});
});