import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        n1=input.nextInt();
        n2=input.nextInt();
        n3=n1>>3;
        System.out.println(""+n3);
        n3=n1<<3;
        System.out.println(""+n3);
        


    }
    
}

