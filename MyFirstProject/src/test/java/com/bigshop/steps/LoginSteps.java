package com.bigshop.steps;
import com.bigshop.driver.CustomWebDriverManager;
import com.bigshop.pages.HomePage;
import com.bigshop.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private WebDriver driver = CustomWebDriverManager.getDriver();
    private LoginPage loginPage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);

    @Given("the app login page is open")
    public void the_app_login_page_is_open() {
        driver.get("https://bigshop.md/ro/auth/login");
    }

    @When("the user enters correct {string} and {string}")
    public void the_user_enters_correct_email_and_password(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("the user is logged in")
    public void the_user_is_logged_in() {
        assertTrue(homePage.isUserLoggedIn());
    }
}