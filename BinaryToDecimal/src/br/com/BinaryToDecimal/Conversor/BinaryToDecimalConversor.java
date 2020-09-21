package br.com.BinaryToDecimal.Conversor;

import br.com.BinaryToDecimal.Exception.NotBinaryException;
import java.util.Scanner;

public class BinaryToDecimalConversor {
    Scanner scan = new Scanner(System.in);

    public BinaryToDecimalConversor(int binary){
        if(!isBinary(binary)){
            throw new NotBinaryException("This number is not a Binary number. Binary number just have" +
                    "zero and one");
        }
        BinaryConversor(binary);
    }

    private boolean isBinary(int binary){
        return true;
    }

    private void BinaryConversor(int binary){

    }
}
