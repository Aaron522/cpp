package e.src;

import java.util.Scanner;
import java.util.Calendar;

public class MyPugProgram {
    public static void main(String[] args) {
        System.out.println("What year were you born in?");
        Scanner agescanner = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int currentyear = c.get(Calendar.YEAR);
        int answer = agescanner.nextInt();
        int result = currentyear - answer;
        int incase = result - 1;
        System.out.println("What month were you born in?");
        int currentmonth = c.get(Calendar.MONTH);
        int birthmonth = agescanner.nextInt();
        if (birthmonth>currentmonth)
        {
            System.out.println("Your age is " + incase);
        } else
        {
            System.out.println("Your age is " + result);
        }
    }
}

