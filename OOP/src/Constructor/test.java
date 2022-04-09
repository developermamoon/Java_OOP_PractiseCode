package Constructor;
public class test {
    public static void main(String[] args) {
        //calling default constructor
            typesofconstructor ob1 = new typesofconstructor();
            System.out.println("");
        //calling parameterized constructor
            typesofconstructor ob2 = new typesofconstructor("Mamoon","Male");
            System.out.println("");
        //calling parameterized constructor
            typesofconstructor ob3 = new typesofconstructor("Mamoon","Male", 23);
            
        //constructor overload
            constructoroverload ob4 = new constructoroverload("Mamoon","Male");
            System.out.println("");
        
        //constructor overload
            constructoroverload ob5 = new constructoroverload("Mamoon","Male",24);
            System.out.println("");
    }
    
}
