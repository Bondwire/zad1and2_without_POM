package pl.coderslab.przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonBasicTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testFormularz(){
        // test z powtórzeniami
        inputTextById("first-name", "Marcin");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inputTextById("last-name", "Gaweł");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]"));
        gender.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inputTextById("dob", "11/30/1989");

        WebElement address = driver.findElement(By.id("address"));
        address.clear();
        address.sendKeys("Prosta 51");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("Marcin@gawel.pl");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Pass123");

        WebElement company = driver.findElement(By.id("company"));
        company.clear();
        company.sendKeys("Coderslab");

        Select role = new Select(driver.findElement(By.xpath("//*[@id='role']")));
        role.selectByVisibleText("QA");

        WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy test automatyczny");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
    }

    private void inputTextById(String id, String text) {
        WebElement element = driver.findElement(By.id(id));

        if (element.isEnabled()) {
            element.click();
            element.clear();
            element.sendKeys(text);



            // to mi znajdzie labelkę
            WebElement label = driver.findElement(By.xpath("//label[@for='"+ id +"']"));
            System.out.println(label.getText() + ":" + text);
        }

    }

    @After
    public void tearDown(){
        // driver.quit();
    }
}