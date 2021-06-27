package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_SELECT = "//button[contains(@title, \"Akceptuj wszystkie\")]";
    public static final String XPATH_CREATE = "//a[contains(@data-testid, \"open-registration-form-button\")]";
    public static final String XPATH_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_YEAR = "//select[contains(@name, \"birthday_year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement searchField = driver.findElement(By.xpath(XPATH_SELECT));
        searchField.click();

        WebElement searchField2 = driver.findElement(By.xpath(XPATH_CREATE));
        searchField2.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);

        WebElement findDay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_DAY)));
        Select selectDay = new Select(findDay);
        selectDay.selectByIndex(1);

        WebElement findMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(findMonth);
        selectMonth.selectByVisibleText("lis");

        WebElement findYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(findYear);
        selectYear.selectByValue("2005");
    }
}
