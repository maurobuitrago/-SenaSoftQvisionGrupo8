package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target btn_account = Target.the("enter accounts")
            .locatedBy("//div[@class='myaccount']");
    public static final Target TXT_Username = Target.the("enter username")
            .locatedBy("//*[@id='reg_username']");
    public static final Target TXT_Email = Target.the("enter email")
            .locatedBy("//*[@id='reg_email']");
    public static final Target TXT_Password = Target.the("enter password")
            .locatedBy("//*[@id='reg_password']");
    public static final Target check_box = Target.the("Chechk box")
            .locatedBy("//input[@id='newsletter_authorization']");
    public static final Target check_box2=  Target.the("Chechk box2")
            .locatedBy("//input[@id='privacy_policy_reg']");
    public static final Target BTN_Acceder = Target.the("enter Acceder")
            .locatedBy("//button[text()='Acceder']");
}
