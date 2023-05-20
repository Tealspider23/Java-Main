package oops.inheritance;

public class Boxweight extends Box {
    double weight;

    public Boxweight(){
        this.weight=-1;
    }
    Boxweight(Boxweight other ){
        super(other);
        weight = other.weight;
    }

    public Boxweight(double side , double weight){
        super(side);
        this.weight = weight ;
    }

    public Boxweight(double l , double h , double w , double weight){
        super(l,h,w); // call the parent constructor 
        // used to initiate values present in parent class 

        this.weight = weight;
    }


    

    
}
