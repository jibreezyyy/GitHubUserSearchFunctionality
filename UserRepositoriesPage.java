package com.example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UserRepositoriesPage {
        
             WebDriver driver;
         
             int arraylength, desclenght;
             
          
           
            
          


            public UserRepositoriesPage(WebDriver driver){

                this.driver = driver;
                PageFactory.initElements(driver, this);

             }
             
             public int reposi(){

                List<WebElement> reposis = driver.findElements(By.cssSelector("a[itemprop='name codeRepository']"));

                arraylength = reposis.size();
  
          return arraylength;
          
                }

            

            public int description(){
                List<WebElement> desc = driver.findElements(By.cssSelector("p[itemprop='description']"));

                desclenght = desc.size();
  
          return desclenght;

            }
        
             
             
            
           

           


           

        
   
    
}



