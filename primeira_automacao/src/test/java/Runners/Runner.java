package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // reconhecendo o cucumber
@CucumberOptions( // encontrando minha feature e deixando mais bonitinho 
		features = "src/test/resources/features/alugarfilme.feature" , // encontrando a feature
		glue = "Steps", // encontrando os steps
		//tags = "nome da tag" (executando apenas uma tag)
		plugin = {"pretty", "html:target/report-html"} , // deixando bonitinho e gerando relatorio
		monochrome = true // deixando bonitinho
)
public class Runner {
	
}
