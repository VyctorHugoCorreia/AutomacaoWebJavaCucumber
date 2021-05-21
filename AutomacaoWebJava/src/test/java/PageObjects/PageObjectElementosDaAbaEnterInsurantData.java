package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Ferramentas.BasePage;

public class PageObjectElementosDaAbaEnterInsurantData extends BasePage {
	// IwebElements

	public WebElement CampoFirstName() {
		Esperar(ElementoCampoFirstName);
		return GetDriver().findElement(ElementoCampoFirstName);
	}

	public WebElement CampoLastName() {
		Esperar(ElementoCampoLastName);
		return GetDriver().findElement(ElementoCampoLastName);
	}

	public WebElement CampoDateOfBirth() {
		Esperar(ElementoCampoDateOfBirth);
		return GetDriver().findElement(ElementoCampoDateOfBirth);
	}

	public WebElement RadioButtonGenderMale() {
		Esperar(ElementoRadioButtonGenderMale);
		return GetDriver().findElement(ElementoRadioButtonGenderMale);
	}

	public WebElement RadioButtonGenderFemale() {
		Esperar(ElementoRadioButtonGenderFemale);
		return GetDriver().findElement(ElementoRadioButtonGenderFemale);
	}

	public WebElement CampoStreetAddress() {
		Esperar(ElementoCampoStreetAddress);
		return GetDriver().findElement(ElementoCampoStreetAddress);
	}

	public Select ComboCoutry() {
		Esperar(ElementoComboCoutry);
		return new Select(GetDriver().findElement(ElementoComboCoutry));
	}

	public WebElement CampoZipCode() {
		Esperar(ElementoCampoZipCode);
		return GetDriver().findElement(ElementoCampoZipCode);
	}

	public WebElement CampoCity() {
		Esperar(ElementoCampoCity);
		return GetDriver().findElement(ElementoCampoCity);
	}

	public Select ComboOccupation() {
		Esperar(ElementoComboOccupation);
		return new Select(GetDriver().findElement(ElementoComboOccupation));
	}

	public WebElement CheckBoxHobbiesSpeeding() {
		Esperar(ElementoCheckBoxHobbiesSpeeding);
		return GetDriver().findElement(ElementoCheckBoxHobbiesSpeeding);
	}

	public WebElement CampoWebSite() {
		Esperar(ElementoCampoWebSite);
		return GetDriver().findElement(ElementoCampoWebSite);
	}

	public WebElement CampoPicture() {
		Esperar(ElementoBotaoNext);
		return GetDriver().findElement(ElementoCampoPicture);
	}

	public WebElement BotaoStepEnterInsurantData() {
		Esperar(ElementoBotaoStepEnterInsurantData);
		return GetDriver().findElement(ElementoBotaoStepEnterInsurantData);
	}

	public WebElement BotaoNext() {
		Esperar(ElementoBotaoNext);
		return GetDriver().findElement(ElementoBotaoNext);
	}

	public void SelecionarTodosCheckboxDeHobbies() {
		for (int CheckBox = 1; CheckBox <= 5; CheckBox++) {
			GetDriver().findElement(By.xpath("//label[" + CheckBox + "]/span[@class='ideal-check']")).click();
		}
	}

	// Asserts
	public boolean EstaSendoExibidoOStepEnterProductData() {
		Esperar(By.id("courtesycar"));
		return GetDriver().findElement(By.id("courtesycar")).isEnabled();
	}

	// Elements By
	By ElementoBotaoStepEnterInsurantData = By.id("enterinsurantdata");
	By ElementoCampoFirstName = By.id("firstname");
	By ElementoCampoLastName = By.id("lastname");
	By ElementoCampoDateOfBirth = By.id("birthdate");
	By ElementoRadioButtonGenderMale = By.xpath("//label[.='Gender']/../p/label[1]");
	By ElementoRadioButtonGenderFemale = By.xpath("//label[.='Gender']/../p/label[2]");
	By ElementoCampoStreetAddress = By.id("streetaddress");
	By ElementoComboCoutry = By.id("country");
	By ElementoCampoZipCode = By.id("zipcode");
	By ElementoCampoCity = By.id("city");
	By ElementoComboOccupation = By.id("occupation");
	By ElementoCheckBoxHobbiesSpeeding = By.xpath("//label[.='Hobbies']/../p/label[1]");
	By ElementoCampoWebSite = By.id("website");
	By ElementoCampoPicture = By.id("picture");
	By ElementoBotaoPrev = By.id("preventervehicledata");
	By ElementoBotaoNext = By.id("nextenterproductdata");
}
