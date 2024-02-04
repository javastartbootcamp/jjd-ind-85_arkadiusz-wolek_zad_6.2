package pl.javastart.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        while (arraySize <= 0 || arraySize > 100) {
            System.out.println("Podaj rozmiar tablicy:");
            try {
                arraySize = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println();
                scanner.nextLine();
            }
        }
        System.out.println("Wprowadź " + arraySize + " liczb:");
        double[] array = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextDouble();
        }
        double sum = 0.0;
        for (double x : array) {
            sum += x * x;
        }
        System.out.println("Suma kwadratów wprowadzoych liczb to " + sum);
    }
}
