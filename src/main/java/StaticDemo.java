public class StaticDemo {

        public  static void main(String args[]){
            System.out.println(Math.floor(2.9999999));
            System.out.println(Math.ceil(2.005));
            short s = 9;
//            System.out.println(add(s,6));
            Outer o=new Outer();
            new Outer.Inner().innerMethod();
    }
}

class Outer {
     static class Inner{
         public Inner() {
             System.out.println("Constructor");
         }

         void innerMethod(){
            System.out.println("innermethod");
        }

    }
}