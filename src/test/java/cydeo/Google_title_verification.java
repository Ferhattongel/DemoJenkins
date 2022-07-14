package cydeo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_title_verification {
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
    @Given("user on the google page")
    public void userOnTheGooglePage() {
        Driver.getDriver().get("https://google.com");
    }

    @When("user search {string}")
    public void userSearch(String arg0) {
        WebElement element=Driver.getDriver().findElement(By.name("q"));
        element.sendKeys(arg0+ Keys.ENTER);
    }

    @Then("user should be able to see title starts with {string}")
    public void userShouldBeAbleToSeeTitleStartsWith(String arg0) {
        String title=Driver.getDriver().getTitle();

       Assert.assertTrue(title.startsWith(arg0));
        System.out.println(title);
    }
}
