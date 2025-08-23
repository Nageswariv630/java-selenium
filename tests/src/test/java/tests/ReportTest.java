package tests;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ReportTest {

    ExtentReports extent;
    ExtentTest test;
    WebDriver driver;

    @BeforeTest
    public void startReport() {
        // Initialize ExtentReports
        ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setup() {
        // Setup WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoReport() {
        test = extent.createTest("Google Test");

        driver.get("https://google.com");
        test.pass("✅ Opened Google homepage successfully");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @AfterTest
    public void endReport() {
        extent.flush();  // Write report to file
    }
}
