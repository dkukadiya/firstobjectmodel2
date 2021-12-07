package org.example;

import org.openqa.selenium.By;

public class ReferAProductTobeFriend extends Utils
{
    By _friendemailid=By.id("FriendEmail");
    By _personnelMessage=By.id("PersonalMessage");
    By _clickonsendemailButton=By.name("send-email");


    public void usercanenteremailfrienddetails()
    {
        //Enter the Friend's email
        typetext(_friendemailid,"abc+" +currentTimestamp() + "@gmail.com");
        //Enter personnel Message
        typetext(_personnelMessage,"This product is Good and excellent condition.");
        //Click on send Email Button
        waitForClickable(_clickonsendemailButton, 10);
        clickOnElement(_clickonsendemailButton);
    }
}
