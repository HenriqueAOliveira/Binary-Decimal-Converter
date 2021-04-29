package br.com.BinaryToDecimal.Converter;

import br.com.BinaryToDecimal.Exception.NotBinaryException;
import java.util.Scanner;

public class BinaryToDecimalConverter {
    Scanner scan = new Scanner(System.in);

    public BinaryToDecimalConverter(int binary){
        if(!isBinary(binary)){
            throw new NotBinaryException("This number is not a Binary number. Binary number just have" +
                    " zero and one");
        }
        BinaryConverter(binary);
    }

    private boolean isBinary(int binary){
        String number = Integer.toString(binary);
        int numberInPosition;
        for(int i = 0; i < number.length(); i++){
            numberInPosition = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(numberInPosition != 0 && numberInPosition != 1) return false;
        }
        return true;
    }

    private void BinaryConverter(int binary){
        String number = Integer.toString(binary);
        int numberInPosition;
        int decimalNumber = 0;
        for(int i = number.length()-1; i >= 0; i--){
            numberInPosition = Integer.parseInt(String.valueOf(number.charAt(i)));
            decimalNumber = decimalNumber + numberInPosition * (int)Math.pow(2,number.length()-1-i);
        }
        System.out.println("The number " + number+ " in decimal is " + decimalNumber);
    }
}
