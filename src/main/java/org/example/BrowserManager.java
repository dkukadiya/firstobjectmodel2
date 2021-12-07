package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage
{
    String browserName="firefox";

    public void openBrowser()
    {
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","src/test/java/driver/msedgedriver.exe");
            driver = new EdgeDriver();
        }else if(browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/java/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }else{
            System.out.println("Your browser name is wrong");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Type the Url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBroser(){
        driver.close();
    }
}







