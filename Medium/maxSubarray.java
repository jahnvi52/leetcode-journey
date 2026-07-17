
import java.util.Scanner;
public class maxSubarray{
    static int sum(int nums[]){
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            System.out.println(nums[i]);
        }
        int answer=sum(nums);
        System.out.println(answer);
        sc.close();
        
    }
}