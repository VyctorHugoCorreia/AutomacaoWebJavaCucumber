package Ferramentas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	 private static WebDriver Driver;
	 
	 public static WebDriver GetDriver()
     {
         if (Driver == null)
         {       
             ChromeOptions Configuracoes = new ChromeOptions();
             Configuracoes.addArguments("start-maximized");
             Driver = new ChromeDriver(Configuracoes);
         }
         return Driver;
       
     }
	  public static void KillDriver()
      {
          if (Driver != null)
          {
              Driver.quit();
              Driver = null;
          }
      }
}
