package oops.inheritance;

import javax.print.attribute.standard.MediaSize.Other;

public class Boxprice  extends Boxweight{
    double cost;

    Boxprice(){
        super();
        this.cost =-1;
    }

    Boxprice(Boxprice old){
        super(old);
        this.cost = old.cost;
    }

     public Boxprice(double side , double weight , double cost){
        super(side , weight);
        this.cost = cost;
     }

    public Boxprice(double l , double h , double w , double weight ,double cost){
       super(l,h,w,weight);
        this.cost = cost;
    }
    
}
