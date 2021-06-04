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
import java.util.concurrent.TimeUnit;

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

        // inputText(By.name("dob"), "11/30/1989"); dlaczego to nie działa; - bo to musi być funkcja
        WebElement koszykSztuki = driver.findElement(By.id("quantity_wanted"));
        koszykSztuki.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        koszykSztuki.clear();
        koszykSztuki.sendKeys("4");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement koszykkliksztuki = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i"));
        koszykkliksztuki.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       WebElement dokoszyka = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button/i"));
       dokoszyka.click();

      //  WebElement potiwerdzkoszyk = driver.findElement(By)
    }

    @Then("^dodaje do koszyka$")
    public void dodaje_do_koszyka()  {

        WebElement dokoszyka = driver.findElement(By.xpath("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button"));
        dokoszyka.click();

    }

    @Then("^przechodze do checkout$")
    public void przechodze_do_checkout() {

    }

    @Then("^potwierdzam aadres$")
    public void potwierdzam_aadres()  {

    }

    @Then("^wybieram odbiór pick up in store$")
    public void wybieram_odbiór_pick_up_in_store()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^wybieram Pay by check$")
    public void wybieram_Pay_by_check()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^klikam w order with obligation to pay$")
    public void klikam_w_order_with_obligation_to_pay()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^robie screenshot$")
    public void robie_screenshot()  {


    }
}
