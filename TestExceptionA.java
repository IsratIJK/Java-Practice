public class TestExceptionA{
    public static void main(String[] FBAkutta){
        int sum=0;
        for(int i=0;i<FBAkutta.length;i++){
            try{
            sum+=Integer.parseInt(FBAkutta[i]);
            }catch(NumberFormatException e){
        System.out.println("Index: "+i+"is not int "+e);
        }
    }
        System.out.println("Sum: "+sum);
    }
}