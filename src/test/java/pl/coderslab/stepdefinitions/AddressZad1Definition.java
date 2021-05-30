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
        WebElement element_new_address = driver.findElement(By.xpath("/html/body/main/footer/div[2]/div/div[1]/div[2]/ul/li[4]/a"));
        element_new_address.click();
        WebElement createNewAddress = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]/a/i"));
        createNewAddress.click();
    }

    @Then("^wypelniam formularz <alias> <address> <city> <zip/postal> <code> <country> <phone>$")
    public void wypelniamFormularzAliasAddressCityZipPostalCodeCountryPhone(String alias) {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
           WebElement element1 = driver.findElement(By.name("q"));
            // Wyczyść tekst zapisany w elemencie
           element1.clear();
            // Wpisz informacje do wyszukania
            element1.sendKeys(alias);
            // Prześlij formularz
            element1.submit();
    }

    @Then("^sprawdzam czy dane sa ok$")
    public void sprawdzamCzyDaneSaOk() {
    }
}
