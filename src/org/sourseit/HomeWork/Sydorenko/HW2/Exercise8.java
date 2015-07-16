package org.sourseit.HomeWork.Sydorenko.HW2;

import java.util.Scanner;

public class Exercise8
{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int number = 2; number <= n; number++)
        {

            if (isPrime(number))
            {
                System.out.print(number + " ");
            }
        }

    }

     public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number%i == 0)
            {
                return false;
            }
        }
        return true;
    }

}

