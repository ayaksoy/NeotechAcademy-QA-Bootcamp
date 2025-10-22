package Lesson18;

public class InstanceVariableDemo {
    public static void main(String[] args) {
        InstanceVariables iv = new InstanceVariables();
        System.out.println(iv.name);
        InstanceVariables iv2 = new InstanceVariables();
        System.out.println(iv2.name);
        iv2.name = "Alisan";
        System.out.println(iv.name); // Faizan System.out.println (iv2.name); // Alisan
        InstanceVariables iv3 = new InstanceVariables();
        System.out.println(iv3.name); // Faizan
        iv3.name = "Shekinah";
        System.out.println("--------------------");
        System.out.println(iv.name);   // Faizan
        System.out.println(iv2.name);  // Alisan
        System.out.println(iv3.name);  // shekinah
        System.out.println(InstanceVariables.istrue);

    }
}
