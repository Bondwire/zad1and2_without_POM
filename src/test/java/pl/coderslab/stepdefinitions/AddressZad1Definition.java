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

    @Then("wypelniam formularz (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
    public void wypelniamFormularzAliasAddressCityZipPostalCodeCountryPhone(String alias, String address, String city, String zip_postal, String code, String country, String phone ) {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
           WebElement elementAlias = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[1]/div[1]/input"));
            // Wyczyść tekst zapisany w elemencie
            elementAlias.click();
            elementAlias.clear();
            // Wpisz informacje do wyszukania
            elementAlias.sendKeys(alias);
            // Prześlij formularz
            elementAlias.submit();


        WebElement elementcity = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[8]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementcity.click();
        elementcity.clear();
        // Wpisz informacje do wyszukania
        elementcity.sendKeys(city);
        // Prześlij formularz
        elementcity.submit();

        WebElement elementaddress = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[8]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementaddress.click();
        elementaddress.clear();
        // Wpisz informacje do wyszukania
        elementaddress.sendKeys(address);
        // Prześlij formularz
        elementaddress.submit();

        WebElement elementZip_postal = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[8]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementZip_postal.click();
        elementZip_postal.clear();
        // Wpisz informacje do wyszukania
        elementZip_postal.sendKeys(zip_postal);
        // Prześlij formularz
        elementZip_postal.submit();

        WebElement elementCode = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[5]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementCode.click();
        elementCode.clear();
        // Wpisz informacje do wyszukania
        elementCode.sendKeys(code);
        // Prześlij formularz
        elementCode.submit();

        WebElement countryLabel = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[10]/div[1]/select"));
        WebElement rozwijanyElement = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[10]/div[1]/select/option[2]"));
        countryLabel.click();
        rozwijanyElement.click();
        //
        //    Select role = new Select(rozwijanyElement);
        //    role.selectByVisibleText("QA");


        WebElement elementPhone = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[11]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementPhone.click();
        elementPhone.clear();
        // Wpisz informacje do wyszukania
        elementPhone.sendKeys(phone);
        // Prześlij formularz
        elementPhone.submit();
    }

    @And("^sprawdzam czy dane sa ok$")
    public void sprawdzamCzyDaneSaOk() {
    }
}
