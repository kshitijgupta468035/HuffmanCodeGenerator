/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package huffmanGenerator;

import java.util.HashMap;

public class HuffmanGenerator {
    private String userInputStringInLowerCase;

    public HuffmanGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToHuffmanString() {
        HashMap<Character, String> hash = new HashMap<>();
        hash.put('a', "1010");
        hash.put('b', "100000");
        hash.put('c', "00000");
        hash.put('d', "10000");
        hash.put('e', "010");
        hash.put('f', "110011");
        hash.put('g', "100010");
        hash.put('h', "0001");
        hash.put('i', "0110");
        hash.put('j', "1100001011");
        hash.put('k', "11000011");
        hash.put('l', "10111");
        hash.put('m', "110010");
        hash.put('n', "0111");
        hash.put('o', "1001");
        hash.put('p', "100001");
        hash.put('q', "1100001001");
        hash.put('r', "0010");
        hash.put('s', "0011");
        hash.put('t', "1101");
        hash.put('u', "00001");
        hash.put('v', "1100000");
        hash.put('w', "110001");
        hash.put('x', "1100001000");
        hash.put('y', "100011");
        hash.put('z', "110001010");

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < userInputStringInLowerCase.length(); i++) {
            if (userInputStringInLowerCase.charAt(i) >= 'a' && userInputStringInLowerCase.charAt(i) <= 'z') {
                s.append(hash.get(userInputStringInLowerCase.charAt(i)));
            }
        }
        String returnHuffmanString = new String(s);
        return returnHuffmanString;
    }
}
