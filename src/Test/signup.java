package Test;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signup {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://authorized-partner.vercel.app");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement getstartedLink = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/header/div[1]/div/a[2]")));
        getstartedLink.click();

        WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"remember\"]")));
        checkbox.click();

        WebElement continueBtn = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[4]/div[3]/a/button")));
        continueBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

        String firstName    = "Ashmi";
        String lastName     = "Bhandari";
        String emailAddress = "bhandariashmi828+" + System.currentTimeMillis() + "@gmail.com";
        String phoneNumber  = "97" + (10000000 + new Random().nextInt(90000000));
        String password     = "ABab@4456@";

        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
        driver.findElement(By.name("email")).sendKeys(emailAddress);
        driver.findElement(By.name("phoneNumber")).sendKeys(phoneNumber);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("confirmPassword")).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
            "/html/body/div[4]/div[4]/div/div/div/div[2]/form/div[4]/button"))).click();

        System.out.println("Enter OTP and click Verify manually. Waiting for agency page...");

        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("agency_name")));
        Thread.sleep(1500);
        System.out.println("Agency page detected! Filling now...");

        //STEP 2: Agency Detail 
        WebElement f1 = Wait.until(ExpectedConditions.elementToBeClickable(By.name("agency_name")));
        f1.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", f1, "Ashmi");

        WebElement f2 = Wait.until(ExpectedConditions.elementToBeClickable(By.name("role_in_agency")));
        f2.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", f2, "QA Intern");

        WebElement f3 = Wait.until(ExpectedConditions.elementToBeClickable(By.name("agency_email")));
        f3.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", f3, "bhandariashmi828@gmail.com");

        WebElement f4 = Wait.until(ExpectedConditions.elementToBeClickable(By.name("agency_website")));
        f4.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", f4, "authorized-partner.vercel.app");

        WebElement f5 = Wait.until(ExpectedConditions.elementToBeClickable(By.name("agency_address")));
        f5.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", f5, "Sankhamul");

        //Step3: Professional Experience
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button[role='combobox']"))).click();
        Thread.sleep(800);
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[text()='Nepal']"))).click();
        Thread.sleep(500);

        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@type='submit' and text()='Next']"))).click();
        System.out.println("Step 2 done! Moving to Step 3...");

       
        Wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.name("number_of_students_recruited_annually")));
        Thread.sleep(1500);
        System.out.println("Step 3 detected! Filling now...");

        Wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button[role='combobox']"))).click();
        Thread.sleep(800);
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[text()='1 year']"))).click();
        Thread.sleep(500);

        WebElement students = Wait.until(ExpectedConditions.elementToBeClickable(
            By.name("number_of_students_recruited_annually")));
        students.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", students, "50");

        WebElement focusArea = Wait.until(ExpectedConditions.elementToBeClickable(By.name("focus_area")));
        focusArea.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", focusArea, "Undergraduate admissions");

        WebElement successMetrics = Wait.until(ExpectedConditions.elementToBeClickable(By.name("success_metrics")));
        successMetrics.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", successMetrics, "90");

        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@role='checkbox' and @aria-checked='false'][1]"))).click();
        Thread.sleep(500);

        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@type='submit' and text()='Next']"))).click();
        System.out.println("Step 3 done! Moving to Step 4...");

        //STEP 4: Verification and preferences
        Wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.name("business_registration_number")));
        Thread.sleep(1500);
        System.out.println("Step 4 detected! Filling now...");

        
        WebElement regNumber = Wait.until(ExpectedConditions.elementToBeClickable(
            By.name("business_registration_number")));
        regNumber.click();
        js.executeScript("var s=Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype,'value').set;s.call(arguments[0],arguments[1]);arguments[0].dispatchEvent(new Event('input',{bubbles:true}));", regNumber, "75382578");

        
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button[role='combobox']"))).click();
        Thread.sleep(800);
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[text()='Australia']"))).click();
        Thread.sleep(500);

        
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@role='checkbox' and @aria-checked='false'][1]"))).click();
        Thread.sleep(500);

        
        WebElement fileInput = driver.findElement(
            By.cssSelector("input[type='file']"));
        fileInput.sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Virt.png");
        Thread.sleep(1500);
        System.out.println("File uploaded!");

        
        Wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@type='submit' and text()='Submit']"))).click();

        System.out.println("ALL DONE! Registration complete!");
    }
}

