package scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AltexScraper {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //The website we use for the search
        driver.get("https://altex.ro/cauta/?q=Boxa");


//        //Gets the search box
//        WebElement element = driver.findElement(By.className("Search-input"));
//
//        //Enters the searched word
//        element.sendKeys("Boxa");
//
//        //Submits the searched word
//        element.submit();
        Thread.sleep(5000);
        System.out.println("Page title is: " + driver.getTitle());



        WebElement element1 = driver.findElement(By.cssSelector("li.Products-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(2) > a:nth-child(1)"));
        //Gets the product price
        WebElement element2 = driver.findElement(By.className("Price-current"));
        System.out.println(element1.getText());
        System.out.println(element2.getText());

        System.out.println("Page title is: " + driver.getTitle());

        //Closes the connection
        driver.close();
    }
}