package PageObjects;
import Ferramentas.DriverFactory;
import Ferramentas.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import Ferramentas.BasePage;
import org.openqa.selenium.*;
import Ferramentas.DriverFactory;

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
		
		// Asserts

		public boolean EstaSendoExibidoOStepSendQuote() {
			Esperar(By.id("phone"));
			return GetDriver().findElement(By.id("phone")).isEnabled();
		}
		
		// Elements By
		By ElementoRadioButtonSilver = By.xpath("//input[@id='selectsilver']/../span");
		By ElementoBotaoNext = By.id("nextsendquote");
}
