package polymorphism;
public class test {
    public static void main(String[] args) {
        person p =new person();
        p.display();
        
        p = new teacher();  //dynamic method dispatch
        p.display();
        
        p = new student();  //dynamic method dispatch
        p.display();
    }
    
}
