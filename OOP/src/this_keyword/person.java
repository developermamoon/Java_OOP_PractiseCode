package this_keyword;
public class person {
    String name;
    String gender;
    int age;
    person(String name, String gender){
        this.name=name;
        this.gender=gender;
    }
    person(String name, String gender,int age){
        this(name,gender); //calling instance or previous constructor using this keyword
        this.age= age;
    }
    
    void method(){
        System.out.println("Inside method");
    }

    void display(){
        this.method(); //calling method using this keyword
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
    
}
