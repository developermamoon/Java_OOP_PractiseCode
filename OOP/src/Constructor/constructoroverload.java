package Constructor;
public class constructoroverload {
    String name;
    String gender;
    int age;
    constructoroverload(String n, String g){   //parameterized constructor
        name=n;
        gender=g;
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
    }
    constructoroverload(String n, String g, int age){   //parameterized constructor
        name=n;
        gender=g;
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}
