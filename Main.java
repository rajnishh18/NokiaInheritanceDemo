class Nokia1{
    int x, y;
    void f1(){
        System.out.println("Parent Function 1 Execute.");
    }
    void f2(){
        System.out.println("Parent Function 2 Execute.");
    }

}
class Nokia2 extends Nokia1{
    int z ;
    void f3(){
        System.out.println("Child Function 1 Execute.");
    }
}
public class main{
    public static void main(String args[]){
        Nokia2  n2 = new Nokia2();
        n2.f1();
        n2.f2();
        n2.f3();
    }
}

