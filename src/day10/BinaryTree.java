package day10;

public class BinaryTree {
    Node root = null;


    Node addNodeRecursive(Node current, int value) {
        if (current == null) return new Node(value);

        if (value < current.value) {
            current.left = addNodeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addNodeRecursive(current.right, value);
        } else return current;
        return current;

    }

    public void add(int value) {
      root =  addNodeRecursive(root, value);
    }

    public void printBinaryTree(Node root){
               
    }
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.printf("%s ", node.value);
        inOrder(node.right);
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(20);
        bt.add(14);
        bt.add(11);
        bt.add(16);
        bt.add(15);
        bt.add(18);
        bt.add(5);
        bt.add(8);
        bt.add(23);
        bt.add(22);
        bt.add(27);
        bt.add(24);
        bt.add(150);
        bt.inOrder();



    }
}
