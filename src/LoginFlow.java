import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlow {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","/Users/sankalppatil/Documents/Chrome_Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twostaging.carrot.club/");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[1]")).click();
        driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]")).click();
        driver.findElement(By.id("mui-1")).sendKeys("krishna@carrot.club");
        driver.findElement(By.id("mui-2")).sendKeys("12341234");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.navigate().refresh();
        String H1 = driver.findElement(By.xpath("//h1[normalize-space()='Welcome , Kingdom Of White !']")).getText();
        System.out.println(H1);
        String expectedText = "Welcome , Kingdom Of White !";
        if (H1.equals(expectedText)) {
            System.out.println("Test Case Is Passed");
        } else {
               System.out.println("Test case Is Failed");
            }
    driver.quit();
    }
    }
