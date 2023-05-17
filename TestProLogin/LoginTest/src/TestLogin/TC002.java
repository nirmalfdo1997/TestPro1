package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
    WebDriver driver;

    public void launch(){
        System.setProperty("web-driver.chrome.driver","C:\\Users\\Nirmal Fdo\\Desktop\\TestProLogin\\LoginTest\\driver");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void inputs () throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        TC002 obj = new TC002();
        obj.launch();
        obj.inputs();
    }
}
