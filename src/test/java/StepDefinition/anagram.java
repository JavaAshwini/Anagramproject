package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static utils.AnagramUtils.*;

public class anagram {
    private String str1, str2;
    boolean isAnagram=false;
//    anagramSteps anagramSteps;

    @Given("the input strings {string} and {string}")
    public void the_input_strings_and(String Input1, String Input2) {
   this.str1=Input1;
   this.str2 =Input2;
    }

    @When("I check if there are anagrams")
    public void i_check_if_there_are_anagrams() {
        isAnagram= checkAnagram(str1, str2);

    }



    @Then("the result should be {string}")
    public void theResultShouldBe(String arg0) {
        Boolean result=Boolean.parseBoolean(arg0);

        Assert.assertEquals(isAnagram,result);
    }
}







