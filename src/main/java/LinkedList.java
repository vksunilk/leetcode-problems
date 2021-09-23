
public class LinkedList<E> {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);
        linkedList.add(17);
        linkedList.add(18);


        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        linkedList.remove(5);
        Node ls = linkedList.reverse();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
    private Node<E> first;
    private Node<E> last;
    int size = 0;
    public LinkedList() {
        
    }
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public boolean add(E e) {
        Node<E> nodeL = this.last;
        Node<E> newNode = new Node(nodeL, e, null);
        this.last= newNode;
        if(nodeL==null) {
            first=newNode;
        } else {
            nodeL.next = newNode;
        }
        size++;
        return true;
    }
    public E get(int i) {
        if(size<=i) throw new IndexOutOfBoundsException();
        Node<E> x=null;
        if(i<(size>>2)) {
            x = this.first;
            for (int j = 0; j < i; j++) {
                x = x.next;
            }
        } else {
            x = this.last;
            for (int j = size-1; j > i; j--) {
                x = x.prev;
            }
        }
        return x.item;
    }


    public boolean remove(Object o) {
        for(Node<E> x = first; x!=null;x=x.next){
            if(o.equals(x.item)) {
                Node<E> prev = x.prev;
                Node<E> next = x.next;
                prev.next= next;
                next.prev=prev;
                size--;
                return true;
            }
        }
        return false;
    }
    public int size() {
        return size;
    }
    public Node reverseList(Node head) {
        /* recursive solution */
        return reverseListInt(head, null);
    }

    private Node reverseListInt(Node head, Node newHead) {
        if (head == null)
            return newHead;
        Node next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
    public Node reverse() {
        return reverseListInt(first, null);
    }
}
