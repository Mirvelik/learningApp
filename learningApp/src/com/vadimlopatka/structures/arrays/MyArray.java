package com.vadimlopatka.structures.arrays;

public class MyArray {
    private long[] a;
    private int nElems;
    private boolean isOrderedArray;


    public MyArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public MyArray(int max, boolean isOrderedArray) {
        a = new long[max];
        nElems = 0;

        this.isOrderedArray = isOrderedArray;
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) // out - разделительный маркер
        {
            long temp = a[out];
            in = out; // Начать перемещения с out
            while (in > 0 && a[in - 1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in - 1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
        }
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) // Внешний цикл (обратный)
            for (in = 0; in < out; in++) // Внутренний цикл (прямой)
                if (a[in] > a[in + 1]) // Порядок нарушен?
                    swap(in, in + 1); // Поменять местами
    }

    public void selectionSort() { //методом выбора
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) // Внешний цикл
        {
            min = out; // Минимум
            for (in = out + 1; in < nElems; in++) // Внутренний цикл
                if (a[in] < a[min]) // Если значение min больше,
                    min = in; // значит, найден новый минимум
            swap(out, min); // Поменять их местами
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }


    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) // Для каждого элемента
            if (a[j] == searchKey) // Значение найдено?
                break; // Да - выход из цикла
        if (j == nElems) // Достигнут последний элемент?
            return false; // Да
        else
            return true; // Нет
    }


    public void insert(long value) {
        if (this.isOrderedArray) {
            orderedInsert(value);
        } else {
            unorderedInsert(value);
        }
    }

    private void unorderedInsert(long value) {
        a[nElems] = value;
        nElems++;
    }

    private void orderedInsert(long value) // Вставка элемента в массив
    {
        int j;
        for (j = 0; j < nElems; j++) // Определение позиции вставки
            if (a[j] > value) // (линейный поиск)
                break;
        for (int k = nElems; k > j; k--) // Перемещение последующих элементов
            a[k] = a[k - 1];
        a[j] = value; // Вставка
        nElems++; // Увеличение размера
    }


    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems) { // Найти не удалось
            return false;
        } else { // Значение найдено

            for (int k = j; k < nElems; k++) // Сдвиг последующих элементов
                a[k] = a[k + 1];
            nElems--; // Уменьшение размера
            return true;
        }
    }

    public long getMax() {
        long result = -1;

        for (int i = 0; i < nElems; i++) {
            if (a[nElems] > result) {
                result = a[nElems];
            }
        }

        return result;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
}
