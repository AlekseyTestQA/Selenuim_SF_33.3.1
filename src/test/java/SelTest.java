import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class SelTest {
    public RemoteWebDriver driver;
    private static final String SELENIUM_URL = "http://localhost:4446/wd/hub";

    @BeforeClass
    public void start() throws Exception {
        this.driver = new RemoteWebDriver(
                new URL(SELENIUM_URL),
                new ChromeOptions()
        );
    }

    @Test
    public void seltest() {
        this.driver.get("http://Google.ru");

        try{Thread.sleep(1000);}catch(Exception e) {}

        WebElement input = this.driver.findElement(new By.ByCssSelector(".gLFyf.gsfi"));

        try{Thread.sleep(1000);}catch(Exception e) {}

        try{Thread.sleep(1000);}catch(Exception e) {}
        input.click();

        try{Thread.sleep(1000);}catch(Exception e) {}

        input.sendKeys("Skillfactory");

        try{Thread.sleep(1000);}catch(Exception e) {}

        WebElement submit = this.driver.findElement(new By.ByCssSelector(".aajZCb .lJ9FBc .gNO89b"));
        submit.click();
        try{Thread.sleep(1000);}catch(Exception e) {}
    }

    @AfterClass
    public void closeBrowser(){
        this.driver.close();
        this.driver.quit();
    }
}
