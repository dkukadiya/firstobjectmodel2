package org.example;

import org.openqa.selenium.By;
//import org.testng.Assert;

public class HomePage extends Utils

{
    //Click on register button
    By _registerLinkButton=By.linkText("Register");
    By _clickonnewsonlinestore=By.linkText("New online store is open!");
    By _computer=By.linkText("Computers");
    public void clickonRegisterButton()
    {
        clickOnElement(_registerLinkButton);

    }
    public void NewOnlineStoreIsOpen()
    {
        //Click on New online store is open
        clickOnElement(_clickonnewsonlinestore);
    }
    public void clickOnComputer()
    {
        //Click on computer menu bar
        clickOnElement(_computer);
    }
}
