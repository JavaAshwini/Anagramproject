package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before("@Regression")
    public void beforeScenario() {
        System.out.println("---------------Running the Before scenario---------------");
    }

    @After(order = 1)
    public void afterScenario() {
        System.out.println("---------------Scenario completed----------------");
    }


}

