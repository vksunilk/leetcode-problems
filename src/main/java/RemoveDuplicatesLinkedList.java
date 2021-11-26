import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesLinkedList {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

        LinkedList dummy = linkedList;
        while(dummy!=null) {
            LinkedList nextNode=dummy.next;
            while(nextNode!=null && dummy.value ==nextNode.value) {
                nextNode=nextNode.next;
            }
            dummy.next=nextNode;
            dummy=nextNode;
        }
        return linkedList;
    }
    public RemoveDuplicatesLinkedList.LinkedList addMany(RemoveDuplicatesLinkedList.LinkedList ll,
                                                         List<Integer> values) {
        RemoveDuplicatesLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicatesLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(RemoveDuplicatesLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        RemoveDuplicatesLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        RemoveDuplicatesLinkedList.LinkedList input = new RemoveDuplicatesLinkedList.LinkedList(1);
        addMany(input, new ArrayList<>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6));
        RemoveDuplicatesLinkedList.LinkedList output = new RemoveDuplicatesLinkedList().removeDuplicatesFromLinkedList(input);
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}
