package KongaOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KongaOrderTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.konga.com/category/konga-fashion-1259");
        Thread.sleep(5000);

        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("holluwatobi1@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("holluwatobi2015");
        driver.findElement(By.id("https://www.konga.com/category/konga-fashion-1259")).click();
        driver.findElement(By.id("Search for products, brands and categories...")).sendKeys("Bags");
        driver.findElement(By.id("SearchButton"));
        driver.findElement(By.id("Add To Cart button")).click();
        driver.findElement(By.id("My Cart Menu")).click();
        driver.findElement(By.id("Increment")).click();
        driver.findElement(By.id("SelectPaymentMethod")).sendKeys("card>...</button>");
        driver.findElement(By.id("dashboard-card_button Card</button")).click();
        driver.findElement(By.id("card-number input_class")).sendKeys("4564 4544 2432 8654");
        driver.findElement(By.id("date input_class")).sendKeys("09/22");
        driver.findElement(By.id("cvv input_class")).sendKeys("567");
        driver.findElement(By.id("card-pin")).sendKeys("1111");
        driver.findElement(By.id("validateCardForm")).click();

    }
    public static void main(String args[]) throws InterruptedException {
        KongaOrderTests test = new KongaOrderTests();
            test.setUp();

    }
}