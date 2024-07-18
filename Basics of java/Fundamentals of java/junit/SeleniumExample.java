import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable. Make sure it matches your system.
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Google in the Chrome browser
        driver.get("https://www.google.com");

        // The browser will open to Google's homepage. You can now automate interactions with the webpage as needed.

        // To close the browser when you're done:
        driver.quit();
    }
}
