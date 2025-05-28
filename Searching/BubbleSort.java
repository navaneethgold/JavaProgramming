package Searching;

public class BubbleSort {
    public static void Bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean isswap=false; //small optimization in bubble sort
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswap=true;
                }
            }
            if(!isswap){
                return;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        Bubblesort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
