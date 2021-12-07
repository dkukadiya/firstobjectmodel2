package org.example;

import org.openqa.selenium.By;
import org.testng.*;

public class RegistrationResultPage extends RegistrationPage
{
   public void verifyUserShouldbeabletoRegisterSuccesfully()
   {

      String actualRegisterSuccessmessage = getTextFromElement(By.xpath("//div[@class='result']"));
      String expectedRegisterSuccessmessge = "Your registration completed";
      Assert.assertEquals(actualRegisterSuccessmessage,expectedRegisterSuccessmessge);
   }}
