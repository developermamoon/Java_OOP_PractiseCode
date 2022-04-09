package oop;
public class OOP {
    public static void main(String[] args) {
        
        
        //non parameterized method
            nonparameterizedmethod person2= new nonparameterizedmethod();

            person2.name= "Md. Abdullah Al-Mamoon";
            person2.gender= "Male";
            person2.phone= 1622571650;
            person2.print();    //calling non parameterized method
            System.out.println("\n");
        
        //parameterized method
            parameterizedmethod person3= new parameterizedmethod();
            person3.setinfo("Mamoon","Male", 1622571650);   //caling parameterized method
            person3.print2();   //caling print method
            System.out.println("\n");

    }
    
}
