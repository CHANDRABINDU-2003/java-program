
package inheritance;

class ParentClass {
    public void printMessage() {
        System.out.println("My name is UDITA");
    }
}

class ChildClass extends ParentClass {
    public void printMessage() {
        System.out.println("i am in class EIGHT");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ParentClass parentObject = new ParentClass();
        ChildClass childObject = new ChildClass();
        parentObject.printMessage(); 
        childObject.printMessage();  
        ParentClass childAsParent = childObject;
        childAsParent.printMessage(); 

    }
    
}
