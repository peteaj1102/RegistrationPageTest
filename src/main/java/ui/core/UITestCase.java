package ui.core;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class UITestCase {
    protected ChromeDriver chromeDriver=null;
    private void initDriver() throws IOException {
        if (chromeDriver == null || chromeDriver.getSessionId() == null) {
            System.out.println(System.getProperty("user.dir"));
            String operSys = System.getProperty("os.name").toLowerCase();
            if (operSys.contains("win")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            } else if (operSys.contains("nix") || operSys.contains("nux")
                    || operSys.contains("aix")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                System.out.println(System.getProperty("user.dir"));
//                String[] cmd={"sudo chmod +x /var/lib/jenkins/workspace/RegistrationPage/drivers/chromedriver"};
                Runtime.getRuntime().exec("chmod 777 /var/lib/jenkins/workspace/RegistrationPage/drivers/chromedriver");
                System.out.println(System.getProperty("user.dir"));
            }
                chromeDriver = new ChromeDriver();
            System.out.println(System.getProperty("user.dir"));
        }
    }
    protected void closeDriver(){
        if(chromeDriver!=null){
            chromeDriver.close();
            chromeDriver.quit();
        }
    }
    public  ChromeDriver getDriver() throws IOException {
        if(chromeDriver==null){
            initDriver();
        }
        return chromeDriver;
    }
}
