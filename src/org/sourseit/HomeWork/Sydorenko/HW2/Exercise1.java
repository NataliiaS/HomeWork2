package org.sourseit.HomeWork.Sydorenko.HW2;

public class Exercise1
{
public static int stringToInt (String str){
    int i = 0;
    int num = 0;
    while (i < str.length())
    {
        num *= 10;
        num += str.charAt(i++) - '0';
    }
    return num;
}
   public static void convertToSystem (int number, int system){
       System.out.print(number);
       String A = " ";

        int j = 0;

        while (number > 0)
        {
            number = number / system;
            j = number % system;
            if (j>9 && j<16)
            {
                if (j == 10)
                {
                    A = 'A' + A;
                } else if (j == 11)
                {
                    A = 'B' + A;
                } else if (j == 12)
                {
                    A = 'C' + A;
                } else if (j == 13)
                {
                    A = 'D' + A;
                } else if (j == 14)
                {
                    A = 'E' + A;
                } else if (j == 15)
                {
                    A = 'F' + A;
                }
            }

            else {
                    A = j + A;
                }
        }
       if (system == 2){
           System.out.println(" to binary system " + A);
       }
       else if (system == 8){
           System.out.println(" to octal system " + A);
       }
       else {
        System.out.println(" to hexadecimal system " + A);
       }
    }

    public static void main(String[] args)
    {
        int a = stringToInt("949");
        convertToSystem (a, 2);
        convertToSystem (a, 8);
        convertToSystem (a, 16);
        int b = stringToInt("763");
        convertToSystem (b, 2);
        convertToSystem (b, 8);
        convertToSystem (b, 16);
    }


}

