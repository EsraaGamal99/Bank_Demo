package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.example.pages.P01_login;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class D01_loginStepDef {
P01_login login= new P01_login(Hooks.driver);

@Given("user go to demo page")
    public void go_to_demo_page(){
    ////from Hooks class
     }

     @And("user enters valid userid")
     public void valid_ID(){
        login.userID().sendKeys("mngr452808 ");
     }

    @And("user enters valid pass")
    public void valid_password(){
    login.Password().sendKeys("serEhYs ");
    }
    @And("user enters invalid pass")
    public void invalid_password(){
        login.Password().sendKeys("serE0000 ");
    }
     @Then("users clicks login")
       public void login_click(){
    login.login_button().click();
     }

     @Then("login successfully")
    public void login_successfully(){
    SoftAssert soft = new SoftAssert();
         String expectedResult = "https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
         String actualResult = Hooks.driver.getCurrentUrl();
         soft.assertEquals(actualResult,expectedResult,"URL");
   soft.assertTrue(login.homeTitle().getText().contains("Welcome To Manager's Page of Guru99 Bank"));
   soft.assertTrue(false);
     }
    @Then("take a screen shot")
    public static void takeScreenShot() throws IOException {
        TakesScreenshot screen = ((TakesScreenshot)Hooks.driver);
        File scrFilt = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFilt,new File("D:\\testScreenShot.jpg"));
    }

    @And("user enters invalid userid")
    public void invalid_ID(){
        login.userID().sendKeys("mngr");
    }
    @Then("UnSuccess login")
    public void UnSuccess_login(){
        SoftAssert soft = new SoftAssert();
        //soft.assertTrue();
       String alert=  Hooks.driver.switchTo().alert().getText();
        soft.assertEquals(alert,"User or Password is not valid","0000000000000000000000");
    }
}
