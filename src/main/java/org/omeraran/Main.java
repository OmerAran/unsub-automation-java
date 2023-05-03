package org.omeraran;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        String userAgents = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.5615.137 Safari/537.36";
        options.addArguments(userAgents);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?client_id=717762328687-iludtf96g1hinl76e4lc1b9a82g457nn.apps.googleusercontent" +
                ".com&scope=profile%20email&redirect_uri=https%3A%2F%2Fstackauth" +
                ".com%2Fauth%2Foauth2%2Fgoogle&state=%7B%22sid%22%3A1%2C%22st%22%3A%2259%3A3%3A1b8%2C16%3A751db3bd0c" +
                "9f310a%2C10%3A1683153436%2C16%3A8a34ac06f5d2a2ee%2C6ded9aec0aadeca63d356015f77de881e8545c9a0ece0b7eef" +
                "4ce55592a14939%22%2C%22cid%22%3A%22717762328687-iludtf96g1hinl76e4lc1b9a82g457nn.apps.googleusercontent" +
                ".com%22%2C%22k%22%3A%22Google%22%2C%22ses%22%3A%220e999f56170842b187fc481efb540c9c%22%7D&response_type=" +
                "code&service=lso&o2v=1&flowName=GeneralOAuthFlow");
        driver.findElement(By.id("identifierId")).sendKeys("varartik63@gmail.com");
        driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
        driver.findElement(By.name("password")).sendKeys("KARACA63m1w");
        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
        Thread.sleep(1500);
        driver.get("https://youtube.com/feed/channels");
        driver.findElement(By.xpath("//*[@class='yt-spec-touch-feedback-shape__fill']")).click();
        driver.quit();

    }
}