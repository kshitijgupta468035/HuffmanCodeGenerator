/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 1/03/20
 */


package main;

import binaryGenerator.BinaryGenerator;
import huffmanGenerator.HuffmanGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a string value: ");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        BinaryGenerator binaryGenerator = new BinaryGenerator(userInput);
        String binaryString = binaryGenerator.convertNormalStringToBinaryString();
        HuffmanGenerator huffmanGenerator = new HuffmanGenerator(userInput);
        String huffmanString = huffmanGenerator.convertNormalStringToHuffmanString();
        int lengthOfBinaryString = binaryString.length();
        int lengthOfHuffmanString = huffmanString.length();
        System.out.println("The binary string has " + lengthOfBinaryString + " characters.");
        System.out.println(binaryString);
        System.out.println("The huffman string has " + lengthOfHuffmanString + " characters.");
        System.out.println(huffmanString);
        System.out.println("Compression Ratio (Huffman/Binary): " + ((double) lengthOfHuffmanString / lengthOfBinaryString) + "%");
        scanner.close();
    }
}
