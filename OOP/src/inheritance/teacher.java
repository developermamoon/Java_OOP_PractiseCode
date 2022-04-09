package inheritance;
public class teacher extends person {
    String qualification;
    
    void display2(){
        System.out.println("Teachers name: "+name);
        System.out.println("Teachers age: "+age);
        System.out.println("Teachers Qualification: "+qualification);
    }
    
}
