public class Test1 {
    public static void main(String[] args){
        try{
            int i=9/0;
            System.out.println(i);

        }catch(ArithmeticException e1){
            System.out.println("Fuck you"+e1);
        }catch(Exception e2){
            System.out.println("Fuck"+e2);
        }finally{
            System.out.println("The program finally must run");
        }
    }
    
}
