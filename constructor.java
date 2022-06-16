public class constructor {
    constructor(int a){
        System.out.println("constructor with parameter");
    }
    constructor(){
        System.out.println("without parameter");
    }
    constructor(int a, String name){
        System.out.println("different in parameter");
    }
    constructor(String name,int a){
        System.out.println("constructor is differ in the order of the parameter");
    }
    public static void main(String args[]){
        constructor obj=new constructor(9);
        constructor obj2=new constructor();
        constructor obj3=new constructor("java",10);
        constructor obj4=new constructor(10,"program");
    }
}
