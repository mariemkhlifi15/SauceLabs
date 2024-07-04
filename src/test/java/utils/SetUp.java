package utils;

import io.cucumber.java.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;



    public class SetUp {
        public static WebDriver Driver;

        @Before
        public void SetWebDriver() {

            String browser = System.getProperty("browser");

            if (browser == null) {
                browser = "chrome";
            }
            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    Driver = new ChromeDriver(chromeOptions);
                    Driver.manage().window().maximize();

                    break;

                case "firefox":
                    FirefoxProfile profile = new FirefoxProfile();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setCapability("platform", Platform.WIN10);
                    firefoxOptions.setProfile(profile);
                    Driver = new FirefoxDriver();
                    Driver.manage().window().maximize();

                    break;

                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.setCapability("platform", Platform.WIN10);
                    Driver = new EdgeDriver(edgeOptions);
                    Driver.manage().window().maximize();
                    break;

                default:
                    throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported");

            }

        }

        public static WebDriver getDriver() {
            return Driver;
        }
    }



