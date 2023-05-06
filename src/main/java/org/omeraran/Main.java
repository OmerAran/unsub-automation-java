package org.omeraran;


import org.omeraran.model.Linkedin;
import org.omeraran.service.LinkedinService;


public class Main {
    public static void main(String[] args)  {
        Linkedin linkedin = new Linkedin();
        LinkedinService linkedinService = new LinkedinService();
        try {
            linkedinService.removeAllFollowings(linkedin);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        ChromeOptions options = new ChromeOptions();
//        String userAgents = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.5615.137 Safari/537.36";
//        options.addArguments(userAgents);
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fmynetwork%2Fnetwork-manager%2Fpeople-follow%2Ffollowers%2F&fromSignIn=true&trk=cold_join_sign_in");
//
//        driver.findElement(By.id("username")).sendKeys("mail@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("password");
//        //driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
//        driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
//        Thread.sleep(1500);
//        for (int i = 0; i < 50; i++) {
//            driver.get("https://www.linkedin.com/mynetwork/network-manager/people-follow/following/");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//*[@data-control-name='entity_action_primary']")).click();
//            Thread.sleep(1500);
//            driver.findElement(By.xpath("//*[@class='artdeco-modal__confirm-dialog-btn artdeco-button artdeco-button--2 artdeco-button--primary ember-view']")).click();
//            Thread.sleep(1000);
//            driver.get("https://www.linkedin.com/mynetwork/network-manager/people-follow/followers/");
//            Thread.sleep(2000);
//        }
//        driver.quit();

    }
}