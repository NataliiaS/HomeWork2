package org.sourseit.HomeWork.Sydorenko.HW2;

import java.util.Random;

public class Exercise6
{
    public static int [][] mass (int size1, int size2)
    {
        int[][] mass = new int[size1][size2];
        Random ran = new Random();
        for (int i = 0; i < size1; i++)
            for (int j = 0; j < size2; j++)
                mass[i][j] = ran.nextInt(11) - 5;
        for (int i = 0; i < size1; i++)
        {
            for (int j = 0; j < size2; j++)
            {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        return mass;
    }
    public static void maxIndex (int [][] mass){
        int max = 0;
        int maxindex = 0;
        for (int i = 0; i<mass.length; i++)
        {
            int pr = 1;
            for (int j = 0; j < mass[i].length; j++)
            {
                pr *= Math.abs(mass[i][j]);
            }
            if (pr > max)
            {
                max = pr;
                maxindex = i;
            }
        }
        System.out.println("Наибольшее произведение по модулю элементов строки равно " + max + " индекс строки " + maxindex);
    }

    public static void main(String[] args)
    {
        int [][] a = mass(7,4);
        maxIndex(a);
    }

}
