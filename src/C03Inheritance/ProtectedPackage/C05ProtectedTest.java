package C03Inheritance.ProtectedPackage;

import C03Inheritance.C04ProtectedClass;

public class C05ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        C04ProtectedClass c1 = new C04ProtectedClass();
        System.out.println(c1.st1); // public
//        System.out.println(c1.st4); // protected
    }
}
