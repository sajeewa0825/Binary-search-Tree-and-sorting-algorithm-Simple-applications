package Project;

class SelectionSort
{
    void sort(int arr[],String name[])
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            String tempname = name[min_idx];
            arr[min_idx] = arr[i];
            name[min_idx]=name[i];
            arr[i] = temp;
            name[i]=tempname;
        }
    }

    void printArray(int arr[],String name[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(name[i] + "-" + arr[i]+" ");
        System.out.println();
    }

}

