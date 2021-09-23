import java.util.*;

public class BranchSums {
    public static void main(String[] args) {
        BinarySearchTree bs= new BinarySearchTree(5);
        bs.insert(10);
        bs.insert(4);
        bs.insert(1);
        bs.insert(2);
        bs.insert(3);
        bs.insert(6);
        bs.insert(7);
        bs.insert(9);
        bs.insert(8);
        bs.insert(11);
        bs.insert(12);
        bs.insert(16);
    }
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> ls = new ArrayList<>();
        branchSums(root, ls, 0);
        return ls;
    }
    public static Integer branchSum(BinaryTree root) {
        if(root == null) return 0;
        return branchSum(root.left)+ root.value+ branchSum(root.right);
    }
    public static void branchSums(BinaryTree tree, List<Integer> ls, int sum) {
        if(tree == null) return;
        int newsum=sum+tree.value;
        if(tree.right ==null && tree.left == null) {
            ls.add(sum);
            return;
        }
        branchSums(tree.left, ls, newsum);
        branchSums(tree.right, ls, newsum);
    }
}

