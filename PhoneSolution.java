class Phone{

    int phoneId,
    String os,
    String brand,
    int price

    public Phone(int phoneId,String os, String brand,int price){
        this.phoneId =phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price
    }

    public int getPhoneId(){
        return phoneId;
    }

    public String getOs(){
        return os;
    }

    public String getBrand(){
        return brand;
    }

    public int getPrice(){
        return price;
    }

}

public class 