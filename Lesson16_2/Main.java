package Lesson16_2;

public class Main {
    public static void main(String[] args) {
        
        BinTree tree = new BinTree();
        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(7);
        tree.add(6);
        tree.add(2);
        tree.add(0);
        System.out.println(tree.contain(5));
        System.out.println(tree.contain(1));
        System.out.println(tree.contain(9));
        System.out.println(tree.contain(100));

        System.out.println("-----------------");
        
        RedBlackTree rbtree = new RedBlackTree();
        rbtree.add(7);
        rbtree.add(4);
        rbtree.add(8);
        rbtree.add(3);
        rbtree.add(5);
        rbtree.add(6);
        rbtree.add(9);
        rbtree.add(1);
        rbtree.add(2);

        rbtree.printTree();

    }
}