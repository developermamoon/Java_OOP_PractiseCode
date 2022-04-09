package Constructor;

class Card{
String cardName;
double discount;
}
class Silver_Card extends Card{

    public Silver_Card() {
        cardName="silver";
        discount=10;
    }
}

class Gold_Card extends Card{

    public Gold_Card() {
        cardName="gold";
        discount=20;
    }
}

class Platinum_Card extends Card{

    public Platinum_Card() {
        cardName="platinum";
        discount=30;
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
    
    
   Card getcardbyname(String name){
if (name.equals("Silver_Card")){
    return new silverCard();
}
else if (name.equals("Gold_Card")){
    return new goldCard();
}
if (name.equals("Platinum_Card")){
    return new platinumCard();
}
return null;
}
}



public class cardshop {

 
    public static void main(String[] args) {
 
        BataShopFactory bf1=BataShopFactory.getsingleinstance();
        Card c1=bf1.getcardbyname("platinum Card");
        
        System.out.println(c1.cardName+"card discount "+c1.discount);
        
        Card c2=bf1.getcardbyname("silver Card");
        
        System.out.println(c2.cardName+"card discount "+c2.discount);
      
    }
    
}
