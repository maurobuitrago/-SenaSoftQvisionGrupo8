package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    Credentials credentials;
    public Login(Credentials credentials) {
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.btn_account));
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(LoginPage.TXT_Username));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_Password));
        actor.attemptsTo(Click.on(LoginPage.Btn_Login));
        actor.attemptsTo(Click.on(LoginPage.Btn_Salir));
    }
    public static Login enter (Credentials credentials){
        return Tasks.instrumented(Login.class,credentials);
    }
}
