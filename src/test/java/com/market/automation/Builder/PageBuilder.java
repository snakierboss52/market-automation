package com.market.automation.Builder;

import com.market.automation.Pages.Register.RegisterPage;
import org.openqa.selenium.WebDriver;

public class PageBuilder {

    private static RegisterPage registerPage;

    public static void setupPage(WebDriver driver){

        registerPage = new RegisterPage(driver);

    }

    public static RegisterPage getRegisterPage() {
        return registerPage;
    }

}
