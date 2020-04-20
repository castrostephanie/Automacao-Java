package Steps;

import java.util.Calendar;

import org.junit.Assert;
import java.util.Date;
import AluguelService.AluguelService;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import entidades.NotaAluguel;
import entidades.filme;

public class AlugarFilmeSteps {
	
	private filme filme; // criando a classe principal
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	
	@Dado("^em filme com estoque de (\\d+) unidades$")
	public void em_filme_com_estoque_de_unidades(int arg1) throws Throwable {
	  filme = new filme(); // inicializando a classe filme
	  filme.setEstoque(arg1);	  // setando o estoque 
	}

	@Dado("^que o preco do aluguel seja R\\$ (\\d+)$")
	public void que_o_preco_do_aluguel_seja_R$(int arg1) throws Throwable {
	    filme.setAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
	 nota = aluguel.alugar(filme); 
	}

	@Entao("^o preco do aluguel sera R\\$ (\\d+)$")
	public void o_preco_do_aluguel_sera_R$(int arg1) throws Throwable {
	   Assert.assertEquals(arg1, nota.getPreco()); 
	}

	@Entao("^a data de entrega sera no dia seguinte$")
	public void a_data_de_entrega_sera_no_dia_seguinte() throws Throwable {
	   Calendar cal = Calendar.getInstance();
	   cal.add(Calendar.DAY_OF_MONTH, 1);
	   
	   Date dataRetorno = nota.getDataEntrega();
	   Calendar calRetorno = Calendar.getInstance();
	   calRetorno.setTime(dataRetorno);
	   
	   Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
	   Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
	   Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@Entao("^o estoque do filme sera (\\d+) unidade$")
	public void o_estoque_do_filme_sera_unidade(int arg1) throws Throwable {
		 Assert.assertEquals(arg1, filme.getEstoque()); 
	}


}
