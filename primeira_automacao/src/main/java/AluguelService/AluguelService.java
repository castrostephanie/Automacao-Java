package AluguelService;
//import java.util.Calendar;
import entidades.NotaAluguel;
import entidades.filme;
import entidades.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(filme filme, String tipo) {
		if(filme.getEstoque() == 0) 
				throw new RuntimeException("filme sem estoque");
		
		NotaAluguel nota = new NotaAluguel();
		if("extendido".equals(tipo)) {
		nota.setPreco(filme.getAluguel() * 2);
		nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
		nota.setPontuacao(2);

		} else {
			nota.setPreco(filme.getAluguel()); 
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
		}
		
		filme.setEstoque(filme.getEstoque() -1);
		return nota;
		
		
	}
}
