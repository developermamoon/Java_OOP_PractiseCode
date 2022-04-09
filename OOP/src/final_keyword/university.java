package final_keyword;
public class university {
    final String versity = "BUBT";  //final variable
    final int fees; //blank final variable you have to use constructor to initialize it
    static final String location;  //static blank final variable you have to use  static block to initialize it
    
    university(){
        fees = 33000;
    }
    static{
        location = "Mirpur";
    }
}
