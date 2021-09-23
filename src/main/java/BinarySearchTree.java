public class BinarySearchTree {
    public static void main(String[] args){
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
        System.out.println(bs.contains(1));
        System.out.println(bs.contains(10));
        System.out.println(bs.contains(11));
        System.out.println(bs.contains(505));
        bs.remove(10);
        bs.remove(7);
    }

    private int value;
    private BinarySearchTree left;
    private BinarySearchTree right;

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public BinarySearchTree insert(int value) {
        if(value < this.value){
            if(this.left == null) {
                this.left = new BinarySearchTree(value);
            } else {
                this.left.insert(value);
            }
        } else{
            if(this.right == null) {
                this.right = new BinarySearchTree(value);
            } else {
                this.right.insert(value);
            }
        }
        return this;
    }

    public boolean contains(int value) {
       if(value < this.value){
           if(this.left == null){
               return false;
           } else {
               return this.left.contains(value);
           }
       } else if(value > this.value) {
           if(this.right == null){
                return false;
           } else {
               return this.right.contains(value);
           }
       } else {
           return true;
       }
    }

    public BinarySearchTree remove(int value) {
       remove(value, null);
       return this;
    }

    private void remove(int value, BinarySearchTree parent) {
        if(value < this.value){
            if(this.left!=null) {
                this.left.remove(value,this);
            }
        } else if(value > this.value) {
            if(this.right!=null) {
                this.right.remove(value, this);
            }
        } else {
            if(this.right != null && this.left != null) {
                this.value = right.getMinValue();
                this.right.remove(this.value, this);
            } else if (parent ==null) {
                if(this.left!=null) {
                    this.value=left.value;
                    this.right=left.right;
                    this.left=left.left;
                } else if (right!=null) {
                    this.value= right.value;
                    this.right=right.right;
                    this.left=right.left;
                } else {

                }
            } else if(this == parent.left) {
                parent.left=this.left!=null?this.left:this.right;
            } else if(this == parent.right) {
                parent.right=right!=null?this.right:this.left;
            }
        }
    }
    public int getMaxValue() {
        if(right == null) {
            return this.value;
        } else {
            return right.getMaxValue();
        }
    }
    public int getMinValue() {
        if(left == null) {
            return this.value;
        } else {
            return left.getMinValue();
        }
    }
}
