public class StaticDemo {

        public  static void main(String args[]){
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