// ПРОСТОЕ ДЕРЕВО. Считаем что нет повторяющихся значений.

package Lesson16_2;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;


    private class Node {
        private int value;
        private List<Node> children;
    }


    // проверка существования узла по его значению
    public boolean exist(int value) {
        if (root != null) {
            Node node = find1(root, value);
            if (node != null) return true;
        }
        return false;
    }


    //поиск узла по значению (Обход в глубину, рекурсивно)
    private Node find1(Node node, int value) {
        if (node.value == value) return node;
        else {
            for (Node child : node.children) {
                Node result = find1(child, value);
                if (result != null) return result;
            }
        }
        return null;
    }

    //поиск узла по значению (Обход в ширину)
    private Node find2(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) return node;
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

}
