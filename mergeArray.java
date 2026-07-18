import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MERGE ARRAY");
        System.out.println();
        System.out.print("Enter the size of your first array : ");
        int size1 = input.nextInt();
        int[] array = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter your " + (i+1) + " element: ");
            array[i] = input.nextInt();
        }
        System.out.println("FIRST ARRAY INPUTED SUCCESSFULLY!!!!");
        System.out.println();

        System.out.print("Enter the size of your second array : ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter your " + (i+1) + " element: ");
            array2[i] = input.nextInt();
        }
        System.out.println("SECOND ARRAY INPUTED SUCCESSFULLY!!!!");
        System.out.println();
        System.out.println("LETS PRESENT YOUR MERGED ARRAY :");
        
        int []mergedArray = new int[array.length+array2.length];
        for(int i=0;i<array.length;i++){
            mergedArray [i]=array[i];
        }

        for(int i= 0;i<array2.length;i++){
            mergedArray[i+array.length]=array2[i];
        }
        for(int i=0;i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+ " ");
        }
        System.out.println();
        System.out.println("CONGRATULATIONS YOUR WORK IS DONE");
    }
}
