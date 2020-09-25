package br.com.BinaryToDecimal.Converter;

import br.com.BinaryToDecimal.Exception.NotBinaryException;
import java.util.Scanner;

public class BinaryToDecimalConverter {
    Scanner scan = new Scanner(System.in);

    public BinaryToDecimalConverter(int binary){
        if(!isBinary(binary)){
            throw new NotBinaryException("This number is not a Binary number. Binary number just have" +
                    "zero and one");
        }
        BinaryConverter(binary);
    }

    private boolean isBinary(int binary){
        return true;
    }

    private void BinaryConverter(int binary){

    }
}
