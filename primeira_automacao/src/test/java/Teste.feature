#language: pt

Funcionalidade: Aprender Cucumber
	Como um aluno
 	Eu quero aprender a utilizar Cucumber
 	Para que eu possa automatizar crit�rios de aceita��o

Cenario: Deve executar especifica��o
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
	