package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import steps.AnagramSteps;

public class Anagram {
    /// Instance of AnagramSteps used to perform anagram logic
    private final AnagramSteps anagramSteps = new AnagramSteps();

    /**
     * Captures the input strings provided in the Given step.
     *
     * @param input1 first input string
     * @param input2 second input string
     */
    @Given("^the input strings \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_input_strings_and(String input1, String input2) {
        System.out.println("[STEP] Given input strings: " + input1 + " , " + input2);
        anagramSteps.setFirstInput(input1);
        anagramSteps.setSecondInput(input2);
    }

    /**
     * Executes the anagram check using the provided inputs.
     */
    @When("I check if there are anagrams")
    public void i_check_if_there_are_anagrams() {
        System.out.println("[STEP] When checking if strings are anagrams");
        anagramSteps.checkAnagram();
    }

    /**
     * Verifies whether the actual result matches the expected result.
     */
    @Then("^the result should be \"([^\"]*)\"$")
    public void theResultShouldBe(boolean expected) {
        boolean result = anagramSteps.getResult();
        System.out.println("[STEP] Then expected result: " + expected + ", actual: " + result);
        Assert.assertEquals(result, expected);
    }


}







