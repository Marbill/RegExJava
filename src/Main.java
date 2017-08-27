
import java.util.Scanner;

public class Main {

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }

        return false;
    }

    public static boolean allVowels(String string) {
        if (string.matches("[aeiouäö]+")) {
            return true;
        }

        return false;
    }

    public static boolean clockTime(String string) {
        if (string.matches("(0[0-9]|1[0-9]|2[0-3])(:)(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9])(:)(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9])")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a string: ");
        String string = reader.nextLine();
        if (isAWeekDay(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }

        System.out.println();
        System.out.print("Give a string: ");
        string = reader.nextLine();
        if (allVowels(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }

        System.out.println();
        System.out.print("Give a string: ");
        string = reader.nextLine();
        if (clockTime(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
    }
}
