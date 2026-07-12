package Medium;
import java.util.Scanner;
public class identitymatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean isIdentity=true;
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols-1;j++){
        
        if(matrix[i][j]!=matrix[i+1][j+1]){
            isIdentity=false;
            break;
        }}
        if(!isIdentity){
            
            break;
        }}
        if(isIdentity){
            System.out.println("identity matrix");
        }
        else{
            System.out.println("not identity matrix");
        }
        
        sc.close();

    }
}