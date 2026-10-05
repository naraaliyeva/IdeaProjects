package exercise10;

public class PasswordCheck {
    public boolean check(String password) {

        boolean isValid= false;

        if (password.length() >= 8) {

            isValid= true;
        }

           return isValid;
     }
}
