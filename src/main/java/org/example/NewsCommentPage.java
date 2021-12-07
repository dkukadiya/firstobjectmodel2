package org.example;

import org.openqa.selenium.By;

public class NewsCommentPage extends Utils
{
     By _AddTitle=By.id("AddNewComment_CommentTitle");
    By _AddComment=By.id("AddNewComment_CommentText");

    public void userShouldbeAbletoEnterNewsCommentinNewsCommentbox()
    {

        typetext(_AddTitle,"Books");
        //Type the Comment in commentfield box
        typetext(_AddComment,"This Books product is really interesting and good price aswell.");
        //Click on the  new Comment button
        waitForClickable(By.xpath("//div/button[@class=\"button-1 news-item-add-comment-button\"]"),10);
        clickOnElement(By.xpath("//div/button[@class=\"button-1 news-item-add-comment-button\"]"));
    }}

