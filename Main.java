import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/selmanuysal/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Card card = new Card();
        card.addToCard(driver);

        driver.quit();
    }
}
