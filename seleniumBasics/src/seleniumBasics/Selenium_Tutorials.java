package seleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Tutorials {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        String baseUrl = "file:///C:/Users/mm/Visual_Arsac_Projects/Sample_webiste_testing/sample_website.html";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // Launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        // Get the actual value of the title
        WebElement headingElement = driver.findElement(By.tagName("h1"));

        // Get the text of the heading element
        String headingText = headingElement.getText();

        // Print the heading text
        System.out.println("Heading text: " + headingText);

        // Close Chrome
        
    }
}
