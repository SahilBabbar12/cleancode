import java.util.*;
public class ReducingArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= scan.nextInt();
        int[] firstarray= new int[n];
        int[] secondarray=new int[n];

//      creating a copy of first array in second array
        System.out.println("Enter the elements of array");
        for(int index=0;index<firstarray.length;index++){
            firstarray[index]=scan.nextInt();
            secondarray[index]=firstarray[index];
        }

        reducedArray(firstarray,secondarray);
    }

    // function to reduce array
    static void reducedArray(int []firstarray,int[]secondarray){
        /*sort the second array
        creating a hashmap and add the element  of sorted array as key and index as value
        * */
        Arrays.sort(secondarray);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int index=0;index<firstarray.length;index++){
            map.put(secondarray[index],index);
        }
        /* iterating the unsorted array and replacing each element by its value stored in hashmap respectively*/
        for(int index=0;index<firstarray.length;index++){
            firstarray[index]=map.get(firstarray[index]);
        }
        printArray(firstarray);
    }
    //print the reduced array
    static void printArray(int[] firstarray){
        System.out.println("Reduced Array");
        for(int index=0;index<firstarray.length;index++){
            System.out.print(firstarray[index] + " ");
        }
    }

}
