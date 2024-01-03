class A {
    public void opertion() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public void showResult() {
        System.out.println("Result Must be Unique");
    }
}

class B extends A {
    public void printName() {
        System.out.println("Anish Chauhan");
    }
}

public class Inhert {
    public static void main(String[] args) {
        B b1 = new B();
        b1.showResult();
        b1.printName();
    }
}
