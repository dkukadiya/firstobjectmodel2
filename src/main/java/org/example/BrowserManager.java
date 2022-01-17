package org.example;

import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
//Creating this class for prerforming different browser window
public class BrowserManager extends BasePage
{
    public static final String AUTOMATE_USERNAME = "dharakukadiya_SH6N8I";
    public static final String AUTOMATE_ACCESS_KEY = "zwmFapVWzc13V5XeQfqs";
    public static final String BrowserStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    //String browserName="Chrome";
     boolean cloud=true;

    LoadProp loadProp=new LoadProp();
    DesiredCapabilities caps = new DesiredCapabilities();
   // variable created as purpose of select different browser to run the test case
    public String browserName=System.getProperty("browser");
     boolean browserStackURL =Boolean.parseBoolean(System.getProperty("cloud"));
     public void openBrowser() {
        //making decision cloud true or false
        if (browserStackURL )
            //this will  be run if cloud is true (in cloud)
        {
            //this will rin if cloud true
            if (browserName.equalsIgnoreCase("chrome")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "7");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            } else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");

            } else if (browserName.equalsIgnoreCase("firefox")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "8");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.10.0");
            } else {
                System.out.println("Your browser name is wrong");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }else
          if (browserName.equalsIgnoreCase("chrome")) {
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
            driver.get(loadProp.getProperty("url"));
        }


public void closeBroser()
    {
     driver.close();
}}











