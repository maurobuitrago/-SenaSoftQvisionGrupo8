package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target btn_account = Target.the("enter accounts")
            .locatedBy("//div[@class='myaccount']");
    public static final Target TXT_Username = Target.the("enter username")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_Password = Target.the("enter username")
            .locatedBy("//input[@id='password']");
    public static final Target Btn_Login = Target.the("enter username")
            .locatedBy("//button[text()='Acceder']");
    public static final Target Btn_Salir = Target.the("Logout user")
            .locatedBy("//*[text()='Salir']");


}
