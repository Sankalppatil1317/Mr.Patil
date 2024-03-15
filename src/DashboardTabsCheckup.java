import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DashboardTabsCheckup {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","/Users/sankalppatil/Documents/Chrome_Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twostaging.carrot.club/");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[1]")).click();
        driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]")).click();
        driver.findElement(By.id("mui-1")).sendKeys("sankalp@carrot.club");
        driver.findElement(By.id("mui-2")).sendKeys("1234512345");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.navigate().refresh();
        List<WebElement> DashboardTabs = driver.findElements(By.tagName("h2"));
        System.out.println(DashboardTabs.size());
        for (int i = 0; i<DashboardTabs.size(); i++) {
            String s = DashboardTabs.get(i).getText();
            System.out.println("Text is" +s);
        }
        driver.findElement(By.xpath("//body//div[@id='root']//div//div[1]//div[1]//div[1]//button[1]//div[1]")).click();
        Thread.sleep(1000);
        driver.navigate().to("https://twostaging.carrot.club/home");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body//div[@id='root']//div//div[1]//div[1]//div[1]//button[1]//div[1]")).click();
        if (driver.getPageSource().contains("Product")) {
            System.out.println("Tab is present");
        } else System.out.println("Tab is not present");
        driver.quit();
    }
}