package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.BonoPage;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Bono implements Task {
    Credentials credentials;
    public Bono(Credentials credentials) {
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        /*actor.attemptsTo(Click.on(BonoPage.btn_account));
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(BonoPage.TXT_Username));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(BonoPage.TXT_Password));
        actor.attemptsTo(Click.on(BonoPage.Btn_Login));*/
        actor.attemptsTo(Click.on(BonoPage.Btn_selector));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(BonoPage.Btn_bonoregalo));

    }
    public static Bono enter (Credentials credentials){
        return Tasks.instrumented(Bono.class,credentials);
    }
}
