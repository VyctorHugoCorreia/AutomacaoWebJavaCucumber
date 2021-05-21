package Ferramentas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
	public String url;
	public WebDriver webdriver;

	// PageObjects
    public PageObjects.PageObjectElementosDaAbaEnterVehicleData ElementosDoStepEnterVehicleData = new PageObjects.PageObjectElementosDaAbaEnterVehicleData();
    public PageObjects.PageObjectElementosDaAbaEnterInsurantData ElementosDoStepEnterInsurantData = new PageObjects.PageObjectElementosDaAbaEnterInsurantData();
    public PageObjects.PageObjectElementosDaAbaEnterProductData ElementosDoStepEnterProductData = new PageObjects.PageObjectElementosDaAbaEnterProductData();
    public PageObjects.PageObjectElementosDaAbaSelectPriceOption ElementosDoStepSelectPriceOption = new PageObjects.PageObjectElementosDaAbaSelectPriceOption();
    public PageObjects.PageObjectElementosDaAbaSendQuote  ElementosDoStepSendQuote  = new PageObjects.PageObjectElementosDaAbaSendQuote();
	
    
   
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
