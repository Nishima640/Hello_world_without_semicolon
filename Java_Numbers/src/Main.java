import java.util.LinkedList;
public class Main {

    //Generate numbers from 1 to 100 using array
    public static void array_num(){
        int[] array = new int[100];
        for(int i=0;i<100;i++){
            array[i]=i+1;
        }
        for(int num: array){
            System.out.print(num+"\t");
        }
    }

    //Generate numbers from 1 to 100 using linked list
    public static void ll_num(){
        LinkedList<Integer> ll = new LinkedList<>();
        for( int j=0;j<100;j++){
            ll.add(j+1);
        }
        for (int number : ll) {
            System.out.print(number+"\t");
        }
    }
    public static void main(String[] args) {
        System.out.println("Numbers generated using array:");
        array_num();
        System.out.println("\n"+"Numbers generated using LinkedList:");
        ll_num();
    }
}