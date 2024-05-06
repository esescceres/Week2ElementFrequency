import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i=0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
        //Array to store visited information
        boolean[] visited = new boolean[size];

        //Calculate frequencies
        for (int i=0; i<size; i++) {
            if (visited[i]) continue;

            int count = 1;
            for(int j = i+1; j<size; j++) {
                count++;
                visited[j] = true;

                System.out.println(array[i]+":" +count);
            }

        }
    }
}
