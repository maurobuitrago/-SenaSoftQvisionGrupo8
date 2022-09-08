package com.co.qvision.tasks;


import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    Credentials credentials;

    public Register(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.btn_account));
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(RegisterPage.TXT_Username));
        actor.attemptsTo(Enter.theValue(credentials.getEmail()).into(RegisterPage.TXT_Email));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(RegisterPage.TXT_Password));
        actor.attemptsTo(Click.on(RegisterPage.check_box));
        actor.attemptsTo(Click.on(RegisterPage.check_box2));
        actor.attemptsTo(Click.on(RegisterPage.BTN_Acceder));

    }
    public static Register enter (Credentials credentials){
        return Tasks.instrumented(Register.class,credentials);
    }
}
