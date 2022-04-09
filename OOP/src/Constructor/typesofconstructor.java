package Constructor;
public class typesofconstructor {
    
    String name;
    String gender;
    int age;
    
    typesofconstructor(){   //default or non parameterized
        System.out.println("Default Constructor");
    }
    typesofconstructor(String n, String g){   //parameterized constructor
        name=n;
        gender=g;
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
    }
    typesofconstructor(String n, String g, int age){   //parameterized constructor
        name=n;
        gender=g;
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
    
}
