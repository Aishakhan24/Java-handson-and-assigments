public class factorial {
    public static void main(String args[]){
        int i,fact=1;
        int number=6; // to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial of" +number+ "is:"+fact);
    }
}
