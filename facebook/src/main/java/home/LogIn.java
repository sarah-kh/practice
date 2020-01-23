package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class LogIn extends CommonAPI {

    @Test
    public void logIn() throws InterruptedException {

        System.out.println(driver.getTitle());

        typeOnElement("input[id='email']","jdoe12399100@yahoo.com");
        typeOnElement ("input[id='pass']","peplentech");
        clickOnElement("//input[@value='Log In']");
        //Thread.sleep(2000);
    }
}
