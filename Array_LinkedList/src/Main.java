import java.util.Scanner;

public class Main {
    public static void array(){
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] numbers = new int[size];
        int[] num = new int[size-1];

        //input
        System.out.println("Enter the values of array:");
        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }

        System.out.println("Enter the index of value you want to delete");
        int x = sc.nextInt();

        for(int j=0;j<numbers.length;j++){
            if(j<x){
                num[j]=numbers[j];
            }
            else if (j==x){
                continue;
            }
            else{
                num[j-1]=numbers[j];
            }
        }
        System.out.print("The numbers in array are: ");
        for(int j= 0;j<num.length;j++){
            System.out.println(num[j]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Deletion using Array");
       array();
       linklist_deletion ll =new linklist_deletion();
        System.out.println("\n"+"Deletion using Linked List");
       ll.creation();
       ll.traverse();
       ll.delete();
       ll.traverse();
    }
}