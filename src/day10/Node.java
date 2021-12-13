package day10;

class Node {



     static int count = 0;
    int value;
    Node left;
    Node right;


    Node(int value) {
        this.value = value;
        left = null;
        right = null;
      count++;
    }

    public String toString() {
        return "Значение = " + value;
    }

}
