package org.omeraran.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtil {

    public static WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        String userAgents = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.5615.137 Safari/537.36";
        options.addArguments(userAgents);
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }
}
