package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(arr, 0, arr.length - 1);

        for(int num : arr)
            System.out.println(num);
    }

    public static void mergeSort(int [] arr, int left, int right) {
        if(left < right) {
            int mid = (left+right)/2;

            mergeSort(arr, left, mid);

            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int lN = mid - left + 1;
        int rN = right - mid;

        int[] lArr = new int[lN];
        int[] rArr = new int[rN];;

        for(int i=0; i<lN; i++)
            lArr[i] = arr[left+i];

        for(int i=0; i<rN; i++)
            rArr[i] = arr[mid+1+i];

        int i = 0, j = 0, k = left;
        while(i < lN && j < rN) {
            if(lArr[i]<rArr[j])
                arr[k++] = lArr[i++];
            else arr[k++] = rArr[j++];
        }

        while(i < lN)
            arr[k++] = lArr[i++];
        while(j < rN)
            arr[k++] = rArr[j++];
    }
}
