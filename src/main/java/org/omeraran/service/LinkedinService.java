package org.omeraran.service;

import org.omeraran.model.Linkedin;
import org.omeraran.util.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LinkedinService {

    public LinkedinService() {
    }

    public void removeAllFollowings(Linkedin linkedin) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getWebDriver();
        driver.get(linkedin.getSignInUrl());
        driver.findElement(By.id(linkedin.getLoginUsernameId())).sendKeys(linkedin.getLoginUsername());
        driver.findElement(By.id(linkedin.getLoginPasswordId())).sendKeys(linkedin.getLoginPassword());
        driver.findElement(By.xpath(linkedin.getLoginClick())).click();
        Thread.sleep(1500);
        for (int i = 0; i < linkedin.getFollowerCount(); i++) {
            driver.get(linkedin.getCompanyList());
            Thread.sleep(2000);
            driver.findElement(By.xpath(linkedin.getClickToUnfollowDataControlName())).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath(linkedin.getClickToUnfollowSecond())).click();
            Thread.sleep(1000);
            driver.get(linkedin.getFollowerList());
            Thread.sleep(2000);
        }
        driver.quit();
    }
}
