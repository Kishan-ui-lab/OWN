
class Parent {
    public void show() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    // This is HIDING, not overriding
    public void show() {
        System.out.println("Child's static method");
    }
}

