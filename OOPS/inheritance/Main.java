package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        //Box box1 = new Box(4);
        //Box box2 = new Box(box1);

      //  System.out.println(box2.l + " "+ box2.h + " "+ box2.w);


      Boxweight box3=new Boxweight();
      System.out.println(box3.h + " "+box3.weight);

      Box box5 = new Boxweight(2, 3, 4, 8);
      System.out.println(box5.l);

      // Boxweight box6 = new Box(2 ,3 ,4 );
      // This gives out an error 
      // There are many variables in parent and child class
      //you are given access to ref variables i.e Boxweight
      //hence, you should have access to weight variable 
      //this also means ,that the ones you are trying to access should be initialised
      // but here the obj itself is in form of parent class
      // hence error .

      
    }
}
