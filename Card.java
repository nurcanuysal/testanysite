import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Card {
    public void addToCard(WebDriver driver){

        String searchKey = "Speaker";
        //by id sample for search box
        WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
        element1.sendKeys(searchKey);
        element1.submit();
        //by xpath sample for search box
        //driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("mug");
        //driver.findElement(By.xpath ("//*[contains(text(),'Speaker')]")).click();
        driver.findElement(By.cssSelector("img.s-image")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
}
}
