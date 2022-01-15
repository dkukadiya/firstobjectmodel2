package org.example;
import org.testng.annotations.Test;


public class TestSuite extends BaseTest
{
    HomePage homepage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationResultPage registrationResultPage=new RegistrationResultPage();
    NewsCommentPage newsCommentPage=new NewsCommentPage();
    NewsCommentresult newsCommentresult=new NewsCommentresult();
    ComputerPage computerPage=new ComputerPage();
    DeskTopPage desktopPage=new DeskTopPage();
    BulidyourOwnComputerPage bulidyourOwnComputerPage=new BulidyourOwnComputerPage();
    ReferAProductTobeFriend referAProductTobeFriend=new ReferAProductTobeFriend();
    ReferAproductTobeFriendResultPage referAproductTobeFriendResultPage=new ReferAproductTobeFriendResultPage();

    @Test
    public void verifyUserShouldbeabletoRegisterSuccesfully()
        {
             homepage.clickonRegisterButton();
             captureScreenshot1();
             registrationPage.usercanAddRegistrationDetails();
             registrationResultPage.verifyUserShouldbeabletoRegisterSuccesfully();
        }
    @Test
    public void userAddedMessageNewsCommentSuccessFullyInPage()
    {
        homepage.NewOnlineStoreIsOpen();
        newsCommentPage.userShouldbeAbletoEnterNewsCommentinNewsCommentbox();
        newsCommentresult.userAddedMessagenewsCommentSuccesfullyinPage();

    }
    @Test
    public void VerifyUserShouldBeAbleToNavigateToDesktopPage()
    {
        homepage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.VerifyUsershouldBeabletoNavigateToDesktopPage();
    }
    @Test
    public void VerifyRegisterUserShouldBeAbleToReferAProductToFriend()
    {
        verifyUserShouldbeabletoRegisterSuccesfully();
        VerifyUserShouldBeAbleToNavigateToDesktopPage();
        desktopPage.userCanClickOnBuildYourOwncomputer();
        bulidyourOwnComputerPage.ClickOnEmailFriendButton();
        referAProductTobeFriend.usercanenteremailfrienddetails();
        referAproductTobeFriendResultPage.verifyUserReferAProductToFriendSuccessFully();
    }}





