package org.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;

public class IO {
    private final BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

    public String userString(String prompt) {
        String strReturn = "";
        boolean check = true;

        System.out.println(prompt);
        while (check) {
            try {
                strReturn = b.readLine();
                check = strReturn.isEmpty();
            } catch (IOException e) {
                System.out.println("Invalid Input");
            }
        }
        return strReturn;
    }

    public int userInt(String prompt) {
        int intReturn = 0;
        boolean check = true;

        while (check) {
            try {
                intReturn = Integer.parseInt(userString(prompt));
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Must be a number");
            }
        }
        return intReturn;
    }
}
