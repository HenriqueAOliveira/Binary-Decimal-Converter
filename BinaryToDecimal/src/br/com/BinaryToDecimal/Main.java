package br.com.BinaryToDecimal;

import br.com.BinaryToDecimal.Conversor.BinaryToDecimalConversor;

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
                System.out.println("You choose Binary to Decimal Conversor.");
                System.out.println("Type a binary to convert to decimal: ");
                int decimal = scan.nextInt();
                BinaryToDecimalConversor binConversor = new BinaryToDecimalConversor(decimal);
                end =true;

            } else if(option == 2){
                System.out.println("You choose Decimal to Binary Conversor.");
                // Use the function toBinaryString from Integer wrapper
                end =true;

            } else {
                System.out.println("Please, choose an option! ");
            }

        }
    }
}
