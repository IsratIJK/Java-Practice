import java.io.Bufferedwriter;
import java.io.FileWriter;
import java.io.IOException;

public class Text1 {
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("C.txt");
            BufferedWriter w=new BufferedWriter(fw);
            Student s=new Student("Nahid",55);
            writer.write(s.name+" "+s.id);
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

class Student{
    String name;
    int id;

    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }
}
