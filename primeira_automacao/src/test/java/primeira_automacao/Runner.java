package primeira_automacao;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // reconhecendo o cucumber
@CucumberOptions( // encontrando minha feature e deixando mais bonitinho 
		plugin = "pretty" , // deixando bonitinho
		monochrome = true , // deixando bonitinho
	features = {"src/test/java"}	// encontrando a feature
)
public class Runner {

}
