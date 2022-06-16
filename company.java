public class company {
    String name;
    public company(){
        name="Program";
    }
}

class main{
    public static void main(String[]args){
        company obj=new company();
        System.out.println("company name=" +obj.name);
    }
}
