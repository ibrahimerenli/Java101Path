public class linkList {
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        l1.next = l4;
        l2.next = l1;
        l3.next = l2;
        l4.next = null;

        Node arr[] = {l1,l2,l3,l4};
        Node head = new Node(0);
        Node temp;
       

        for (Node node : arr) {
            temp = node;
            int counter = 0;
            boolean flag = false;
            while(temp.next != null){
                temp = temp.next;
                counter++;
                if(counter == 4){
                    head = node;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }

        System.out.println(head.data);

    }
    
}
class Node { 
    int data; 
    Node next; 

    Node(int d) { data = d; }
} 
