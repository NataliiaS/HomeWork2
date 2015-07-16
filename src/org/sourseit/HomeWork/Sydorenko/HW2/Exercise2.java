package org.sourseit.HomeWork.Sydorenko.HW2;


public class Exercise2
{
    public static void convertToDecimalSystem(String str)
    {
        int i = 0;
        int num = 0;
        while (i < str.length())
        {
            num *= 10;
            num += str.charAt(i++) - '0';
        }
        System.out.print(num);
        int sum = 0;

        for (int j = 0; j < str.length(); j++)
        {
            int c = num % 10;
            num /= 10;
            sum += c * ((int) Math.pow(2, j));
        }
        System.out.println(" to decimal system " + sum);
    }

    public static void main(String[] args)
    {

        convertToDecimalSystem("111000111");
        convertToDecimalSystem("100011011");

    }
}

