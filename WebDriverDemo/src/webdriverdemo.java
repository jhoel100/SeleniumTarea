import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverdemo {

	public static void main(String[] args) {
		//dirección del geckodriver.exe
		System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //manda a navegar en internet a la direccion siguiente
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximiza la ventana
	      driver.manage().window().maximize();
	      
	      // Click en math calculator
	      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
	      
	      // Click en binary calculator
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[7]/a")).click();

	      // Click en el boton Clear
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/img")).click();
	      
	      // Entra un valor en el primer espacio
	      driver.findElement(By.id("number1")).sendKeys("100");
	      
	      // Entra un valor en el segundo espacio
	      driver.findElement(By.id("number2")).sendKeys("10");
	      
	      // Click en el boton Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
	      
	      //Saca el resultado del xpath correspondiente
	      String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/font/b")).getText();

	      //Lo imprime en consola
	      System.out.println(" The Result is " + result);

	      
	      //Close the Browser.
	      //driver.close();
	}

}