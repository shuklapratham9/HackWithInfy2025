import java.util.Arrays;
import java.util.Scanner;
public class MaxActivity {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int ans=1;
        
        Arrays.sort(a,(g,h)->Integer.compare(g[1],h[1]));
        int le=a[0][1];
        for(int i=1;i<n;i++){
            if(a[i][0]>=le){
                ans++;
                le=a[i][1];
            }
        }
        System.out.println(ans);

        
        
    }
}
