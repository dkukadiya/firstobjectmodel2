package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferAproductTobeFriendResultPage extends Utils
{
    public void verifyUserReferAProductToFriendSuccessFully()
    {
        //Confitmation Message on Sending Email
        String ActualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String ExpectedMessge = "Your message has been sent.";
        Assert.assertEquals(ActualMessage,ExpectedMessge," Your message has not been sent.");
    }
}
