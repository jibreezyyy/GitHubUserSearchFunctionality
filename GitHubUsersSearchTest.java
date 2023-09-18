package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitHubUsersSearchTest {
    WebDriver driver;
    GitHomePage homePage;
    UserDetailPage user;
    UserRepositoriesPage repo;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       
      
        
    }
    
    @Test
    public void GitHubHomePage() throws InterruptedException{
        homePage = new GitHomePage(driver);
         driver.get("https://gh-users-search.netlify.app/");
        homePage.search("Messanjay31");
        homePage.submit();
        Thread.sleep(2000);
        homePage.follow();
         Thread.sleep(2000);

       
    }

    @Test
    public void UserDetailPage() throws InterruptedException{
        user = new UserDetailPage(driver);
        driver.get("https://github.com/messanjay31");
        String rname = "Sanjay Shah";
        String fname = user.pangalansetter();

        Assert.assertEquals(rname, fname);

        String abio = "Creative full stack spring, hibernate developer dedicated to building and optimizing the performance of user-centric, high-impact software.";
        String bbio = user.bio();

        Assert.assertEquals(abio, bbio);

        String alokasyon = "kathmandu";
        String blokasyon = user.location();

        Assert.assertEquals(alokasyon, blokasyon);
        user.repos();
        Thread.sleep(3000);


    }
    @Test
    public void UserRepositoriesPage() throws InterruptedException{
        repo = new UserRepositoriesPage(driver);
           driver.get("https://github.com/messanjay31?tab=repositories");
    
        int totalrepo = 14;
        int reposeele = repo.reposi();
        Assert.assertEquals(totalrepo, reposeele);

        int descs = 6;
        int descss = repo.description();
        Assert.assertEquals(descss, descs);

    }
    
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    
}
