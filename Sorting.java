class Sorting
{
    public static void main(String[] args)
    {
        int arr[] = { 12, 11, 13, 5, 6 };
        int N = arr.length;

        insertionSort(arr, N);
        printArray(arr, N);

        selectionSort(arr,N);
        printArray(arr,N);
    }
    static void insertionSort(int arr[], int n)
    {
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[], int n)
    {
        int i;

        // Print the array
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[], int n)
    {
        int i, j, min_idx;

        for (i = 0; i < n - 1; i++)
        {

            min_idx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx]= arr[i];
            arr[i] = temp;
        }
    }


    public void sort1(int [] arr, int n){
        insertionSort(arr,n);
    }
    public void sort2(int [] arr, int n){
        selectionSort(arr,n);
    }
}




