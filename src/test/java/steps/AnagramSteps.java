package steps;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Utility class that provides functionality
 * to check whether two strings are anagrams.
 */
public class AnagramSteps {


    public boolean result;
    // Instance variables (currently not used by checkAnagram method)
    private String Input1;
    private String Input2;

    /*
     * Checks whether two given strings are anagrams.
     *
     * @param Input1 the first string
     * @param Input2 the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public void checkAnagram() {

        // Remove all whitespace and convert strings to lowercase
        Input1 = Input1.replaceAll("\\s+", "").toLowerCase();
        Input2 = Input2.replaceAll("\\s+", "").toLowerCase();

        // If lengths differ, strings cannot be anagrams
        if (Input1.length() == Input2.length()) {

            // Convert strings to character arrays
            char[] ch1 = Input1.toCharArray();
            char[] ch2 = Input2.toCharArray();

            // Sort both character arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Compare sorted arrays
            result = (Arrays.equals(ch1, ch2));

        }
    }

    public String getFirstInput() {
        return Input1;
    }

    /**
     * Sets the first input string.
     *
     * @param input1 the first input value
     */
    public void setFirstInput(String input1) {
        this.Input1 = input1;
    }

    public String getSecondInput() {
        return Input2;
    }

    /**
     * Sets the second input string.
     *
     * @param input2 the second input value
     */
    public void setSecondInput(String input2) {
        this.Input2 = input2;
    }

    public boolean getResult() {
        return result;
    }

}