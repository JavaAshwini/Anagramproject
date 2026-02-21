package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.AnagramUtils;


public class Anagram {
    boolean isAnagram = false;
    private String str1, str2;

    @Given("^the input strings \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_input_strings_and(String input1, String input2) {
        System.out.println("[STEP] Given input strings: " + input1 + " , " + input2);
        this.str1 = input1;
        this.str2 = input2;
    }

    @When("I check if there are anagrams")
    public void i_check_if_there_are_anagrams() {
        System.out.println("[STEP] When checking if strings are anagrams");
        isAnagram = AnagramUtils.checkAnagram(str1, str2);
    }


    @Then("the result should be {string}")
    public void theResultShouldBe(String arg0) {
        System.out.println("[STEP] Then expected result: " + arg0 + ", actual: " + isAnagram);
        Boolean result = Boolean.parseBoolean(arg0);
        Assert.assertEquals(isAnagram, result);
    }


}







