package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UserDetailPage {
        
             WebDriver driver;

             String pangalan;
             String biot;
             String lokasyon;
             
             @FindBy(css = "span[itemprop= name]")
             WebElement name;
             
             @FindBy(className = "p-note")
             WebElement bio;

             @FindBy(className =  "p-label")
             WebElement location;
              

              @FindBy(partialLinkText = "Repositories")
              WebElement repo;
               
              
              
             
            

              


            public UserDetailPage(WebDriver driver){

                this.driver = driver;
                PageFactory.initElements(driver, this);

             }
             
             public String pangalansetter(){
                pangalan =  name.getText().toString();

                return pangalan;
                
        
             }
             
             public String bio(){
                biot = bio.getText().toString();

                return biot;
             }
            public String location(){
                lokasyon = location.getText().toString();

                return lokasyon;
            }
            public void repos(){
                driver.manage().window().maximize();
                repo.click();
            }
           

           


           

        
   
    
}



