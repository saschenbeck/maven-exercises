public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String inputPassword){
        String hashedPassword = "";
        for (char character : inputPassword.toCharArray()){
            switch (character){
                case 'a':
                case 'A':
                    hashedPassword += 4;
                    break;
                case 'e':
                case 'E':
                    hashedPassword += 3;
                    break;
                case 'i':
                case 'I':
                    hashedPassword += 1;
                    break;
                case 'o':
                case 'O':
                    hashedPassword += 0;
                    break;
                case 'u':
                case 'U':
                    hashedPassword += 9;
                    break;
                default:
                    hashedPassword += character;
                    break;
            }
        }
        return hashedPassword;
    }

    public static boolean checkPassword(String inputPassword, String hashed){
        return hashed.equals(hashPassword(inputPassword));
    }
}
