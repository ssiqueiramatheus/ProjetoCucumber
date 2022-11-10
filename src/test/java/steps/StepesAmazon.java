package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ResultadoBuscaPage;

public class StepesAmazon {
	WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Dado("que esteja na pagina: {string}")
	public void que_esteja_na_pagina(String url) {
		driver.get(url);
	}

	@Quando("fizer a busca pelo produto: {string}")
	public void fizer_a_busca_pelo_produto(String produto) {

		HomePage homepage = new HomePage(driver);
		homepage.realizaBusca(produto);
	}

	@Então("vou verificar se o valor está acima de {string}")
	public void vou_verificar_se_o_valor_está_acima_de(String digitoSenha) {

		ResultadoBuscaPage resultadoBuscaPage = new ResultadoBuscaPage(driver);
		resultadoBuscaPage.clicarProduto();
		resultadoBuscaPage.retornarValorProduto(digitoSenha);
	}

}
