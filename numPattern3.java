/*
 Input
 5
 Output
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
 */
import java.util.Scanner;
public class numPattern3 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = " ";
        for(int i=1;i<=n;i++){
            System.out.print(space.repeat(n-i));
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }
}
