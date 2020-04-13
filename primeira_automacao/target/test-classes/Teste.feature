#language: pt

Funcionalidade: Aprender Cucumber
	Como um aluno
 	Eu quero aprender a utilizar Cucumber
 	Para que eu possa automatizar critérios de aceitação

Cenario: Deve executar especificação
 	Dado que criei o arquivo corretamente
	Quando executa-los
	Entao a especificacao deve finalizar com sucesso
	
Cenario: Deve incrementar contador
	Dado que o valor do contador e 15
	Quando eu incrementar 3
	Entao o valor do contador sera 18
	
Cenario: Deve incrementar contador
	Dado que o valor do contador e 123
	Quando eu incrementar 35
	Entao o valor do contador sera 158
	
Cenario: Deve calcular atraso na entrega
	Dado que a entrega eh dia 05/04/2020
	Quando a entrega atrasar em 2 dias
	Entao a entrega sera efetuada em 07/04/2020
	
Cenario: Deve calcular atraso na entrega da China
	Dado que a entrega eh dia 05/04/2020
	Quando a entrega atrasar em 2 meses
	Entao a entrega sera efetuada em 05/06/2020
	
Cenario: Deve criar steps genericos para estes passos
    Dado que o ticket eh AF345
    Dado que o valor da passagem eh R$ 230,45
    Dado que o nome do passageiro eh "Fulano da Silva"
    Dado que o telefone do passageiro eh 9999-9999
    Quando criar os steps
    Entao o teste vai funcionar

Cenario: Deve reaproveitar os steps "Dado" do cenario anterior
    Dado que o ticket eh AB167
    Dado que o ticket especial eh AB167
    Dado que o valor da passagem eh R$ 1120,23
    Dado que o nome do passageiro eh "Cicrano de Oliveira"
    Dado que o telefone do passageiro eh 9888-8888

Cenario: Deve negar todos os steps "Dado" dos cenarios anteriores
    Dado que o ticket eh CD123
    Dado que o ticket eh AG1234
    Dado que o valor da passagem eh R$ 1.1345,56
    Dado que o nome do passageiro eh "Beltrano Souza Matos de Alcantara Azevedo"
    Dado que o telefone do passageiro eh 1234-5678
    Dado que o telefone do passageiro eh 999-2223 

	