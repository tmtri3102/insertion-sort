public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 11, 3};

        System.out.println("Bước 1: Bắt đầu với một mảng chưa sắp xếp.");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Cuối cùng, mảng đã được sắp xếp.");
        printArray(arr);
    }

    public static void insertionSort(int[] array) {
        System.out.println("Bước 2: Xem phần tử đầu tiên như là phần đã sắp xếp ban đầu.");
        printArray(array);

        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;

            System.out.println("\nBước " + (i * 2 + 1) + ": Xét phần tử tiếp theo " + x + ".");
            printArray(array);

            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;

            System.out.println("Bước " + (i * 2 + 2) + ": Chèn " + x + " vào đúng vị trí trong phần đã sắp xếp của mảng.");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
