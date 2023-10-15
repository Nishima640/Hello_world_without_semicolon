import java.util.Scanner;

public class linklist_deletion {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;

    public void creation(){
        int data, n, m,p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n"+"Enter Data:");
            data= sc.nextInt();
            Node new_node= new Node(data);
            if (head==null){
                head=new_node;
            }
            else {
                System.out.println("Enter 1 to insert the item at the beginning," +"\n"+
                        "Enter 2 to insert at the end"+"\n"+
                        "Enter 3 to insert at specific location");
                m= sc.nextInt();
                switch (m){
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                    case 2:
                        Node temp= head;
                        while (temp.next!=null) {
                            temp=temp.next;
                        }
                        temp.next=new_node;
                        break;
                    case 3:
                        System.out.println("Enter position of node to be inserted");
                        p= sc.nextInt();
                        Node temp1=head;
                        for(int i=0;i<(p-1);i++){
                            temp1=temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;
                }
            }
            System.out.println("Do u want to add more data. If yes, press:1 else press: 0");
            n= sc.nextInt();
        }while (n==1);

    }

    public void delete()
    {
        int  n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            if(head==null){
                System.out.println("Linked list is empty");
            }
            else {
                System.out.println("\n"+"Enter 1 to delete the item at the beginning" +"\n" +
                        "Enter 2 to delete at the end"+ "\n" +
                        "Enter 3 to delete at specific location");
                m= sc.nextInt();
                switch (m){
                    case 1:
                        Node temp = head;
                        temp=temp.next;
                        head=temp;
                        break;
                    case 2:
                        Node temp1= head;
                        Node ptr=temp1.next;
                        while (ptr.next!=null) {
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=null;
                        break;
                    case 3:
                        System.out.println("Enter position of node to be deleted");
                        p= sc.nextInt();
                        Node temp2=head;
                        Node ptr1=temp2.next;
                        for(int i=0;i<(p-2);i++){
                            temp2=ptr1;
                            ptr1=temp2.next;
                        }
                        temp2.next=ptr1.next;
                        break;
                }
            }
            System.out.println("Do u want to delete more data. If yes press 1 else press 0");
            n= sc.nextInt();
        }while (n==1);

    }

    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list does not exit");
        }
        else {
            System.out.println("The linked list is:");
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }
}
