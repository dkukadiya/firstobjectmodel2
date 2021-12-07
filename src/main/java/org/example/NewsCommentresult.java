package org.example;

import org.openqa.selenium.By;
import org.testng.*;



public class NewsCommentresult extends Utils
{
    public void userAddedMessagenewsCommentSuccesfullyinPage()
    {
        //print the 'Message News comment is successfully added' in the concole
        String ActualCommentSuccesMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String ExpectedRegisterSuccesMessage = "News comment is successfully added.";
        Assert.assertEquals(ActualCommentSuccesMessage,(ExpectedRegisterSuccesMessage), "News comment is successfully added");
    }
}