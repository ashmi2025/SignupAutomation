## Signup Automation Script -

## How to Run
1. Clone the repository
2. Open the project in IntelliJ IDEA or Eclipse
3. Make sure ChromeDriver is installed and matches your Chrome version
4. Update the file path for document upload in the code:
   - Find this line: fileInput.sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Virt.png");
   - Replace with your own file path
5. Run the file: signup.java

## Environment
- Language: Java
- Framework: Selenium WebDriver
- Build Tool: No build tool (plain Java project)
- Driver: ChromeDriver (match your Chrome version)
- Browser: Google Chrome
- IDE: IntelliJ IDEA / Eclipse

## Test Data
- First Name: Ashmi
- Last Name: Bhandari
- Email: bhandariashmi828+<timestamp>@gmail.com (auto-generated)
- Phone: Auto-generated random number
- Password: ABab@4456@

## Note
- OTP verification step requires manual input
- After entering OTP manually, the rest of the form fills automatically
