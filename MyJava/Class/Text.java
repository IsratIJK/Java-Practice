import java.io.IOException;
import java.io.PrintWriter;
 class Text {
     public static void main(String[] args){
         try{
             PrintWriter out=new PrintWriter("B.txt");

             Text1 s1=new Text1("Arif",01);
             Text1 s2=new Text1("FBA",02);

             out.println(s1.name+" "+s1.id);
              out.println(s2.name+" "+s2.id);


             out.close();
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }

    

}
class Text1{
     String name;
     int id;

     public Text1(String name,int id){
         this.name = name;
         this.id = id;
     }
}
