package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Project {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the HTML file in the Chrome browser
        driver.get("file:///C:/Users/mm/Visual_Arsac_Projects/Sample_webiste_testing/sample_website.html");

        // Task 1: Get the title of the webpage
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Task 2: Get the header text
        WebElement header = driver.findElement(By.tagName("h1"));
        String headerText = header.getText();
        System.out.println("Header Text: " + headerText);

        // Task 3: Get the text of all navigation links
        WebElement nav = driver.findElement(By.tagName("nav"));
        WebElement ul = nav.findElement(By.tagName("ul"));
        java.util.List<WebElement> navLinks = ul.findElements(By.tagName("a"));
        System.out.println("Navigation Links:");
        for (WebElement link : navLinks) {
            System.out.println(link.getText());
        }

        // Task 4: Get the text of the About Us section
        WebElement aboutSection = driver.findElement(By.id("about"));
        String aboutSectionText = aboutSection.getText();
        System.out.println("About Section Text: " + aboutSectionText);

        // Task 5: Get the text of the Services section
        WebElement servicesSection = driver.findElement(By.id("services"));
        String servicesSectionText = servicesSection.getText();
        System.out.println("Services Section Text: " + servicesSectionText);

        // Task 6: Get the text of the Contact Us section
        WebElement contactSection = driver.findElement(By.id("contact"));
        String contactSectionText = contactSection.getText();
        System.out.println("Contact Section Text: " + contactSectionText);

        // Task 7: Fill in the Name field in the Contact Us form
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("John Doe");

        // Task 8: Fill in the Email field in the Contact Us form
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("john.doe@example.com");

        // Task 9: Fill in the Message field in the Contact Us form
        WebElement messageField = driver.findElement(By.id("message"));
        messageField.sendKeys("Hello, I would like to inquire about your services.");

        // Task 10: Submit the Contact Us form
        WebElement submitButton = driver.findElement(By.cssSelector("#contact button[type='submit']"));
        submitButton.click();

        // Task 11: Check if the footer text is displayed
        WebElement footer = driver.findElement(By.tagName("footer"));
        boolean isFooterDisplayed = footer.isDisplayed();
        System.out.println("Is Footer Displayed? " + isFooterDisplayed);

        // Task 12: Get the text of the footer
        String footerText = footer.getText();
        System.out.println("Footer Text: " + footerText);

        // Task 13: Check if the Home link is present in the navigation
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        boolean isHomeLinkPresent = homeLink.isDisplayed();
        System.out.println("Is Home Link Present? " + isHomeLinkPresent);

        // Task 14: Click on the About link in the navigation
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();

        // Task 15: Get the current URL after clicking on the About link
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // Task 16: Go back to the previous page (Home page)
        driver.navigate().back();

        // Task 17: Refresh the current page
        driver.navigate().refresh();

        // Task 18: Maximize the browser window
        driver.manage().window().maximize();

        // Task 19: Get the source code of the webpage
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);

        // Task 20: Close the browser
        driver.quit();
    }
}

