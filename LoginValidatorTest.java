public class LoginValidatorTest {

    public static void main(String[] args) {

        LoginValidator validator = new LoginValidator();

        if (validator.isValidUsername("anas")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.exit(1);
        }
    }
}