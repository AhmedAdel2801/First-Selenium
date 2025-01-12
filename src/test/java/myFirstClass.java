import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class myFirstClass {
public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.findElement(By.partialLinkText("JavaScript")).click();
    Thread.sleep(Duration.ofMillis(500));
    driver.navigate().back();
    driver.findElement(By.linkText("Form Authentication")).click();
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.cssSelector("button.radius")).click();
//    driver.findElement(By.tagName("button")).click();
    Thread.sleep(Duration.ofMillis(1000));
    driver.navigate().back();
    Thread.sleep(Duration.ofMillis(500));
    driver.navigate().back();
    Thread.sleep(Duration.ofMillis(500));
    driver.findElement(By.linkText("Sortable Data Tables")).click();
    WebElement table=driver.findElement(By.id("table1"));
    List<WebElement> tablesRow =table.findElements(By.tagName("tr"));
    System.out.println(tablesRow.size());
    for (int i = 0; i < 5; i++) {
        System.out.println(tablesRow.get(i).getText());
    }
    Thread.sleep(Duration.ofMillis(1000));
    driver.quit();
}
}
