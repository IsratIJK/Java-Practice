package MyJava.Src;
import MyJava.Src.Box;

class Box2{
    public static void main(String[] args){
        Box b1=new Box();
        Box b2=new Box();

        b1.width=10;
        b1.height=20;

        b2.width=30;
        b2.height=20;

        b1.area();
        b2.area();

    }
}
