package br.com.BinaryToDecimal;

import br.com.BinaryToDecimal.Converter.BinaryToDecimalConverter;
import br.com.BinaryToDecimal.Converter.DecimalToBinaryConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean end = false;

        System.out.println("Choose the option you prefer: ");
        System.out.println("1: Binary to Decimal");
        System.out.println("2: Decimal to Binary");

        while(end == false){
            byte option = scan.nextByte();

            if(option == 1){
                System.out.println("You choose Binary to Decimal Converter.");
                System.out.println("Type a binary to convert to decimal: ");
                int binario = scan.nextInt();
                BinaryToDecimalConverter binConverter = new BinaryToDecimalConverter(binario);
                end =true;

            } else if(option == 2){
                System.out.println("You choose Decimal to Binary Converter.");
                System.out.println("Type a decimal to convert to binary: ");
                int decimal = scan.nextInt();
                DecimalToBinaryConverter decConverter = new DecimalToBinaryConverter(decimal);
                /* Use the function toBinaryString from Integer wrapper */
                end =true;

            } else {
                System.out.println("Please, choose an option! ");
            }

        }
    }
}
