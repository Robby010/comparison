package scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmagScraper {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        driver.get("http://www.emag.ro");



        WebElement element = driver.findElement(By.name("query"));


        element.sendKeys("Boxa");


        element.submit();

        System.out.println("Page title is: " + driver.getTitle());


        System.out.println("Page title is: " + driver.getTitle());

        WebElement element1 = driver.findElement(By.className("product-title"));
        WebElement element2 = driver.findElement(By.className("product-new-price"));
        System.out.println(element1.getText()+" "+element2.getText());




        driver.close();
    }
}