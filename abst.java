public class abst {
    public void display(){
        System.out.println("This is an example for abstract class");
    }
}
class Main extends  abst{
    public static void main(String args[]){
        Main obj = new Main();
        obj.display();
    }
}
