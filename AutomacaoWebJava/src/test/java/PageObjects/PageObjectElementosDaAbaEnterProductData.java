package PageObjects;

import Ferramentas.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PageObjectElementosDaAbaEnterProductData extends BasePage {
	// IwebElements

	public WebElement BotaoStepEnterProductData() {
		Esperar(ElementoBotaoStepEnterProductData);
		return GetDriver().findElement(ElementoBotaoStepEnterProductData);
	}

	public WebElement CampoStartDate() {
		Esperar(ElementoCampoStartDate);
		return GetDriver().findElement(ElementoCampoStartDate);
	}

	public Select ComboInsuranceSum() {
		Esperar(ElementoComboInsuranceSum);
		return new Select(GetDriver().findElement(ElementoComboInsuranceSum));
	}

	public Select ComboMeritRating() {
		Esperar(ElementoComboMeritRating);
		return new Select(GetDriver().findElement(ElementoComboMeritRating));
	}

	public Select ComboDamageInsurance() {
		Esperar(ElementoComboDamageInsurance);
		return new Select(GetDriver().findElement(ElementoComboDamageInsurance));
	}

	public WebElement CheckBoxOptionalProductsEuroProtection() {
		Esperar(ElementoCheckBoxOptionalProductsEuroProtection);
		return GetDriver().findElement(ElementoCheckBoxOptionalProductsEuroProtection);
	}

	public Select ComboCourtesyCar() {
		Esperar(ElementoComboCourtesyCar);
		return new Select(GetDriver().findElement(ElementoComboCourtesyCar));
	}

	public WebElement BotaoNext() {
		Esperar(ElementoBotaoNext);
		return GetDriver().findElement(ElementoBotaoNext);
	}
	
	// Asserts || Texts || Methods

	public void PreencherOFormularioDaAbaEnterProductData() {
		CampoStartDate().sendKeys("01/01/2022");
		ComboInsuranceSum().selectByVisibleText("3.000.000,00");
		ComboMeritRating().selectByVisibleText("Malus 16");
		ComboDamageInsurance().selectByVisibleText("No Coverage");
		CheckBoxOptionalProductsEuroProtection().click();
		ComboCourtesyCar().selectByVisibleText("No");
	}

	// Elements By
	By ElementoBotaoStepEnterProductData = By.id("enterproductdata");
	By ElementoCampoStartDate = By.id("startdate");
	By ElementoComboInsuranceSum = By.id("insurancesum");
	By ElementoComboMeritRating = By.id("meritrating");
	By ElementoComboDamageInsurance = By.id("damageinsurance");
	By ElementoCheckBoxOptionalProductsEuroProtection = By.xpath("//label[.='Optional Products']/../p//label[1]");
	By ElementoComboCourtesyCar = By.id("courtesycar");
	By ElementoBotaoNext = By.id("nextselectpriceoption");
}
