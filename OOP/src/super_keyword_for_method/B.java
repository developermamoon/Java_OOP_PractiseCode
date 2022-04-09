package super_keyword_for_method;
public class B extends A {
    int x = 5;
    
    @Override
    void display(){
        super.display();
        System.out.println("Inside Class B");
    }
    
}
