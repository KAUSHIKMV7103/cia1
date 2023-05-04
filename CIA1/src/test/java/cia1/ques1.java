package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ques1 {
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.in/Messi-Football-Jersey-Shorts-XX-Large/dp/B0BX463SCH/ref=sr_1_2_sspa?crid=1G9S3939J7G77&keywords=messi%2Bjersey%2Bbarcelona&qid=1683195320&sprefix=messi%2Bjersey%2Bbarcelona%2Caps%2C653&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1&psc=1");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String etitle = "Messi 10 Football Jersey 2022/23 with Black Shorts (Boys & Kids)";
        if(title.equals(etitle)) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("Is item added to cart:" + present);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(removeText.equals(extext)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/Messi-Football-Jersey-Shorts-XX-Large/dp/B0BX463SCH/ref=sr_1_2_sspa?crid=1G9S3939J7G77&keywords=messi%2Bjersey%2Bbarcelona&qid=1683195320&sprefix=messi%2Bjersey%2Bbarcelona%2Caps%2C653&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1&psc=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
        Thread.sleep(1000);
        String sign = driver.getTitle();
        System.out.println(sign);
        String esign = "Amazon Sign In";
        if(sign.equals(esign)) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failure");
        }
    }
}