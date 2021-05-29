package pl.coderslab.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressZad1Definition {
    WebDriver driver;
    //wemole5481@geekale.com     mail
    //wemole5481                 passowrd
    // firts name               Grzegorz
    // last name                Biernat
    //birthdate                 Birthdate
    @Given("^zalogowany na usera z (\\d+)minut mail$")
    public void zalogowanyNaUseraZMinutMail(int arg0) {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        WebElement element_email = driver.findElement(By.name("email"));
        element_email.click();
        element_email.clear();
        element_email.sendKeys("wemole5481@geekale.com");
        WebElement element_password = driver.findElement(By.name("password"));
        element_email.click();
        element_password.clear();
        element_password.sendKeys("wemole5481");
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    @When("^jestem na stronie z kafelkiem Address$")
    public void jestemNaStronieZKafelkiemAddress() {
        // Skonfiguruj sterownik przeglądarki
    //   System.setProperty("webdriver.chrome.driver",
     //           "src/main/resources/chromedriver.exe");
    //    driver = new ChromeDriver();
    //    driver.get("https://prod-kurs.coderslab.pl/index.php?controller=addresses");
     //   WebElement element_new_address = driver.findElement(By.cssSelector("a:nth-child(1)"));
     //   WebElement element_new_address = driver.findElement(By.cssSelector("#block_myaccount_infos:nth-child(3)"));
        WebElement element_new_address = driver.findElement(By.cssSelector("a:nth-child(3)ul.fancy"));
        element_new_address.click();
    //    element_new_address.click();
    }

    @Then("^wypelniam formularz <alias> <address> <city> <zip/postal> <code> <country> <phone>$")
    public void wypelniamFormularzAliasAddressCityZipPostalCodeCountryPhone() {
    }

    @Then("^sprawdzam czy dane sa ok$")
    public void sprawdzamCzyDaneSaOk() {
    }
}
