package selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.core.Is.is;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testTodayDate(){
        //given
        driver.get("http://www.delfi.lt");

        //when
        WebElement title = driver.findElement((By.className("header-date")));

        //then
        Assert.assertThat(title.getText(), is("Lapkričio 17 d., sekmadienis"));
    }
}
