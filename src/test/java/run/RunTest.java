package run;



import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/sounddownciudadano/sounddown_ciudadano.feature",
        glue = {"MyFirstScenario"}  )
public class RunTest {



}