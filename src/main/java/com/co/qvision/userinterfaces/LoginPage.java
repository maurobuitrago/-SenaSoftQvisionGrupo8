package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target btn_account = Target.the("enter accounts")
            .locatedBy("//*[@id=\"wrapper\"]/header/div[1]/div[2]/div[1]/a");
    public static final Target  TXT_registerusername=Target.the("register username ")
            .locatedBy("//input[@id='reg_username']");
    public static final Target  TXT_registerEmail=Target.the("Register email ")
            .locatedBy("//input[@id='reg_email']");
    public static final Target  TXT_registerPassword=Target.the("craete password ")
            .locatedBy("//input[@id='reg_password']");
    public static final Target  BTN_register=Target.the("clic the register  ")
            .locatedBy("//*[@id=\"customer_login\"]/div[2]/form/p[6]/button");

}
