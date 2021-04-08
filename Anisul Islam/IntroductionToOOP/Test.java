package IntroductionToOOP;


public class Test{
    public static void main(String[] args){
        Teacher t1=new Teacher();
        t1.name="Iptu";
        t1.gender="Female";
        t1.phn=01;

        System.out.println("Name: "+t1.name);
        System.out.println("Name: "+t1.gender);
        System.out.println("Name: "+t1.phn);


        Teacher t2=new Teacher();
        t2.name="FBA";
        t2.gender="male";
        t2.phn=02;

        System.out.println("Name: "+t2.name);
        System.out.println("Name: "+t2.gender);
        System.out.println("Name: "+t2.phn);


    }
}