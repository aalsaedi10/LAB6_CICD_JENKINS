public class LoginValidator {

    public boolean isValidUsername(String username) {
        return username != null && username.length() >= 3;
    }
}