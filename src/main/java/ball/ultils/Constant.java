package ball.ultils;

import java.util.Random;
import java.util.stream.Collectors;

public class Constant {
        public static final String SESSION_USERNAME = "username";
        public static final String COOKIE_REMEMBER = "username";
        public static final String REGISTER = "/view/web/register.jsp";
        public static final String LOGIN = "/view/login.jsp";
        public static final String FORGOT_PATH = "/view/forgot";
        public static final String FORGOT_USER = "/view/forgot/user.jsp";
        public static final String FORGOT_EMAIL = "/view/forgot/email.jsp";
        public static final String DEFAULT_FILENAME = "C:\\Users\\binh\\HCMUTE\\WEB\\IMG";

        public static final String randomPass(){
                int leftLimit = 97; // 'a'
                int rightLimit = 122; // 'z'
                int targetStringLength = 6;

                String generatedString = new Random()
                        .ints(leftLimit, rightLimit + 1)
                        .limit(targetStringLength)
                        .mapToObj(i -> String.valueOf((char) i))
                        .collect(Collectors.joining());
                return generatedString;
        }

        public static void main(String[] args) {
                System.out.println(randomPass());
        }
}
