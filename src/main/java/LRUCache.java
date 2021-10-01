import java.util.HashMap;

class Node {
    int value;
    int key;
    Node prev;
    Node next;
}
public class LRUCache {
    private int LRU_SIZE = 3;
    HashMap<Integer,Node> hashMap;
    Node start,end;

    public LRUCache(){
        hashMap= new HashMap<>();
    }
    public int get(int key){
        if(hashMap.containsKey(key)){
            Node node = hashMap.get(key);
            removeNode(node);
            addAtTop(node);
            return node.value;
        }
        return -1;
    }
    public void put(int key, int value){
        if(hashMap.containsKey(key)){
            Node node = hashMap.get(key);
            node.value=value;
            removeNode(node);
            addAtTop(node);
        } else {
            Node newNode = new Node();
            newNode.key=key;
            newNode.value=value;
            addAtTop(newNode);
            if(hashMap.size()>LRU_SIZE) {
//                hashMap.remove(end.key);
                removeNode(end);
            }
        }
    }
    private void removeNode(Node node){
        if(node.prev!=null) {
            node.prev.next = node.next;
        } else {
            start = node.next;
        }
        if(node.next!=null) {
            node.next.prev=node.prev;
        } else {
            end= node.prev;
        }
        hashMap.remove(node.key);
    }
    private void addAtTop(Node node){
        node.next=start;
        node.prev=null;
        if (start!=null) {
            start.prev=node;
            node.next = start;
            start=node;
        }
        if(start==null){
            start=node;
        }
        if(end==null){
            end=start;
        }
        hashMap.put(node.key, node);
    }
    public static void main(String[] args) {
        LRUCache lrucache = new LRUCache();
        lrucache.put(1, 1);
        lrucache.put(10, 15);
        lrucache.put(15, 10);
        lrucache.put(10, 16);
        lrucache.put(12, 15);
        lrucache.put(18, 10);
        lrucache.put(13, 16);

        System.out.println(lrucache.get(1));
        System.out.println(lrucache.get(10));
        System.out.println(lrucache.get(15));
    }
}
