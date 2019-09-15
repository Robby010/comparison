package scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AltexScraper {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        driver.get("http://www.altex.ro/home/");



        WebElement element = driver.findElement(By.className("Search-input"));


        element.sendKeys("Boxa");


        element.submit();

        System.out.println("Page title is: " + driver.getTitle());




        //WebElement element1 = driver.findElement(By.className("Product-nameHeading"));
        WebElement element2 = driver.findElement(By.className("Price-current"));
        //System.out.println(element1.getText());
        System.out.println(element2.getText());

        System.out.println("Page title is: " + driver.getTitle());


        driver.close();
    }
}