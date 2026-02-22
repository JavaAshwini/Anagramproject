package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {

    private static final Logger log =
            LoggerFactory.getLogger(Hooks.class);

    @Before("@Regression")
    public void beforeScenario() {
        System.out.println("---------------Running the Before scenario---------------");
    }

    @After(order = 1)
    public void afterScenario() {
        System.out.println("---------------Scenario completed----------------");
    }


}

