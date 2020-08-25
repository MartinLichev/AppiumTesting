import com.sun.xml.internal.bind.v2.model.core.ID;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AppiumTest {

    public static AppiumDriver<MobileElement> driver;

    public static List<String> resultArray = new ArrayList<String>();

    public static void main(String[] args) throws Exception {

        try {

            openApp();
            addition();
            extraction();
            division();
            multiplication();
            showElementsInArrayList();

        } catch (Exception ex) {

            ex.getMessage();
            ex.printStackTrace();

        }

    }

    public static void openApp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P20 Pro");
        capabilities.setCapability("udid", "WCR7N18B12001363");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, capabilities);

    }

    public static void addition(){

        WebElement number1 = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        number1.click();
        WebElement additionButton = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        additionButton.click();
        WebElement number2 = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
        number2.click();
        WebElement additionResult = driver.findElement(By.id("com.android.calculator2:id/eq"));
        additionResult.click();
        WebElement additionFinalNumber = driver.findElement(By.className("android.widget.EditText"));
        String firstNumber = additionFinalNumber.getText();
        resultArray.add(firstNumber);
        WebElement clearButton = driver.findElement(By.id("com.android.calculator2:id/op_clr"));
        clearButton.click();


    }

    public static void extraction(){

        WebElement number1 = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        number1.click();
        WebElement extractionButton = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        extractionButton.click();
        WebElement number2 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        number2.click();
        WebElement extractionResult = driver.findElement(By.id("com.android.calculator2:id/eq"));
        extractionResult.click();
        WebElement extractionFinalNumber = driver.findElement(By.className("android.widget.EditText"));
        String secondNumber = extractionFinalNumber.getText();
        resultArray.add(secondNumber);
        WebElement clearButton = driver.findElement(By.id("com.android.calculator2:id/op_clr"));
        clearButton.click();
    }

    public static void multiplication(){

        WebElement number1 = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        number1.click();
        WebElement multiplicationButton = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        multiplicationButton.click();
        WebElement number2 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        number2.click();
        WebElement multiplicationResult = driver.findElement(By.id("com.android.calculator2:id/eq"));
        multiplicationResult.click();
        WebElement multiplicationFinalNumber = driver.findElement(By.className("android.widget.EditText"));
        String thirdNumber = multiplicationFinalNumber.getText();
        resultArray.add(thirdNumber);
        WebElement clearButton = driver.findElement(By.id("com.android.calculator2:id/op_clr"));
        clearButton.click();

    }

    public static void division(){
        WebElement number1 = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        number1.click();
        WebElement divisionButton = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        divisionButton.click();
        WebElement number2 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        number2.click();
        WebElement divisionResult = driver.findElement(By.id("com.android.calculator2:id/eq"));
        divisionResult.click();
        WebElement divisionFinalNumber = driver.findElement(By.className("android.widget.EditText"));
        String forthNumber = divisionFinalNumber.getText();
        resultArray.add(forthNumber);
        WebElement clearButton = driver.findElement(By.id("com.android.calculator2:id/op_clr"));
        clearButton.click();

    }

    public static void showElementsInArrayList(){

        for(String result: resultArray){

            System.out.println(result);
        }

    }

}
