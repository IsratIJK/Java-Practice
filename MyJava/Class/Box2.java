class Iptu{
    double width;
    int height;
    double a;

    void area(){
        a=width*height;
        System.out.println("Area "+a);
    }
}

class Box2{
    public static void main(String[] args){
        Iptu b1=new Iptu();
        Iptu b2=new Iptu();

        b1.width=10;
        b1.height=20;

        b2.width=30;
        b2.height=20;

        b1.area();
        b2.area();

    }
}