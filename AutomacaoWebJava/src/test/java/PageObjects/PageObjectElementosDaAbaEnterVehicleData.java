package PageObjects;
import Ferramentas.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PageObjectElementosDaAbaEnterVehicleData extends BasePage {

	
	//IwebElements
	
	public Select ComboMake() {
		Esperar(ElementoComboMake);
		return new Select(GetDriver().findElement(ElementoComboMake));
	}

	public Select ComboModel() {
		Esperar(ElementoComboModel);
		return new Select(GetDriver().findElement(ElementoComboModel));
	}

	public WebElement CampoCylinderCapacity() {
		Esperar(ElementoCampoCylinderCapacity);
		return GetDriver().findElement(ElementoCampoCylinderCapacity);
	}

	public WebElement CampoDateOfManufacture() {
		Esperar(ElementoCampoDateOfManufacture);
		return GetDriver().findElement(ElementoCampoDateOfManufacture);
	}

	public WebElement CampoNumberOfSeats() {
		Esperar(ElementoCampoNumberOfSeats);
		return GetDriver().findElement(ElementoCampoNumberOfSeats);
	}

	public WebElement CampoRightHandDriverOpcaoSim() {
		Esperar(ElementoCampoRightHandDriverOpcaoSim);
		return GetDriver().findElement(ElementoCampoRightHandDriverOpcaoSim);
	}

	public WebElement CampoRightHandDriverOpcaoNao() {
		Esperar(ElementoCampoRightHandDriverOpcaoNao);
		return GetDriver().findElement(ElementoCampoRightHandDriverOpcaoNao);
	}

	public Select ComboNumberOfSeatsMotorcycle() {
		Esperar(ElementoComboNumberOfSeatsMotorcycle);
		return new Select(GetDriver().findElement(ElementoComboNumberOfSeatsMotorcycle));
	}

	public WebElement CampoFuelType() {
		Esperar(ElementoCampoFuelType);
		return GetDriver().findElement(ElementoCampoFuelType);
	}

	public WebElement CampoPayload() {
		Esperar(ElementoCampoPayload);
		return GetDriver().findElement(ElementoCampoPayload);
	}

	public WebElement CampoTotalWeight() {
		Esperar(ElementoCampoTotalWeight);
		return GetDriver().findElement(ElementoCampoTotalWeight);
	}

	public WebElement CampoListPrice() {
		Esperar(ElementoCampoListPrice);
		return GetDriver().findElement(ElementoCampoListPrice);
	}

	public WebElement CampoEnginePerformance() {
		Esperar(ElementoCampoEnginePerformance);
		return GetDriver().findElement(ElementoCampoEnginePerformance);
	}

	public WebElement CampoLicensePlateNumber() {
		Esperar(ElementoCampoLicensePlateNumber);
		return GetDriver().findElement(ElementoCampoLicensePlateNumber);
	}

	public WebElement CampoAnnualMileage() {
		Esperar(ElementoCampoAnnualMileage);
		return GetDriver().findElement(ElementoCampoAnnualMileage);
	}

	public WebElement BotaoNext() {
		Esperar(ElementoBotaoNext);
		return GetDriver().findElement(ElementoBotaoNext);
	}

	public WebElement BotaoStepEnterVehicleData() {
		Esperar(ElementoBotaoStepEnterVehicleData);
		return GetDriver().findElement(ElementoBotaoStepEnterVehicleData);
	}

	public Select ComboNumberOfSeats() {
		Esperar(ElementoCampoNumberOfSeats);
		return new Select(GetDriver().findElement(ElementoCampoNumberOfSeats));
	}

	public Select ComboFuelType() {
		Esperar(ElementoCampoFuelType);
		return new Select(GetDriver().findElement(ElementoCampoFuelType));
	}

	
	//Asserts
	
	public boolean EstaSendoExibidoOStepEnterInsurantData() {
		Esperar(By.id("firstname"));
		return GetDriver().findElement(By.id("firstname")).isEnabled();
	}

	
	//Elements By
	
	By ElementoBotaoStepEnterVehicleData = By.id("entervehicledata");
	By ElementoComboMake = By.id("make");
	By ElementoComboModel = By.id("model");
	By ElementoCampoCylinderCapacity = By.id("cylindercapacity");
	By ElementoCampoRightHandDriverOpcaoSim = By.xpath("//label[.='Right Hand Drive']/../p//label[1]");
	By ElementoCampoRightHandDriverOpcaoNao = By.xpath("//label[.='Right Hand Drive']/../p//label[2]");
	By ElementoCampoEnginePerformance = By.id("engineperformance");
	By ElementoCampoDateOfManufacture = By.id("dateofmanufacture");
	By ElementoCampoNumberOfSeats = By.id("numberofseats");
	By ElementoComboNumberOfSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	By ElementoCampoFuelType = By.id("fuel");
	By ElementoCampoPayload = By.id("payload");
	By ElementoCampoTotalWeight = By.id("totalweight");
	By ElementoCampoListPrice = By.id("listprice");
	By ElementoCampoLicensePlateNumber = By.id("licenseplatenumber");
	By ElementoCampoAnnualMileage = By.id("annualmileage");
	By ElementoBotaoNext = By.id("nextenterinsurantdata");
}
