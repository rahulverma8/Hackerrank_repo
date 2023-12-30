import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int divsum= n>1?n+1:n;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) divsum += i;
        }
        return divsum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
             System.out.println(interfaceName);
        }
    }
}

