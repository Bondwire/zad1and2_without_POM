package pl.coderslab.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zad2Definition {
    WebDriver driver;

    @Given("^loguję się na poprzedniego usera$")
    public void loguję_się_na_poprzedniego_usera()  {
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

    @When("^wybieram do zakupu sweter M (\\d+)$")
    public void wybieram_do_zakupu_sweter_M(int arg1) {

        WebElement searchSweter = driver.findElement(By.name("s"));
        searchSweter.click();
        searchSweter.clear();
        searchSweter.sendKeys("Hummingbird Printed Sweater");
        WebElement kliksweter = driver.findElement(By.cssSelector("#search_widget > form:nth-child(1) > button:nth-child(4) > i:nth-child(1)"));
        kliksweter.click();
        WebElement klikdoswetra = driver.findElement(By.cssSelector("article.product-miniature:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
        klikdoswetra.click();
        //WebElement rozmiarlista = driver.findElement(By.cssSelector("#group_1"));
        //rozmiarlista.click();
        // Write code here that turns the phrase above into concrete actions
        WebElement wybierzM = driver.findElement(By.name("group[1]"));
        //wybierzM.click();
        Select rozmiarlista = new Select(wybierzM);
        rozmiarlista.selectByValue("2");
        rozmiarlista.selectByVisibleText("M");


    }

    @Then("^dodaje do koszyka$")
    public void dodaje_do_koszyka() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^przechodze do checkout$")
    public void przechodze_do_checkout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^potwierdzam aadres$")
    public void potwierdzam_aadres() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^wybieram odbiór pick up in store$")
    public void wybieram_odbiór_pick_up_in_store() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^wybieram Pay by check$")
    public void wybieram_Pay_by_check() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^klikam w order with obligation to pay$")
    public void klikam_w_order_with_obligation_to_pay() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^robie screenshot$")
    public void robie_screenshot() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
