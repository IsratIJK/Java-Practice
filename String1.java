import java.io.*;
public class String1{
    public static void main(String[] args){
        File file=new File("Exam//Sir//Answer","Solution.txt");
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(isr);
            PrintWriter out=new PrintWriter(new FileWriter(file));
            System.out.println("Write: ");
            String str=in.readLine();
            out.println(str);
            in.close();
            out.close();
        } catch(IOException e){
            e.printStackTrace();
        
        }
    }
}