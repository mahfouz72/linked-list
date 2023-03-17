public class DLL {

private Node head;
private Node tail;
private Node prev;
public static int size=0;




public void add (int val){

        Node node = new Node (val);

        if(tail==null){          // insertion when list is empty
        node.prev=null;
        head=node;
        tail=node;
        size++;
        return;
        }

        tail.next = node;
        node.prev= tail;
        node.next=null;
        tail = node;
        size++;
        }

public void addtoindex (int index, int val){


        if(index==0) {
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
        size++;
        return;
        }

        Node temp = head;
        for (int i = 1 ; i <index ; i++)
              temp= temp.next;

        Node node = new Node(val,temp.next,temp);
        temp.next.prev=node;
        temp.next=node;
        size++;

        }

public Node get(int index){
        Node temp= head;

        for (int i = 0; i < index; i++) {
        temp=temp.next;
        }
        return temp;
        }

public void set(int index,int val){

        Node temp= head;
        for (int i = 0; i < index; i++) {
        temp=temp.next;
        }
        temp.data=val;

        }


public void clear(){

        head=null;
        tail=null;
        size=0;
        }

public boolean isEmpty(){
        return (size<=0);
        }

public void remove (int index){


        if(index==0) {
        head=head.next;
        if (head == null) {
        tail = null;
        }
        size--;
        return;
        }
        Node node =  get(index-1);
        if(index<size-1)  node.next.next.prev=node;
        node.next=node.next.next;
        size--;

        }
public boolean contains(int val){
        Node temp= head;
        while(temp!=null)
        {
        if(temp.data==val) return true;
        temp=temp.next;
        }
        return false;
        }

public void sublist(int fromIndex,int toIndex){

        DLL sublist = new DLL();
        Node current=get(fromIndex);
        for (int i = fromIndex; i <= toIndex; i++) {
        sublist.add(current.data);
        if(current.next!=null) current = current.next;
        }
        current.next=null;
        sublist.print();
        }


public void print(){

        System.out.print("[");

        Node temp = head ;
        while (temp!=null){
        System.out.print(temp.data);
        if(temp.next!=null)  System.out.print(", ");
        temp=temp.next;

        }

        System.out.print("]");
        }


public static class Node{

    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
        this.data=data;
    }
    public Node(int data,Node next,Node prev){
        this.data=data;
        this.next = next;
        this.prev = prev;
    }

}

}