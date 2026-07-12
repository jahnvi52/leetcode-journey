import java.util.Scanner;
public class toeplitz{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][]matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean isToeplitz=true;
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    isToeplitz=false;
                    break;
                }
            }
            if(!isToeplitz){
                break;
            }
    }
        if(isToeplitz){
            System.out.println("toeplitz matrix");
        }else{
            System.out.println("not a toeplitz matrix");
        }
        sc.close();
        
    }
}