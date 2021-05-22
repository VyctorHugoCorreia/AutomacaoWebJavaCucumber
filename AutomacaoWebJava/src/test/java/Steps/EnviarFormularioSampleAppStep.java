package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.*;
import Ferramentas.BaseTest;
import io.cucumber.java.pt.Entao;

public class EnviarFormularioSampleAppStep extends BaseTest {

	@Before
	public void IniciarChromeDriverEAcessarWebSite() {
		IniciarChrome();
	}

	
	@Dado("que estou no site Sample App")
	public void QueEstouNoSiteSampleApp() {
		Assert.assertEquals(webdriver.getCurrentUrl(),"http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("Preencho o formulario da aba enter Vehicle Data")
	public void PreenchoOFormularioDaAbaEnterVehicleData() {
		ElementosDaAbaEnterVehicleData.PreencherOFormularioDaAbaEnterVehicleData();
	}

	@Quando("clico em Next do formulario enter Vehicle Data")
	public void ClicoEmNextDoFormularioEnterVehicleData() {
		ElementosDaAbaEnterVehicleData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba enter Insurant Data")
	public void PreenchoOFormularioDaAbaEnterInsurantData() {
		ElementosDaAbaEnterInsurantData.PreencherOFormularioDaAbaEnterInsurantData();
	}

	@Quando("clico em Next do formulario enter Insurant Data")
	public void ClicoEmNextDoFormularioEnterInsurantData() {
		ElementosDaAbaEnterInsurantData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba enter Product Data")
	public void PreenchoOFormularioDaAbaEnterProductData() {
		ElementosDaAbaEnterProductData.PreencherOFormularioDaAbaEnterProductData();
	}

	@Quando("clico em Next do formulario enter Product Data")
	public void ClicoEmNextDoFormularioDaAbaEnterProductData() {
		ElementosDaAbaEnterProductData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba Select Price Option")
	public void PreenchoOFormularioDaAbaSelectPriceOption() {
		ElementosDaAbaSelectPriceOption.PreencherOFormularioDaAbaSelectPriceOption();
	}

	@Quando("clico em Next da aba Select Price Option")
	public void ClicoEmNextDoFormularioDaAbaSelectPriceOption() {
		ElementosDaAbaSelectPriceOption.BotaoNext().click();
	}

	@Quando("preencho  o formulario da aba Send Quote")
	public void PreenchoOFormularioDaAbaSendQuote() {
		ElementosDaAbaSendQuote.PreencherOFormularioDaAbaSendQuote();
	}

	@Quando("clico em Send da aba Select Send Quote")
	public void ClicoEmSendDaAbaSelectSendQuote() {
		ElementosDaAbaSendQuote.BotaoSend().click();
	}

	@Entao("e exibido a mensagem {string}")
	public void EExibidoAMensagem(String Mensagem) {
		Assert.assertEquals(ElementosDaAbaSendQuote.TextoEscritoNoModalDeSucesso(), Mensagem);
	}

	@After(order = 1)
	public void ArmazenarEvidenciaDeTeste() {
		Screeshot("Preencher os formularios do Automobile e validar a mensagem de sucesso");
	}

	@After(order = 0)
	public void FinalizarChromeDriver() {
		FinalizarChrome();
	}
	
}
