package Ferramentas;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;


public class BasePage extends DriverFactory{

	public WebDriverWait Wait;
	public JavascriptExecutor Js = (JavascriptExecutor) DriverFactory.GetDriver();

	public void Esperar(By Elemento) {

		Wait = new WebDriverWait(DriverFactory.GetDriver(), 10);
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".load-interceptor")));
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Elemento));
		Wait.until(ExpectedConditions.elementToBeClickable(Elemento));
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".load-interceptor")));
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Elemento));
		} catch (Exception e) {

		}
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".load-interceptor")));
	}

	public void VerificarCondicaoFalsa(boolean Elemento) {
		Assert.assertFalse(Elemento);
	}

	public void VerificarCondicaoVerdadeira(boolean Elemento) {
		Assert.assertTrue(Elemento);
	}

	public boolean VerificarSeElementoExiste(By Elemento) {
		try {
			DriverFactory.GetDriver().findElement(Elemento);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}