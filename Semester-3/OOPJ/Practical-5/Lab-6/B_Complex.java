// 5. Define class for Complex number with real and imaginary as data members. Create its constructor, overload the constructors. Also define addition method to add two complex objects. [B]


class Complex {
    float real,imaginary;

    Complex(){
        real=0;
        imaginary=0;
    }

    Complex(float real,float imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    void addition(Complex c){
        this.real += c.real;
        this.imaginary += c.imaginary;
        System.out.println("Real:"+this.real+" Imaginary:"+this.imaginary);
    }
}

public class B_Complex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(110,111);
        Complex c3 = new Complex(112,113);
        c2.addition(c3);
    }
}

