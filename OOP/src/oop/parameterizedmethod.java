package oop;
public class parameterizedmethod{
    String name, gender;
    int phone;
    void setinfo(String n,String m, int i)
    {
        name = n;
        gender = m;
        phone = i;
    }
void print2(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
}
    
}
