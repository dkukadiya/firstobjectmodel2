package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager
{
    private static Object By;

    public static  void captureScreenshot(String filename)
    {
        //convert web driver object to TakeScreenshot
        TakesScreenshot scrshot=((TakesScreenshot) driver );
        //call getScreenshots method to create image file
        File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
        //move image file to new destination
        File destFile=new File("src/test/java/Screenshots/"+filename+ currentTimestamp() + ".png");
        //copy file at destination
        try{
            FileUtils.copyFile(SrcFile, destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static  void captureScreenshot1()
    {
        //convert web driver object to TakeScreenshot
        TakesScreenshot scrshot=((TakesScreenshot) driver );
        //call getScreenshots method to create image file
        File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
        //move image file to new destination
        File destFile=new File("src/test/java/Screenshots/"+ currentTimestamp() + ".png");
        //copy file at destination
        try{
            FileUtils.copyFile(SrcFile, destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

        public static void clickOnElement(By by)
        {
            driver.findElement(by).click();
        }

        public static void typetext(By by, String text)
        {
            driver.findElement(by).sendKeys(text);
        }
        public static String getTextFromElement(By by)
        {
            return driver.findElement(by).getText();
        }
        public static String currentTimestamp()
        {
            Date date=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
            return sdf.format(date);
        }
        public static void waitForClickable(By by,int timeInSeconds)
        {
            WebDriverWait wait= new WebDriverWait(driver,timeInSeconds);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }
        public static void waitForVisible(By by,int timeInSeconds)
        {
            WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        public static void selectFromDropIndex(By by ,int number)
        {
            Select select=new Select(driver.findElement(by));
            select.selectByIndex(number);
        }
        public static void selectByFromValue(By by,String Value)
        {
            Select select=new Select(driver.findElement(by));
            select.selectByValue(Value);
        }
        public static void selectByVisibletext(By by,String text)
        {
            Select select=new Select(driver.findElement(by));
            select.selectByVisibleText(text);
        }}
