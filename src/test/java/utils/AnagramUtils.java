package utils;

import java.util.Arrays;

public class AnagramUtils {
    public static boolean checkAnagram(String Input1,String Input2 ) {

        Input1 = Input1.toLowerCase().trim().replace(" ","");;
        Input2 = Input2.toLowerCase().trim().replace(" ","");
        System.out.println(Input1);
        System.out.println(Input2);
        if (Input1.length() == Input2.length()) {
            char[] ch1 = Input1.toCharArray();
            char[] ch2 = Input2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2))
                return true;
            else
                return false;

        }
        else
            return false;
    }
}
