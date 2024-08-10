package aulaselenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class ExemploDeTeste {
	@Test	
	public void abrirPaginaChrome() {
		//define caminho do webdriver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//inicia o werbdriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chromedriver.chromium.org/");
		
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		Assert.assertTrue(titulo.contains("Chrome"));
		
		driver.quit();
	}
    
}