package org.sourseit.HomeWork.Sydorenko.HW2;

import java.util.Random;

public class Exercise5
{
   public static void mass (int size1, int size2){
       int [][] mass = new int[size1][size2];
        Random ran = new Random();
        for (int i = 0; i<mass.length; i++)
        {
            for (int j = 0; j < mass[i].length; j++)
            {
                mass[i][j] = ran.nextInt(90) + 11;
            }
        }

        for (int i = 0; i<mass.length; i++)
        {
            for (int j = 0; j < mass[i].length; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        mass(8, 5);
    }
}
