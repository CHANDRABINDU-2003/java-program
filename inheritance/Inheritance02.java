package inheritance;
class ParentClass {
    public void printMessage() {
        System.out.println("Udita sarkar chandrabindu");
    }
}

class ChildClass extends ParentClass {
    public void printMessage() {
        System.out.println("class twelve");
    }
}
public class Inheritance02 {
        public static void main(String[] args) {
        ParentClass parentObject = new ParentClass();
        ChildClass childObject = new ChildClass();
        parentObject.printMessage();
        childObject.printMessage(); 
    }

    
}
