//mport java.util.Scanner;

public class add_array_element {
    public static void main(String[] args) {
       int[] newArray = returnArray.array();
        int addition=0;
        for(int i=0;i<newArray.length;i++){
            addition=newArray[i]+addition;
        }
        System.out.println("Your answer is " + addition);
    }
    
}
