package MyJava.Class;
import  MyJava.Class.Box; 

public class BoxDem {
    
        public static void main(String[] args){
            Box mybox1=new Box();
            Box mybox2=new Box();
           
            double vol;
    
            mybox1.width=10; 
            mybox1.height=20;
            mybox1.depth=15;

            mybox2.width=1;
            mybox2.height=2;
            mybox2.depth=15;
    
    
            vol=mybox1.width*mybox1.height*mybox1.depth;
            System.out.println("Volume" +vol);

            vol=mybox2.width*mybox2.height*mybox2.depth;
            System.out.println("Volume" +vol);
            
        
    }
}


