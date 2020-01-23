package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration extends CommonAPI {

    @Test
    public void registration() throws InterruptedException{
        System.out.println (driver.getTitle ());

        typeOnElement ("input[name='firstname']","Jonathan");
        typeOnElement ("input[name='lastname']","Doe");
        typeOnElement ("input[name='reg_email__']","jdoe12399100@yahoo.com");
        typeOnElement ("input[name='reg_email_confirmation__']","jdoe12399100@yahoo.com");
        typeOnElement ("input[name='reg_passwd__']","peoplentech");

        Select month = new Select (driver.findElement (By.id ("month")));
        Select day = new Select (driver.findElement (By.name ("birthday_day")));
        Select year = new Select (driver.findElement (By.id ("year")));


        month.selectByValue ("1");
        day.selectByValue ("1");
        year.selectByValue ("2000");

        clickOnElement ("//input[@name='sex'and@value='1']");

        clickOnElement ("button[name='websubmit']");
    }
}
