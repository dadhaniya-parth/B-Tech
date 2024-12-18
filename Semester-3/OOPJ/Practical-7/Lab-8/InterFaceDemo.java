// 2. Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant and one method. Class B implements A12.Instantiate B and invoke each of its methods. Each method displays one of the constants. [A]

interface A {
    int a = 10;
    void methA();
}

interface A1 extends A{
    int a1 = 20;
    void methA1();
}

interface A2 extends A{
    int a2 = 30;
    void methA2();
}

interface A12 extends A1,A2{
    int a12 = 40;
    void meth12();
}

class B implements A12{

    public void methA(){
        System.out.println(a);
    }

    public void methA1(){
        System.out.println(a1);
    }

    public void methA2(){
        System.out.println(a2);
    }

    public void meth12() {
        System.out.println(a12);
    }
}

public class InterFaceDemo {
    public static void main(String[] args) {
        B b = new B();
        b.methA();
        b.methA1();
        b.methA2();
        b.meth12();
    }
}
