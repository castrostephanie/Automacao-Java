package AluguelService;
import java.util.Calendar;

import entidades.NotaAluguel;
import entidades.filme;

public class AluguelService {

	public NotaAluguel alugar(filme filme) {
		NotaAluguel nota = new NotaAluguel();
		nota.setPreco(filme.getAluguel());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		filme.setEstoque(filme.getEstoque() -1);
		return nota;
		
		
	}
}
