package Static_variable;
public class staticvariable {
    String name;
    int id;
    static String versity= "BUBT";
    
    staticvariable(String n, int i){
        name=n;
        id=i;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("University: "+versity);
    }
}
