class twowheeler {
    void latest() {
        System.out.println("Latest models"); }
}

class bike extends twowheeler{
    void ride() { System.out.println("exclusive bikes");}
}
class honda extends bike{
    void milage(){System.out.println("Honda speed bikes");}
}
    public class inherit {
    public static void main(String[]args){
        honda bike1=new honda();
        bike1.milage();
        bike1.ride();
        bike1.latest();
    }
    }

