package Project;

public class InsertionSort {

    void sort(int arr[], String name[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            String nameKey = name[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                name[j+1] = name[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            name[j + 1] = nameKey;
        }
    }

    void printArray(int arr[],String name[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(name[i] + "-" + arr[i]+" ");

        System.out.println();
    }

}

