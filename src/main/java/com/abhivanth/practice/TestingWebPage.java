package com.abhivanth.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestingWebPage {
    private static void clickElectronic(WebDriver driver){
        driver.findElement(By.cssSelector(".hl-cat-nav__js-tab:nth-of-type(3)")).click();

        WebElement dealElement = driver.findElement(By.cssSelector(".b-visualnav__title"));
        if(dealElement.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(By.cssSelector(".b-visualnav__title")).click();
        }
    }
    private static void typeInSearchBox(WebDriver driver){

        driver.findElement(By.id("gh-ac")).sendKeys("iphone 13");
        driver.findElement(By.id("gh-btn")).click();

        List<WebElement> webElementList = driver.findElements(By.cssSelector(".clearfix.s-item__info"));

        for (WebElement element : webElementList){
            String currentString =  element.getText();
            System.out.println(currentString);
        }

    }


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver.manage().window().maximize();

        String url = "https://www.ebay.de/";
        driver.get(url);

        clickElectronic(driver);
//        typeInSearchBox(driver);






    }
}
