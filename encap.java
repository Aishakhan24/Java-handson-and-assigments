class area{
    int length;
    int breadth;
    area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void getarea(){
        int area=length*breadth;
        System.out.println("area:"+area);
    }
}
class Main3{
    public static void main(String args[]){
        area rectangle = new area(5,6);
        rectangle.getarea();
    }
}

