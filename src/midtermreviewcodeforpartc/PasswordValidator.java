package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 * This class Fundamentals of Software Design and Development
 *
 * @author Matthew Szablowski
 */
public class PasswordValidator {

    public boolean validPassword(String password) {

        boolean validPassword = false;
        while (!validPassword) {

            Scanner sc = new Scanner(System.in);
            //change these the first two prompts if you want to change password requirements
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:");

            password = sc.nextLine();

            int specialCharCount = 0;
            //iterate over each character to see if it is a special character
            for (int i = 0; i < password.length(); i++) {
                if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            //change this if statement if you wish to increase the password length and special character requirement
            if (specialCharCount > 0 && password.length() > 7) {
                validPassword = true;
            }
        }//loop only ends when password is valid so now we create the User

        return validPassword;

    }
}
