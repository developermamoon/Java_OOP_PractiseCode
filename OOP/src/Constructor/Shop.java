package Constructor;

class card{
String cardName;
double discount;
}
class silver_Card extends card{

    public silver_Card() {
        cardName="silver";
        discount=0.1;
    }
}

class gold_Card extends card{

    public gold_Card() {
        cardName="gold";
        discount=0.2;
    }
}

class platinumCard extends card{

    public platinumCard() {
        cardName="platinum";
        discount=0.3;
    }
}
class BataShopFactory{
public static BataShopFactory singleinstance;
    private BataShopFactory(){}
    
    public static BataShopFactory getsingleinstance(){
    
if(singleinstance==null){
 singleinstance= new BataShopFactory();
}
return singleinstance;
}
    
    
   card getcardbyname(String name){
if (name.equals("silverCard")){
    return new silver_Card();
}
else if (name.equals("goldCard")){
    return new gold_Card();
}
if (name.equals("platinumCard")){
    return new platinumCard();
}
return null;
}
}



public class Shop {

 
    public static void main(String[] args) {
 
        BataShopFactory bf1=BataShopFactory.getsingleinstance();
        card c1=bf1.getcardbyname("platinum Card");
        
        System.out.println(c1.cardName+"card discount "+c1.discount);
        
        card c2=bf1.getcardbyname("silver Card");
        
        System.out.println(c2.cardName+"card discount "+c2.discount);
      
    }
    
}
