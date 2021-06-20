package com.company;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int matrixA[][];
        int matrixB[][];

        System.out.print("Enter the first matrix column size: ");
        int column1 = input.nextInt();
        System.out.print("Enter the first matrix row size: ");
        int row1 = input.nextInt();

        System.out.print("Enter the second matrix column size: ");
        int column2 = input.nextInt();
        System.out.print("Enter the second matrix row size: ");
        int row2 = input.nextInt();

        while (column1 != row2)
        {
            System.out.println("Can not multiply! The first matrix row must equal second matrix column.");
            System.out.print("Enter the first matrix column size: ");
            column1 = input.nextInt();
            System.out.print("Enter the first matrix row size: ");
            row1 = input.nextInt();

            System.out.print("Enter the second matrix column size: ");
            column2 = input.nextInt();
            System.out.print("Enter the second matrix row size: ");
            row2 = input.nextInt();
        }

        matrixA = new int[row1][column1];
        matrixB = new int[row2][column2];
        int matrixC[][] = new int [row1][column2];


        System.out.println("Enter Matrix A: ");
        for (int i = 0; i < matrixA.length; i++)
        {
            for (int j = 0; j < matrixA[i].length; j++)
            {
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter Matrix B: ");
        for (int i = 0; i < matrixB.length; i++)
        {
            for (int j = 0; j < matrixB[i].length; j++)
            {
                matrixB[i][j] = input.nextInt();
            }
        }

        for (int row = 0; row< row1; row++)
            for (int column = 0; column < column2; column++)
                for (int z = 0; z < column1; z++)
                {
                    matrixC[row][column] += matrixA[row][z] * matrixB[z][column];
                }

        System.out.println("Your results are: ");
        for (int i = 0; i < matrixC.length; i++)
        {
            for (int j = 0; j < matrixC[i].length; j++)
            {
                System.out.print(matrixC[i][j] + " ");
            }
        }
    }
}
