package Steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.Assert;
import java.util.Date;
import AluguelService.AluguelService;
//import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import entidades.NotaAluguel;
import entidades.filme;
import entidades.utils.DateUtils;

public class AlugarFilmeSteps {
	
	private filme filme; // criando a classe principal
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private String tipoAluguel;
	
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
	 try {
		nota = aluguel.alugar(filme, tipoAluguel); 
	 } catch (RuntimeException e) {
		erro = e.getMessage(); 
	 }
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

	@Entao("^nao sera possivel por falta de estoque$")
	public void nao_sera_possivel_por_falta_de_estoque() throws Throwable {
	    Assert.assertEquals("filme sem estoque", erro);
	}

	@Dado("^que o tipo do aluguel seja extendido$")
	public void que_o_tipo_do_aluguel_seja_extendido() throws Throwable {
	    tipoAluguel = "expendido";
	}

	@Entao("^a data de entrega sera em (\\d+) dias$")
	public void a_data_de_entrega_sera_em_dias(int arg1) throws Throwable {
	  Date dataEsperada = DateUtils.obterDataDiferencaDias(3);
	  Date dataReal = nota.getDataEntrega();
	  
	  DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	  
	  Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
	  
	  Assert.assertEquals(dataEsperada, dataReal);
	}

	@Entao("^a pontuacao recebida sera de (\\d+) pontos$")
	public void a_pontuacao_recebida_sera_de_pontos(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, nota.getPontuacao());
	}


}
