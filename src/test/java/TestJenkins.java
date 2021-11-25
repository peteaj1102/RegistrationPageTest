import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.core.UITestCase;

import java.io.IOException;


public class TestJenkins extends UITestCase {
    ChromeDriver driver=getDriver();

    public TestJenkins() throws IOException {
    }
    @org.junit.Test
    public void start(){
        driver.get("https://www.google.com/");
        System.out.println("Opened page Google.com");
        driver.quit();
    }




}
