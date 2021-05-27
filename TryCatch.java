public class TryCatch {
    public static void main(String[] args){
        int s=0;
        for(int i=0;i<args.length;i++){
            try{
                s+=Integer.parseInt(args[i]);
            } catch(NumberFormatException e){
                System.out.println("Index: " + i + " is not integer. " + e);

            }
           
        }
        System.out.println("Sum: " +s);
    }
    
}
