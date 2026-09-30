class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }

}

class Linkedlist{
    Node head;
    void add(int data){
        Node newnode =new Node(data);

        if (head==null){
            head=newnode;
        }
        else{
            Node current=head;

            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
            
        }

    }
    void print(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
class Node1{
    public static void main(String[] args) {
        Linkedlist l1=new Linkedlist();
        l1.add(10);
        l1.add(20);

        l1.print();
    }
}