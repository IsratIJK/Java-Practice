class Outer{
    class Inner{
        int a;
        Inner(int a){
            this.a=a;

        }
        void printInner(){
            System.out.println(a);
        }

    }
    void printOuter(){
        Inner i=new Inner(6);
        i.printInner();
    }
}
class Main{
    public static void main(String[] args){
        Outer o=new Outer();
        o.printOuter();

    }
    
}