package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DeskTopPage extends Utils
{
        By _clickonComputer=By.linkText("Build your own computer");
        public void VerifyUsershouldBeabletoNavigateToDesktopPage()
        {
            //Compare the Desktops word for verify
            Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));
        }
        public void userCanClickOnBuildYourOwncomputer()
        {
                //click on the Build your own computer
                clickOnElement(_clickonComputer);
        }
}
