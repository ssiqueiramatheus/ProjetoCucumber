package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	WebDriver driver;

	final String PRODUTO_BUSCA = "//span[contains(text(),'Box Marvel Guerra Civil: Guerras secretas')]";
//	final String PRECO_PRODUTO = "//span[text()="R$44,14"]";

	public ResultadoBuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarProduto() {

		driver.findElement(By.xpath(PRODUTO_BUSCA)).click();
	}

	public boolean retornarValorProduto(String digitoSenha) {

	    Boolean existe = driver.findElements(By.xpath("//span[text()=" + digitoSenha +"]")).size() > 0;
		return existe;
	}


}
