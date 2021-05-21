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
		ElementosDoStepEnterVehicleData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba enter Insurant Data")
	public void PreenchoOFormularioDaAbaEnterInsurantData() {
		PreencherOFormularioDaAbaEnterInsurantData();
	}

	@Quando("clico em Next do formulario enter Insurant Data")
	public void ClicoEmNextDoFormularioEnterInsurantData() {
		ElementosDoStepEnterInsurantData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba enter Product Data")
	public void PreenchoOFormularioDaAbaEnterProductData() {
		PreencherOFormularioDaAbaEnterProductData();
	}

	@Quando("clico em Next do formulario enter Product Data")
	public void ClicoEmNextDoFormularioDaAbaEnterProductData() {
		ElementosDoStepEnterProductData.BotaoNext().click();
	}

	@Quando("preencho o formulario da aba Select Price Option")
	public void PreenchoOFormularioDaAbaSelectPriceOption() {
		PreencherOFormularioDaAbaSelectPriceOption();
	}

	@Quando("clico em Next da aba Select Price Option")
	public void ClicoEmNextDoFormularioDaAbaSelectPriceOption() {
		ElementosDoStepSelectPriceOption.BotaoNext().click();
	}

	@Quando("preencho  o formulario da aba Send Quote")
	public void PreenchoOFormularioDaAbaSendQuote() {
		PreencherOFormularioDaAbaSendQuote();
	}

	@Quando("clico em Send da aba Select Send Quote")
	public void ClicoEmSendDaAbaSelectSendQuote() {
		ElementosDoStepSendQuote.BotaoSend().click();
	}

	@Entao("e exibido a mensagem {string}")
	public void EExibidoAMensagem(String Mensagem) {
		Assert.assertEquals(ElementosDoStepSendQuote.TextoEscritoNoModalDeSucesso(), Mensagem);	
	}
	
	@Entao("Fecho o site")
	public void FechoOSite() {
	  FinalizarChromeDriverEAcessarWebSite();
	}
	
    public void PreencherOFormularioDaAbaSendQuote() {
		ElementosDoStepSendQuote.CampoEmail().sendKeys("qualidade@teste.com");
		ElementosDoStepSendQuote.CampoPhone().sendKeys("11966009868");
		ElementosDoStepSendQuote.CampoUsername().sendKeys("qualiteste");
		ElementosDoStepSendQuote.CampoPassword().sendKeys("Qualidade@12");
		ElementosDoStepSendQuote.CampoConfirmPassword().sendKeys("Qualidade@12");
		ElementosDoStepSendQuote.CampoComments().sendKeys("Automacao de teste do formulario.");
	}

	public void PreencherOFormularioDaAbaEnterProductData() {
		ElementosDoStepEnterProductData.CampoStartDate().sendKeys("01/01/2022");
		ElementosDoStepEnterProductData.ComboInsuranceSum().selectByVisibleText("3.000.000,00");
		ElementosDoStepEnterProductData.ComboMeritRating().selectByVisibleText("Malus 16");
		ElementosDoStepEnterProductData.ComboDamageInsurance().selectByVisibleText("No Coverage");
		ElementosDoStepEnterProductData.CheckBoxOptionalProductsEuroProtection().click();
		ElementosDoStepEnterProductData.ComboCourtesyCar().selectByVisibleText("No");
	}

	public void PreencherOFormularioDaAbaEnterInsurantData() {
		ElementosDoStepEnterInsurantData.BotaoStepEnterInsurantData().click();
		ElementosDoStepEnterInsurantData.CampoFirstName().sendKeys("Qualidade");
		ElementosDoStepEnterInsurantData.CampoLastName().sendKeys("Automacao");
		ElementosDoStepEnterInsurantData.CampoDateOfBirth().sendKeys("12/03/2002");
		ElementosDoStepEnterInsurantData.RadioButtonGenderMale().click();
		ElementosDoStepEnterInsurantData.CampoStreetAddress().sendKeys("Rua de Qualidade");
		ElementosDoStepEnterInsurantData.ComboCoutry().selectByVisibleText("Andorra");
		ElementosDoStepEnterInsurantData.CampoZipCode().sendKeys("12321");
		ElementosDoStepEnterInsurantData.CampoCity().sendKeys("QualiAuto");
		ElementosDoStepEnterInsurantData.ComboOccupation().selectByVisibleText("Employee");
		ElementosDoStepEnterInsurantData.SelecionarTodosCheckboxDeHobbies();
		ElementosDoStepEnterInsurantData.CampoWebSite().sendKeys("http://sampleapp.tricentis.com/101/app.php");
	}

	public void PreencherOFormularioDaAbaEnterVehicleData() {
		ElementosDoStepEnterVehicleData.BotaoStepEnterVehicleData().click();
		ElementosDoStepEnterVehicleData.ComboMake().selectByVisibleText("BMW");
		ElementosDoStepEnterVehicleData.ComboModel().selectByVisibleText("Scooter");
		ElementosDoStepEnterVehicleData.CampoCylinderCapacity().sendKeys("1893");
		ElementosDoStepEnterVehicleData.CampoEnginePerformance().sendKeys("1895");
		ElementosDoStepEnterVehicleData.CampoDateOfManufacture().sendKeys("03/05/1999");
		ElementosDoStepEnterVehicleData.ComboNumberOfSeats().selectByVisibleText("5");
		ElementosDoStepEnterVehicleData.CampoRightHandDriverOpcaoSim().click();
		ElementosDoStepEnterVehicleData.ComboNumberOfSeatsMotorcycle().selectByVisibleText("2");
		ElementosDoStepEnterVehicleData.ComboFuelType().selectByVisibleText("Diesel");
		ElementosDoStepEnterVehicleData.CampoPayload().sendKeys("1000");
		ElementosDoStepEnterVehicleData.CampoTotalWeight().sendKeys("1000");
		ElementosDoStepEnterVehicleData.CampoListPrice().sendKeys("18900");
		ElementosDoStepEnterVehicleData.CampoLicensePlateNumber().sendKeys("C2A34B");
		ElementosDoStepEnterVehicleData.CampoAnnualMileage().sendKeys("250");
	}

	public void PreencherOFormularioDaAbaSelectPriceOption() {
		ElementosDoStepSelectPriceOption.RadioButtonSilver().click();
	}

}
