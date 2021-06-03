package pl.coderslab.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

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
    public void wypelniamFormularzAliasAddressCityZipPostalCodeCountryPhone(String alias, String address, String city, String zip_postal, String code, String country, String phone )
    {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
           WebElement elementAlias = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[1]/div[1]/input"));
            // Wyczyść tekst zapisany w elemencie
            elementAlias.click();
            elementAlias.clear();
            // Wpisz informacje do wyszukania
            elementAlias.sendKeys(alias);
            // Prześlij formularz



        WebElement elementcity = driver.findElement(By.name("city"));
        // Wyczyść tekst zapisany w elemencie
        elementcity.click();
        elementcity.clear();
        // Wpisz informacje do wyszukania
        elementcity.sendKeys(city);
        // Prześlij formularz

        WebElement elementaddress = driver.findElement(By.cssSelector("div.form-group:nth-child(10) > div:nth-child(2) > input:nth-child(1)"));
        // Wyczyść tekst zapisany w elemencie
        elementaddress.click();
        elementaddress.clear();
        // Wpisz informacje do wyszukania
        elementaddress.sendKeys(address);
        // Prześlij formularz

        WebElement elementZip_postal = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[8]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementZip_postal.click();
        elementZip_postal.clear();
        // Wpisz informacje do wyszukania
        elementZip_postal.sendKeys(zip_postal);
        // Prześlij formularz

        WebElement elementCode = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[5]/div[1]/input"));
        // Wyczyść tekst zapisany w elemencie
        elementCode.click();
        elementCode.clear();
        // Wpisz informacje do wyszukania
        elementCode.sendKeys(code);
        // Prześlij formularz

        WebElement elementPhone = driver.findElement(By.name("phone"));
        // Wyczyść tekst zapisany w elemencie
        elementPhone.click();
        elementPhone.clear();
        // Wpisz informacje do wyszukania
        elementPhone.sendKeys(phone);
        // Prześlij formularz

        WebElement countryLabel = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[10]/div[1]/select"));
        WebElement rozwijanyElement = driver.findElement(By.name("id_country"));
        countryLabel.click();
        if (rozwijanyElement.isEnabled()){
            Select role = new Select(rozwijanyElement);
            role.selectByValue("17");

        }

        //driver.findElement(By.xpath("button.btn")).click();

    }

    @And("^sprawdzam czy dane sa ok$")
    public void sprawdzamCzyDaneSaOk() {

      driver.findElement(By.cssSelector("button.btn")).click();

        WebElement elementAliassprawdz = driver.findElement(By.cssSelector(".address-body > h4:nth-child(1)"));
        String poleAlias=elementAliassprawdz.getText();
        System.out.println(poleAlias);
        if(poleAlias.equals("grzgorz"))
        {
            System.out.println("alias zawiera grzegorz z bledem " + poleAlias);
        }
        else
        {
            System.out.println("alias nie zawiera grzgorz" + poleAlias);
        }

        WebElement update = driver.findElement(By.cssSelector(".address-footer > a:nth-child(1) > i:nth-child(1)"));
        update.click();

        WebElement firstnameCheck = driver.findElement(By.cssSelector("div.form-group:nth-child(6) > div:nth-child(2) > input:nth-child(1)"));
        String imie = firstnameCheck.getAttribute("value");
        System.out.println(imie);
        if(imie.equals("Grzegorz"))
        {
            System.out.println("pole się zgadza" + imie);
        }
        else
            System.out.println("pole niepoprawne" + imie);

        WebElement addressCheck = driver.findElement(By.cssSelector("div.form-group:nth-child(10) > div:nth-child(2) > input:nth-child(1)"));
        String mojAdres = addressCheck.getAttribute("value");
        System.out.println(mojAdres);
        if(mojAdres.equals("Wroclawska"))
        {
            System.out.println("pole się zgadza" + mojAdres);
        }
        else
            System.out.println("pole niepoprawne" + mojAdres);

        WebElement cityCheck = driver.findElement(By.cssSelector("div.form-group:nth-child(12) > div:nth-child(2) > input:nth-child(1)"));
        String mojeMiasto = cityCheck.getAttribute("value");
        System.out.println(mojeMiasto);
        if(mojeMiasto.equals("miasto"))
        {
            System.out.println("pole się zgadza" + mojeMiasto);
        }
        else
            System.out.println("pole niepoprawne" + mojeMiasto);

        WebElement postalCheck = driver.findElement(By.cssSelector("div.form-group:nth-child(13) > div:nth-child(2) > input:nth-child(1)"));
        String mojKOd = postalCheck.getAttribute("value");
        System.out.println(mojKOd);
        if(mojKOd.equals("NN-NNN"))
        {
            System.out.println("pole się zgadza" + mojKOd);
        }
        else
            System.out.println("pole niepoprawne" + mojKOd);

        WebElement phoneCheck = driver.findElement(By.cssSelector("div.form-group:nth-child(15) > div:nth-child(2) > input:nth-child(1)"));
        String mojfon = phoneCheck.getAttribute("value");
        System.out.println(mojfon);
        if(mojfon.equals("55555555"))
        {
            System.out.println("pole się zgadza" + mojfon);
        }
        else
            System.out.println("pole niepoprawne" + mojfon);

        WebElement countryCheck = driver.findElement(By.cssSelector("select.form-control > option:nth-child(2)"));
        String mojecountry = countryCheck.getText();
        System.out.println(mojecountry);
        if(mojecountry.equals("United Kingdom"))
        {
            System.out.println("pole się zgadza" + mojecountry);
        }
        else
            System.out.println("pole niepoprawne" + mojecountry);

        driver.findElement(By.cssSelector("button.btn")).click();
        driver.findElement(By.cssSelector(".address-footer > a:nth-child(2) > span:nth-child(2)")).click();
/*
        WebElement elementAliassprawdzDelete = driver.findElement(By.cssSelector(".address-body > h4:nth-child(1)"));
        String poleAliasdelete=elementAliassprawdzDelete.getText();
        System.out.println(poleAliasdelete);
        if(poleAliasdelete.equals("grzgorz"))
        {
            System.out.println("pole grzgorz nadal istnieje " + poleAliasdelete);
        }
        else
        {
            System.out.println("pole grzgorz nie istnieje" + poleAliasdelete);
        }
*/
        WebElement succcesfullyDeleted = driver.findElement(By.cssSelector(".alert > ul:nth-child(1) > li:nth-child(1)"));
        String kasowanie=succcesfullyDeleted.getText();
        System.out.println(kasowanie);
        if(kasowanie.equals("Address successfully deleted!"))
        {
            System.out.println("alias grzgorz został skasowany " + kasowanie);
        }
        else
        {
            System.out.println("pole grzgorz nadal istnieje" + kasowanie);
        }

    }
    }