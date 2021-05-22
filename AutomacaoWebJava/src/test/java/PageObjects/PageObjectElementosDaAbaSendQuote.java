package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ferramentas.BasePage;

public class PageObjectElementosDaAbaSendQuote extends BasePage {
	// IwebElements

	public WebElement CampoEmail() {
		Esperar(ElementoCampoEmail);
		return GetDriver().findElement(ElementoCampoEmail);
	}

	public WebElement CampoPhone() {
		Esperar(ElementoCampoPhone);
		return GetDriver().findElement(ElementoCampoPhone);
	}

	public WebElement CampoUsername() {
		Esperar(ElementoCampoUsername);
		return GetDriver().findElement(ElementoCampoUsername);
	}

	public WebElement CampoPassword() {
		Esperar(ElementoCampoPassword);
		return GetDriver().findElement(ElementoCampoPassword);
	}

	public WebElement CampoConfirmPassword() {
		Esperar(ElementoConfirmPssword);
		return GetDriver().findElement(ElementoConfirmPssword);
	}

	public WebElement CampoComments() {
		Esperar(ElementoComments);
		return GetDriver().findElement(ElementoComments);
	}

	public WebElement BotaoSend() {
		Esperar(ElementoBotaoSend);
		return GetDriver().findElement(ElementoBotaoSend);
	}

	public WebElement BotaoStepSendQuote() {
		Esperar(ElementoBotaoStepSendQuote);
		return GetDriver().findElement(ElementoBotaoStepSendQuote);
	}

	// Asserts || Texts || Method

	public String TextoEscritoNoModalDeSucesso() {
		Esperar(By.xpath("//button[@class='confirm']"));
		return GetDriver().findElement(ElementoTextoEscritoNoModalDeSucesso).getText();
	}
	
	public void PreencherOFormularioDaAbaSendQuote() {
		CampoEmail().sendKeys("qualidade@teste.com");
		CampoPhone().sendKeys("11966009868");
		CampoUsername().sendKeys("qualiteste");
		CampoPassword().sendKeys("Qualidade@12");
		CampoConfirmPassword().sendKeys("Qualidade@12");
		CampoComments().sendKeys("Automacao de teste do formulario.");
	}

	// Elements By

	By ElementoBotaoStepSendQuote = By.id("sendquote");
	By ElementoCampoEmail = By.id("email");
	By ElementoCampoPhone = By.id("phone");
	By ElementoCampoUsername = By.id("username");
	By ElementoCampoPassword = By.id("password");
	By ElementoConfirmPssword = By.id("confirmpassword");
	By ElementoComments = By.id("Comments");
	By ElementoBotaoSend = By.id("sendemail");
	By ElementoTextoEscritoNoModalDeSucesso = By.xpath("//div[@data-animation='pop']/h2");

}
