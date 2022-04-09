package methodoverride;
public class teacher extends person {
    String qualification;
    
    @Override
    void display(){ //method override
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qaulification: "+qualification);
    }
    
}
