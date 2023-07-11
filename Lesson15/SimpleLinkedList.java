//ОДНОСВЯЗНЫЙ СПИСОК И ЕГО МЕТОДЫ

package Lesson15;

public class SimpleLinkedList<T extends Comparable<T>> {
    private Node root; // начальный (1-й) узел
    private int size; // размер списка

    // добавление узла (в конец списка)
    public void add(T value) {
        if (root == null) {
            root = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    // вставка узла в список в позицию index
    public void addAt(T value, int index) {
        if (index < 0 || index > size)
            return;
        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = root;
            root = newNode;
            size++;
            return;
        }
        Node currentNode = getNode(index - 1);
        Node newNode = new Node(value, currentNode.next);
        currentNode.next = newNode;
        size++;
    }

    // удаление узла по значению
    public boolean remove(T value) {
        if (root == null)
            return false;
        if (root.value.compareTo(value) == 0) {
            root = root.next;
            size--;
            return true;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value.compareTo(value) == 0) {
                currentNode.next = currentNode.next.next;
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // удаление узла по индексу (по его номеру)
    public void removeAt(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0) {
            root = root.next;
            size--;
            return;
        }
        Node currentNode = getNode(index - 1);
        currentNode.next = currentNode.next.next;
        size--;
    }

    // получение значения узла по его индексу (номеру)
    public T getValue(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node currentNode = root;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode.value;
    }

    // получение узла по его индексу (номеру)
    private Node getNode(int index) {
        if (index < 0 || index >= size)
            return null;
        if (index == 0)
            return root;
        Node currentNode = root;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode;
    }

    // получение размера списка
    public int getSize() {
        return size;
    }

    // очистка списка
    public void clear() {
        root = null;
        size = 0;
    }

    // замена (перестановка) значений 2-х узлов
    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size)
            return;
        if (index2 < 0 || index2 >= size)
            return;
        Node node1 = getNode(index1);
        Node node2 = getNode(index2);
        T temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    // сортировка списка по значениям методом быстрой сортировки
    public void quickSort() {
        quickSort(0, size - 1);
    }

    private void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        T pivot = getValue((leftMarker + rightMarker) / 2);
        do {
            while (getValue(leftMarker).compareTo(pivot) < 0) {
                leftMarker++;
            }
            while (getValue(rightMarker).compareTo(pivot) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker)
                    swap(leftMarker, rightMarker);
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder)
            quickSort(leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            quickSort(leftBorder, rightMarker);
    }

    // печать значений всего списка
    public void print() {
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // разворот списка (сделано без введения ссылки (Node previous;) на предыдущий
    // узел в классе Node)
    public void reverse() {
        if (root == null || root.next == null)
            return;
        Node prevprevNode = null;
        Node prevNode = root;
        Node currentNode = root.next;
        while (currentNode != null) {
            prevNode.next = prevprevNode;
            prevprevNode = prevNode;
            prevNode = currentNode;
            if (currentNode.next == null) {
                root = currentNode;
                prevNode.next = prevprevNode;
                prevprevNode = prevNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    private class Node {
        T value;
        Node next;

        Node() { // при вызове конструктор создаст value=0, next=null
        }

        Node(T _value) {
            this.value = _value;
        }

        Node(T _value, Node _next) {
            this.value = _value;
            this.next = _next;
        }
    }
}
