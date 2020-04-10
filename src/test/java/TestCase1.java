import Modules.SignUp;
//import com.sun.org.apache.bcel.internal.generic.NEW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestCase1 {

    @Test
    public void FaceBookTestSignUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Muhammad Ahmad/IdeaProjects/chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebDriverWait webwait = new WebDriverWait(driver, 20);

        SignUp signUp = new SignUp(driver, webwait);

        signUp.FacebookHomePage();
        signUp.SignInValues("waqar@gmail.com", "123456789");
        signUp.SignUpValues("Waqar", "Afzal", "12345", "Pakistan123");
        driver.quit();
    }
}
