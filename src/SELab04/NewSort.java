package SELab04;

public class NewSort 
{
    void merge(int arr[], int l, int m, int r)
    {
        int t1Size = m - l + 1, t2Size = r - m;
 
        int T1[] = new int[t1Size], T2[] = new int[t2Size];
 
        for(int i = 0; i < t1Size; i++)
            T1[i] = arr[l + i];
        for(int j = 0; j < t2Size; j++)
            T2[j] = arr[m + 1 + j];
 
        int i = 0, j = 0, k = l;

        while(i < t1Size && j < t2Size) {
            if(T1[i] <= T2[j])
                arr[k] = T1[i++];
            else
                arr[k] = T2[j++];
            k++;
        }
 
        while (i < t1Size)
            arr[k++] = T1[i++];
 
        while (j < t2Size)
            arr[k++] = T2[j++];
    }
 
    void MergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
 
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
 
    static void display(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        int arr[] = {123, 1, 4562, 6, 78, 34};
 
        NewSort NSrt = new NewSort();
        NSrt.MergeSort(arr, 0, arr.length - 1);
 
        display(arr);
    }
}
