package Ferramentas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseTest {
	public String url;
	public WebDriver webdriver;

	// PageObjects
	public PageObjects.PageObjectElementosDaAbaEnterVehicleData ElementosDaAbaEnterVehicleData = new PageObjects.PageObjectElementosDaAbaEnterVehicleData();
	public PageObjects.PageObjectElementosDaAbaEnterInsurantData ElementosDaAbaEnterInsurantData = new PageObjects.PageObjectElementosDaAbaEnterInsurantData();
	public PageObjects.PageObjectElementosDaAbaEnterProductData ElementosDaAbaEnterProductData = new PageObjects.PageObjectElementosDaAbaEnterProductData();
	public PageObjects.PageObjectElementosDaAbaSelectPriceOption ElementosDaAbaSelectPriceOption = new PageObjects.PageObjectElementosDaAbaSelectPriceOption();
	public PageObjects.PageObjectElementosDaAbaSendQuote ElementosDaAbaSendQuote = new PageObjects.PageObjectElementosDaAbaSendQuote();

	public void IniciarChrome() {
		url = "http://sampleapp.tricentis.com/101/app.php";
		webdriver = Ferramentas.DriverFactory.GetDriver();
		webdriver.navigate().to(url);
	}

	public void FinalizarChrome() {
		webdriver.quit();
		Ferramentas.DriverFactory.KillDriver();
	}

	public void Screeshot(String Cenario) {
		
		File Pasta = new File("target/Screenshot");
		
		if(!Pasta.exists()) {
			Pasta.mkdirs();
		}
			
		File file = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("target/Screenshot/" + Cenario + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
