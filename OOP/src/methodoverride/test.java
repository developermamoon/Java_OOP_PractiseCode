package methodoverride;
public class test {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name = "Ariful Malik";
        t1.age=27;
        t1.qualification= "Assistant Professor";
        t1.display();
        System.out.println("");
        
        person p1 = new person();
        p1.name = "Anisul Islam";
        p1.age=20;
        p1. display();
    }
    
}
