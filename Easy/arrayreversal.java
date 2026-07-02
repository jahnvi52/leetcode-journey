import java.util.Scanner;

public class arrayreversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int[] arr1 = new int[p];
        for(int i = 0; i < p; i++){
            arr1[i] = sc.nextInt();
        }
        
        int q = sc.nextInt();
        int[] arr2 = new int[q];
        for(int i = 0; i < q; i++){
            arr2[i] = sc.nextInt();
        }
        
        int[] result = new int[p + q];
        int i = 0, j = 0, k = 0;
        
        while(i < p && j < q){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        while(i < p){
            result[k] = arr1[i];
            i++;
            k++;
        }
        
        while(j < q){
            result[k] = arr2[j];
            j++;
            k++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int idx = 0; idx < result.length; idx++){
            sb.append(result[idx]);
            if(idx != result.length - 1) sb.append(" ");
        }
        
        System.out.println(sb.toString());
    }
}