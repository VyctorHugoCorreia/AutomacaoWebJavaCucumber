package PageObjects;

import Ferramentas.BasePage;
import org.openqa.selenium.*;


public class PageObjectElementosDaAbaSelectPriceOption extends BasePage {
	// IwebElements

	public WebElement RadioButtonSilver() {
		Esperar(ElementoRadioButtonSilver);
		return GetDriver().findElement(ElementoRadioButtonSilver);
	}

	public WebElement BotaoNext() {
		Esperar(ElementoBotaoNext);
		return GetDriver().findElement(ElementoBotaoNext);
	}

	// Asserts || Texts || Method
	public void PreencherOFormularioDaAbaSelectPriceOption() {
		RadioButtonSilver().click();
	}

	// Elements By
	By ElementoRadioButtonSilver = By.xpath("//input[@id='selectsilver']/../span");
	By ElementoBotaoNext = By.id("nextsendquote");
}
