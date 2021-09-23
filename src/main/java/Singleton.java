public class Singleton {
    private static Singleton instance;
     static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null) {
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
