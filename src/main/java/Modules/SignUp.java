package Modules;

import Utilities.WebPageWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

    WebDriver driver;
    WebDriverWait wait;

    //Initialize all the CSS Selector of this page
    By Email = By.cssSelector("input#email");
    By Password = By.cssSelector("input#pass");
    By FirstName = By.cssSelector("input[name=firstname]");
    By LastName = By.cssSelector("input[name=lastname]");
    By Mobile = By.cssSelector("input[name=reg_email__]");
    By NewPassword = By.cssSelector("input[name=reg_passwd__]");
    By Birthday_Day = By.cssSelector("select[name=birthday_day]");
    By BirthdayDay_15 = By.cssSelector("#day > option:nth-child(16)");
    By Birthday_Month = By.cssSelector("select[name=birthday_month]");
    By BirthdayMonth = By.cssSelector("#month > option:nth-child(2)");
    By Birthday_Year = By.cssSelector("select[name=birthday_year]");
    By BirthdayYear = By.cssSelector("#year > option:nth-child(25)");
    By Gender = By.cssSelector("input#u_0_7");
    By SignUp_Button = By.cssSelector("button[name=websubmit]");
    By RecentLogin = By.cssSelector("div[class=\"_8e63 _ihd _3ma _6s\"]");

    // Calling Construction
    public SignUp(WebDriver driver, WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;
    }

    // Method
    public void FacebookHomePage()
    {
        driver.get("https://web.facebook.com/");
        driver.manage().window().maximize();
    }

    public void SignInValues(String EmailInput, String PasswordInput)
    {
        WebPageWait.waitAndEnterValues(driver, Email, EmailInput);
        WebPageWait.waitAndEnterValues(driver, Password, PasswordInput);
    }

    public void SignUpValues(String FirstNameInput, String LastNameInput, String MobileInput, String NewPasswordInput)
    {
        WebPageWait.waitAndEnterValues(driver, FirstName, FirstNameInput);
        WebPageWait.waitAndEnterValues(driver, LastName, LastNameInput);
        WebPageWait.waitAndEnterValues(driver, Mobile, MobileInput);
        WebPageWait.waitAndEnterValues(driver, NewPassword, NewPasswordInput);
        WebPageWait.waitAndClick(driver, Birthday_Day);
        WebPageWait.waitAndClick(driver, BirthdayDay_15);
        WebPageWait.waitAndClick(driver, Birthday_Month);
        WebPageWait.waitAndClick(driver, BirthdayMonth);
        WebPageWait.waitAndClick(driver, Birthday_Year);
        WebPageWait.waitAndClick(driver, BirthdayYear);
        WebPageWait.waitAndClick(driver, Gender);
        WebPageWait.waitAndClick(driver, SignUp_Button);


    }


}
