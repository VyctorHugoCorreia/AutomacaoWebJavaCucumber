package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.*;
import Ferramentas.BaseTest;
import io.cucumber.java.pt.Entao;

public class EnviarFormularioSampleAppStep extends BaseTest {

	@Dado("que estou no site Sample App")
	public void QueEstouNoSiteSampleApp() {
		IniciarChromeDriverEAcessarWebSite();
	}

	@Quando("Preencho o formulario da aba enter Vehicle Data")
	public void PreenchoOFormularioDaAbaEnterVehicleData() {
		PreencherOFormularioDaAbaEnterVehicleData();
	}

	@Quando("clico em Next do formulario enter Vehicle Data")
	public void ClicoEmNextDoFormularioEnterVehicleData() {
		ElementosDaAbaEnterVehicleData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba enter Insurant Data")
	public void PreenchoOFormularioDaAbaEnterInsurantData() {
		PreencherOFormularioDaAbaEnterInsurantData();
	}

	@Quando("clico em Next do formulario enter Insurant Data")
	public void ClicoEmNextDoFormularioEnterInsurantData() {
		ElementosDaAbaEnterInsurantData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba enter Product Data")
	public void PreenchoOFormularioDaAbaEnterProductData() {
		PreencherOFormularioDaAbaEnterProductData();
	}

	@Quando("clico em Next do formulario enter Product Data")
	public void ClicoEmNextDoFormularioDaAbaEnterProductData() {
		ElementosDaAbaEnterProductData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba Select Price Option")
	public void PreenchoOFormularioDaAbaSelectPriceOption() {
		PreencherOFormularioDaAbaSelectPriceOption();
	}

	@Quando("clico em Next da aba Select Price Option")
	public void ClicoEmNextDoFormularioDaAbaSelectPriceOption() {
		ElementosDaAbaSelectPriceOption.BotaoNext().click();
	}

	@Quando("preencho  o formulario da aba Send Quote")
	public void PreenchoOFormularioDaAbaSendQuote() {
		PreencherOFormularioDaAbaSendQuote();
	}

	@Quando("clico em Send da aba Select Send Quote")
	public void ClicoEmSendDaAbaSelectSendQuote() {
		ElementosDaAbaSendQuote.BotaoSend().click();
	}

	@Entao("e exibido a mensagem {string}")
	public void EExibidoAMensagem(String Mensagem) {
		Assert.assertEquals(ElementosDaAbaSendQuote.TextoEscritoNoModalDeSucesso(), Mensagem);
		FinalizarChromeDriver();
	}

	
	public void PreencherOFormularioDaAbaSendQuote() {
		ElementosDaAbaSendQuote.CampoEmail().sendKeys("qualidade@teste.com");
		ElementosDaAbaSendQuote.CampoPhone().sendKeys("11966009868");
		ElementosDaAbaSendQuote.CampoUsername().sendKeys("qualiteste");
		ElementosDaAbaSendQuote.CampoPassword().sendKeys("Qualidade@12");
		ElementosDaAbaSendQuote.CampoConfirmPassword().sendKeys("Qualidade@12");
		ElementosDaAbaSendQuote.CampoComments().sendKeys("Automacao de teste do formulario.");
	}

	public void PreencherOFormularioDaAbaEnterProductData() {
		ElementosDaAbaEnterProductData.CampoStartDate().sendKeys("01/01/2022");
		ElementosDaAbaEnterProductData.ComboInsuranceSum().selectByVisibleText("3.000.000,00");
		ElementosDaAbaEnterProductData.ComboMeritRating().selectByVisibleText("Malus 16");
		ElementosDaAbaEnterProductData.ComboDamageInsurance().selectByVisibleText("No Coverage");
		ElementosDaAbaEnterProductData.CheckBoxOptionalProductsEuroProtection().click();
		ElementosDaAbaEnterProductData.ComboCourtesyCar().selectByVisibleText("No");
	}

	public void PreencherOFormularioDaAbaEnterInsurantData() {
		ElementosDaAbaEnterInsurantData.BotaoStepEnterInsurantData().click();
		ElementosDaAbaEnterInsurantData.CampoFirstName().sendKeys("Qualidade");
		ElementosDaAbaEnterInsurantData.CampoLastName().sendKeys("Automacao");
		ElementosDaAbaEnterInsurantData.CampoDateOfBirth().sendKeys("12/03/2002");
		ElementosDaAbaEnterInsurantData.RadioButtonGenderMale().click();
		ElementosDaAbaEnterInsurantData.CampoStreetAddress().sendKeys("Rua de Qualidade");
		ElementosDaAbaEnterInsurantData.ComboCoutry().selectByVisibleText("Andorra");
		ElementosDaAbaEnterInsurantData.CampoZipCode().sendKeys("12321");
		ElementosDaAbaEnterInsurantData.CampoCity().sendKeys("QualiAuto");
		ElementosDaAbaEnterInsurantData.ComboOccupation().selectByVisibleText("Employee");
		ElementosDaAbaEnterInsurantData.SelecionarTodosCheckboxDeHobbies();
		ElementosDaAbaEnterInsurantData.CampoWebSite().sendKeys("http://sampleapp.tricentis.com/101/app.php");
	}

	public void PreencherOFormularioDaAbaEnterVehicleData() {
		ElementosDaAbaEnterVehicleData.BotaoStepEnterVehicleData().click();
		ElementosDaAbaEnterVehicleData.ComboMake().selectByVisibleText("BMW");
		ElementosDaAbaEnterVehicleData.ComboModel().selectByVisibleText("Scooter");
		ElementosDaAbaEnterVehicleData.CampoCylinderCapacity().sendKeys("1893");
		ElementosDaAbaEnterVehicleData.CampoEnginePerformance().sendKeys("1895");
		ElementosDaAbaEnterVehicleData.CampoDateOfManufacture().sendKeys("03/05/1999");
		ElementosDaAbaEnterVehicleData.ComboNumberOfSeats().selectByVisibleText("5");
		ElementosDaAbaEnterVehicleData.CampoRightHandDriverOpcaoSim().click();
		ElementosDaAbaEnterVehicleData.ComboNumberOfSeatsMotorcycle().selectByVisibleText("2");
		ElementosDaAbaEnterVehicleData.ComboFuelType().selectByVisibleText("Diesel");
		ElementosDaAbaEnterVehicleData.CampoPayload().sendKeys("1000");
		ElementosDaAbaEnterVehicleData.CampoTotalWeight().sendKeys("1000");
		ElementosDaAbaEnterVehicleData.CampoListPrice().sendKeys("18900");
		ElementosDaAbaEnterVehicleData.CampoLicensePlateNumber().sendKeys("C2A34B");
		ElementosDaAbaEnterVehicleData.CampoAnnualMileage().sendKeys("250");
	}

	public void PreencherOFormularioDaAbaSelectPriceOption() {
		ElementosDaAbaSelectPriceOption.RadioButtonSilver().click();
	}

}
