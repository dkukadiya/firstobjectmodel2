package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage extends Utils
{
    By _firstNamefiled=By.id("FirstName");
    By _lastNamefiled=By.id("LastName");
    By _email=By.name("Email");
    By _password=By.id("Password");
    By _Confirmpassword=By.id("ConfirmPassword");
    //click on register button
    By _register=By.name("register-button");

    public void usercanAddRegistrationDetails(){

        //Type Firstname
        typetext(_firstNamefiled,"Viral");
        // Type last name
        typetext(_lastNamefiled,"Patel");
        //select day from dropdown
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("15");
        //select month from dropdown
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByValue("4");
        //select year from dropdown
        Select selectYear=new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("1923");
        //Type email address
        typetext(_email,"dkukadiya+"+ currentTimestamp() +"@gmail.com");
        //Type Password
        typetext(_password,"viraj123");
        //Type Confirm Password
        typetext(_Confirmpassword ,"viraj123");
        //Click on register button
        waitForClickable(By.name("register-button"), 10);
        clickOnElement(_register);
    }
}
