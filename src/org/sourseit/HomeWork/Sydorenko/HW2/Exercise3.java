package org.sourseit.HomeWork.Sydorenko.HW2;

public class Exercise3
{

    public static int convertToDecimalSystem (String str){
        System.out.print(str);
        int i = 0;
        int num = 0;
        while (i < str.length())
        {
            num *= 10;
            num += str.charAt(i++) - '0';
        }
        int sum = 0;

        for (int j = 0; j<str.length();  j++){
            int c = num%10;
            num/=10;
            sum+= c * ((int)Math.pow(2, j));}
        return sum;
    }
    public static void sum (int a, int b){
        int sum = a + b;
        String sumAB = " ";
        int i = 0;

        while (sum > 0)
        {
            i = sum % 2;
            sum = sum / 2;
            sumAB = i + sumAB;
        }
        System.out.println(" = " + sumAB);

    }

    public static void main(String[] args)
    {
        int a = convertToDecimalSystem("1110101010");
        System.out.print(" + ");
        int b = convertToDecimalSystem("10111001");
        sum(a, b);
        int c = convertToDecimalSystem("10111010");
        System.out.print(" + ");
        int d = convertToDecimalSystem("10010100");
        sum(c, d);
    }

}
