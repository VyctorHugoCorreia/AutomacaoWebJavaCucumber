package Ferramentas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
	public String url;
	public WebDriver webdriver;

	// PageObjects
	public PageObjects.PageObjectElementosDaAbaEnterVehicleData ElementosDaAbaEnterVehicleData = new PageObjects.PageObjectElementosDaAbaEnterVehicleData();
	public PageObjects.PageObjectElementosDaAbaEnterInsurantData ElementosDaAbaEnterInsurantData = new PageObjects.PageObjectElementosDaAbaEnterInsurantData();
	public PageObjects.PageObjectElementosDaAbaEnterProductData ElementosDaAbaEnterProductData = new PageObjects.PageObjectElementosDaAbaEnterProductData();
	public PageObjects.PageObjectElementosDaAbaSelectPriceOption ElementosDaAbaSelectPriceOption = new PageObjects.PageObjectElementosDaAbaSelectPriceOption();
	public PageObjects.PageObjectElementosDaAbaSendQuote ElementosDaAbaSendQuote = new PageObjects.PageObjectElementosDaAbaSendQuote();

	public void IniciarChromeDriverEAcessarWebSite() {

		url = "http://sampleapp.tricentis.com/101/app.php";
		webdriver = Ferramentas.DriverFactory.GetDriver();
		webdriver.navigate().to(url);
	}

	public void FinalizarChromeDriverEAcessarWebSite() {
		webdriver.quit();
		Ferramentas.DriverFactory.KillDriver();
	}
}
