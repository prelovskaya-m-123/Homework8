import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] arr = new int[3];
        double[] fractionalNumbers = {1.57, 7.654, 9.98};
        int[] numberOfClasses = {2, 4, 5, 6, 7};
        System.out.println("Task2");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[2]);
        System.out.println();
        for (int i = 0; i < fractionalNumbers.length - 1; i++) {
            System.out.print(fractionalNumbers[i] + ", ");
        }
        System.out.print(fractionalNumbers[2]);
        System.out.println();
        for (int i = 0; i < numberOfClasses.length - 1; i++) {
            System.out.print(numberOfClasses[i] + ", ");
        }
        System.out.print(numberOfClasses[4]);
        System.out.println();
        System.out.println("Task3");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[0]);
        System.out.println();
        for (int i = fractionalNumbers.length - 1; i > 0; i--) {
            System.out.print(fractionalNumbers[i] + ", ");
        }
        System.out.print(fractionalNumbers[0]);
        System.out.println();


        for (int i = numberOfClasses.length - 1; i > 0; i--) {
            System.out.print(numberOfClasses[i] + ", ");
        }
        System.out.print(numberOfClasses[0]);
        System.out.println();
        System.out.println("Task4");


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
