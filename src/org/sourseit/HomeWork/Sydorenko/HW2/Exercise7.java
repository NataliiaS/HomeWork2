package org.sourseit.HomeWork.Sydorenko.HW2;

import java.util.Scanner;

public class Exercise7
{



            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(sum(n));
            }


    static int sum(int n)
    {


        if (n == 1)
        {
            return 1;
        }

        return ((1 + n)* n) / 2 ;

    }


}



