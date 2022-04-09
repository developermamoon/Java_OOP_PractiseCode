package exception;
public class exception {
    public static void main(String[] args) {
        try{
            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("Result = "+result);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
        finally{
            System.out.println("Out of the exception theory");
        }
    }
    
}
