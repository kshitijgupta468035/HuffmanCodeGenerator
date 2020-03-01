/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Kshitijgupta468035
 *   Date: 1/03/20
 */


package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToBinaryString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < userInputStringInLowerCase.length(); i++) {
            if (userInputStringInLowerCase.charAt(i) >= 'a' && userInputStringInLowerCase.charAt(i) <= 'z') {
                String binary = Integer.toBinaryString(userInputStringInLowerCase.charAt(i));
                int remain = 8 - binary.length();
                String appendone = "0".repeat(remain) + binary;
                s.append(appendone);
            }
        }
        String returnString = new String(s);
        return returnString;
    }
}
