package encapsulation;

public class employee {
    private String empname;
    private int empid;
    private String empdept;

    public String getempname(){
        return empname;
    }
    public void setempname(String name){
        this.empname=name;
    }
    public int getempid(){
        return empid;
    }
    public void setempid(int id){
        this.empid=id;
    }
    public String getempdept(){
        return empdept;
    }
    public void setempdept(String dept){
        this.empdept=dept;
    }
}
class encap2 {
    public static void main(String[]args){
        employee obj1=new employee();
        obj1.setempname("Aisha");
        obj1.setempid(24);
        obj1.setempdept("jr.executive");
        System.out.println(obj1.getempname());
        System.out.println(obj1.getempid());
        System.out.println(obj1.getempdept());
    }
}
