// КРАСНО-ЧЕРНОЕ ДЕРЕВО
// Бинарное дерево -  частный случай дерева, где все элементы строго уникальны, 
// каждый родитель имеет не более 2 детей, при этом левый ребенок всегда меньше родителя, правый – больше.

// Сбалансированное дерево - частный случай бинарного дерева, у которого выполняется следующее требование: 
// для любого узла дерева высота его правого поддерева отличается от высоты левого поддерева не более чем на 1.

// Красно-черное дерево - частный случай бинарного сбалансированного дерева:
// - каждый узел может быть либо черным, либо красным, и иметь 2 потомков
// - корень всегда черный
// - дети красного узла обязательно черные
//  Частный случай: левосторонее кр.-черн. дерево - красный узел может быть только левым потомком.

package Lesson16_2;

import java.util.ArrayList;
import java.util.List;

public class RedBlackTree {
    private Node root;

    private class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;
    

        @Override
        public String toString() {
            return "Node{" + "value=" + value + ", color=" + color + "}";
        }
    }

    private enum Color {
        RED, BLACK
    }

    // добавление узла
    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) return false;
        else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else {
                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED;
                    node.leftChild.value = value;
                    return true;
                }
            } else {
                if (node.rightChild != null) {
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;
                } else {
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }
    }

    // левый поворот
    private Node leftSwap(Node node) {
        Node leftChild = node.leftChild;
        Node betweenChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    // правый поворот
    private Node rightSwap(Node node) {
        Node rightChild = node.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    // смена цветов при балансировке
    private void colorSwap(Node node) {
        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    // балансировка дерева
    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED && 
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.rightChild != null && result.rightChild.color == Color.RED) {
                        needRebalance = true;
                        colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }


    // печать дерева (Обход в ширину)
    public void printTree() {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node != null && (node.leftChild != null || node.rightChild != null)) {
                    nextLine.add(node.leftChild);
                    nextLine.add(node.rightChild);
                }
                if (node != null) {
                    System.out.print(node.value + " ");
                    }
                else System.out.print("null ");
            }
            System.out.println();
            line = nextLine;
        }
    }

}
