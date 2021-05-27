import java.io.*;
public class Console {
    public static void main(String[] args){
        String s;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
    
    try{
        System.out.println("Write: ");
        s=in.readLine();
        System.out.println("Read: "+s);
        in.close();
    } catch(IOException e){
        e.printStackTrace();
    }
}
}
    

