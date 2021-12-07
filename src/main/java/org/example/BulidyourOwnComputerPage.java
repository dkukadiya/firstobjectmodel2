package org.example;

import org.openqa.selenium.By;

public class BulidyourOwnComputerPage extends Utils
{
    By _EmailFriendButton=By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");

    public void ClickOnEmailFriendButton()
    {
        //Click on the Email a friend Button
        clickOnElement(_EmailFriendButton);
    }}
