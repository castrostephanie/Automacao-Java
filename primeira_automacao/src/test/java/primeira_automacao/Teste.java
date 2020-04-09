package primeira_automacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class Teste {
	
	// CENARIO 1
	
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
	    System.out.println("Hello World");
	}

	@Quando("^executa-los$")
	public void executa_los() throws Throwable {
	   System.out.println("Executed"); 
	}

	@Entao("^a especificacao deve finalizar com sucesso$")
	public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {
	   System.out.println("The and!!");
	}
	
	// CENARIO 2
	
	private int contador = 0; 
	@Dado("^que o valor do contador e (\\d+)$")
	public void que_o_valor_do_contador_e(int arg1) throws Throwable {
	    contador = arg1;
	}
	
	@Quando("^eu incrementar (\\d+)$")
	public void eu_incrementar(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Entao("^o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_sera(int arg1) throws Throwable {
	    System.out.println(arg1);
	    System.out.println(contador);
	}

	// CENARIO 3
	
	Date entrega = new Date(); // definindo uma variavel para armazenar a data
	
	@Dado("^que a entrega eh dia (\\d+)/(\\d+)/(\\d+)$")
	public void que_a_entrega_eh_dia(int dia, int mes, int ano) throws Throwable {
	    Calendar cal = Calendar.getInstance(); // Iniciando um calendario  
	    cal.set(Calendar.DAY_OF_MONTH, dia); // Setando o dia
	    cal.set(Calendar.MONTH, mes - 1); // Setando o mes 
	    cal.set(Calendar.YEAR, ano); // Setando o ano
	    entrega = cal.getTime(); // passando para entrega o valor do calendario
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void a_entrega_atrasar_em_dias(int arg1, String tempo) throws Throwable {
		 Calendar cal = Calendar.getInstance(); // Iniciando um calendario
		 cal.setTime(entrega); // pegando o valor da data para definir a entrega
		 if(tempo.equals("dias")) {
			 cal.add(Calendar.DAY_OF_MONTH,	arg1); // Fazendo uma operação para retornar os dias no calendario
		 }
		 if(tempo.equals("meses")) {
			 cal.add(Calendar.MONTH, arg1);
		 }
		 entrega = cal.getTime(); // retornando o valor para a variavel
	}

	@Entao("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrega_sera_efetuada_em(String data) throws Throwable {
	   DateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // transformando uma variavel INT em STRING
	   String dataFormatada = format.format(entrega); // convertendo a variavel Int 
	   Assert.assertEquals(data, dataFormatada);
	}
	
	
}
