package org.sourseit.HomeWork.Sydorenko.HW2;

public class Exercise4
{
    public static int convertToDecimalSystem(String str)
    {
        System.out.print(str);
        int i = 0;
        int num = 0;
        while (i < str.length())
        {
            num *= 10;
            num += str.charAt(i++) - '0';
        }
        int sum = 0;

        for (int j = 0; j < str.length(); j++)
        {
            int c = num % 10;
            num /= 10;
            sum += c * ((int) Math.pow(2, j));
        }
        return sum;
    }

    public static void raz(int a, int b)
    {
        int raz = a - b;
        String razAB = " ";
        int i = 0;

        while (raz > 0)
        {
            i = raz % 2;
            raz = raz / 2;
            razAB = i + razAB;
        }
        System.out.println(" = " + razAB);

    }

    public static void main(String[] args)
    {
        int a = convertToDecimalSystem("1000000100");
        System.out.print(" - ");
        int b = convertToDecimalSystem("101010001");
        raz(a, b);
        int c = convertToDecimalSystem("1010111101");
        System.out.print(" - ");
        int d = convertToDecimalSystem("111000010");
        raz(c, d);
    }
}