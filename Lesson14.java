// СОРТИРОВКА И ПОИСК В МАССИВАХ.
// Алгоритмы сортировок: пузырьковая, выбором (2 варианта), вставкой, быстрая сортировка, кучей (пирамидальная).
// Алгоритмы поиска: прямой (перебор значений), бинарный.

import java.util.Random;

public class Lesson14 {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        int findNumber = 5;    // задаем число для поиска в массиве

        System.out.println("Пузырьковая сортировка");
        arr = createArray(arr);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
        System.out.println();

        System.out.println("Сортировка выбором. Вариант 1");
        arr = createArray(arr);
        printArray(arr);
        selectionSort1(arr);
        printArray(arr);

        System.out.println("Сортировка выбором. Вариант 2");
        arr = createArray(arr);
        printArray(arr);
        selectionSort2(arr);
        printArray(arr);
        System.out.println();

        System.out.println("Сортировка вставкой");
        arr = createArray(arr);
        printArray(arr);
        insertSort(arr);
        printArray(arr);
        System.out.println();

        System.out.println("Быстрая сортировка");
        arr = createArray(arr);
        printArray(arr);
        quickSort(arr);
        printArray(arr);
        System.out.println();

        System.out.println("Сортировка кучей (пирамидальная)");
        arr = createArray(arr);
        printArray(arr);
        heapSort(arr);
        printArray(arr);
        System.out.println();

        System.out.println("Прямой поиск");
        arr = createArray(arr);
        printArray(arr);
        System.out.println("число: " + findNumber + "  индекс: " + findIndex(arr, findNumber));
        System.out.println();

        System.out.println("Бинарный поиск");
        quickSort(arr);
        printArray(arr);
        System.out.println("число: " + findNumber + "  индекс: " + binSearch(arr, findNumber));

    }

    public static int[] createArray(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] = new Random().nextInt(10);
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }


    //---------------------------------------------------------------------------------------------
    //      СОРТИРОВКА


    // Пузырьковая сортировка О(n^2)
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        for (int k = 0; k < array.length - 1 && !isSorted; k++) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }


    //----------------------------------------------------
    // Сортировка выбором O(n^2)
    // Вариант 1
    public static void selectionSort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition])
                    minPosition = j;
            }
            if (minPosition != i) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    // Сортировка выбором. Вариант 2
    public static void selectionSort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    //-----------------------------------------------------
    // Сортировка вставкой O(n^2)
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int left = i - 1;
            while (left >= 0 && value < array[left]) {
                array[left + 1] = array[left];
                left--;
            }
            if (left + 1 != i) array[left + 1] = value;
        }
    }


    //-------------------------------------------------------
    // Быстрая сортировка quicksort O(n log n) - рекурсивно
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);    // используем перегрузку
    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        while (leftMarker <= rightMarker) {
            while (array[leftMarker] < pivot) 
                leftMarker++;
            while (array[rightMarker] > pivot) 
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] =temp;
                }
            leftMarker++;
            rightMarker--;
            }
        }
    if (leftBorder < rightMarker) 
        quickSort(array, leftBorder, rightMarker);
    if (leftMarker < rightBorder) 
        quickSort(array, leftMarker, rightBorder);
    }


    //-------------------------------------------------------
    // Сортировка кучей (пирамидальная) O(n log n)
    public static void heapSort(int[] array) {
        // Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        // один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // вызываем ф-ю heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;    // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        // если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        // если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // рекурсивно преоразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }

    //----------------------------------------------------------------------------------------------------------
    //     Алгоритмы поиска


    // Прямой поиск (перебор всех значений) O(n)
    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }


    // Бинарный поиск O(logn). Работает с ОТСОРТИРОВАННЫМИ массивами. Рекурсия.
    // Возвращает индекс искомого элемента, либо -1 если элемент не найден.
    public static int binSearch(int[] array, int value) {
        return binSearch(array, value, 0, array.length - 1);
    }

    private static int binSearch(int[] array, int value, int left, int right) {
        if (left > right) 
            return -1;
        int mid = (left + right) / 2;
        if (array[mid] < value) 
            return binSearch(array, value, mid + 1, right);
        else if (array[mid] > value) 
            return binSearch(array, value, left, mid - 1);
        else 
            return mid;
    }

}
