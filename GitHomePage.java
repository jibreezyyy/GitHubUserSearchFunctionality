package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GitHomePage {
        
             WebDriver driver;

             
             @FindBy(css =  "[placeholder='enter github user name']")
             WebElement search;
             
               @FindBy(css = "button[type='submit']")
             WebElement submit;

              @FindBy(partialLinkText = "Follow")
              WebElement follow;
               
              
             
            

              


            public GitHomePage(WebDriver driver){

                this.driver = driver;
                PageFactory.initElements(driver, this);

             }
             
             public void search(String strSearch){
                search.sendKeys("Messanjay31");
             }
             
             public void submit(){
                submit.click();
             }
             public void follow(){
                follow.click();
             }
            //  public void remember(){
            //    remember.click();
            //  }

           


           

        
   
    
}



