package org.example.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class screen {
    public static void takeScreenShot(WebDriver driver,String screenPath) throws IOException {
        TakesScreenshot screen = ((TakesScreenshot)driver);
        File scrFilt = screen.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFilt,new File(screenPath));
    }
}
