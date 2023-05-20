package oops.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    //cube
    Box(double side){

        this.w=side;
        this.h=side;
        this.l=side;
    }

     //cube
     Box(double l ,double w , double h){
        this.w=w;
        this.h=h;
        this.l=l;

    }

    Box(Box old){
        this.h=old.h;
        this.h=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
    

}
