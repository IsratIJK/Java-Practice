import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radious,area;
        radious = input.nextDouble();
        area = 3.1416*radious*radious;
        System.out.println(""+area);

    }
    
}


