package br.com.BinaryToDecimal.Converter;

public class DecimalToBinaryConverter {
    public DecimalToBinaryConverter(int decimal){
        if(isNull(decimal)){
            throw new IllegalArgumentException("This value is not a decimal");
        }
        DecimalConverter(decimal);
    }

    private boolean isNull(int decimal){
        String validator = Integer.toString(decimal);
        return validator == null;
    }

    private void DecimalConverter(int decimal){
        System.out.println("The value "+decimal+ " in binary is "+ Integer.toBinaryString(decimal));
    }
}
