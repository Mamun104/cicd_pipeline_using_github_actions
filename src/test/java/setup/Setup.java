package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.TestInstance;

import java.time.Duration;

public class Setup {

    public WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterTest
    public void closeBrowser() {

        driver.close();
    }
}
