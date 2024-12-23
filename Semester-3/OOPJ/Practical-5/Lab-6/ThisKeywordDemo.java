public class ThisKeywordDemo {

    static int staticVar = 10;
    int instanceVar = 20;

    public void display() {
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + this.instanceVar);
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.display();
    }
}