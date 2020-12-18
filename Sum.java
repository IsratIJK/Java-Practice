public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0;
        int m,n;
        m=input.nextInt();
        n=input.nextInt();
        for(int i=m;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(""+sum);
    }
}