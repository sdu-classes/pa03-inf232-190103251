import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
//            int num1 = Integer.parseInt(in.next()); Example for NumberFormatException
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num3 = in.nextInt();
            int num4 = in.nextInt();
            Calculator obj1 = new Calculator(num1,num2);
            Calculator obj2 = new Calculator(num1,num2);
            Calculator obj3 = new Calculator(num3,num4);
            Calculator obj4 = new Calculator(num3,num4);

            if(num1>0 && num2>0){
                System.out.println("Add: "+obj1.Add());
            }
            else throw new ArithmeticException("Numbers can not be negative. Please, enter only positive integers!!!");

            if(num1>0 && num2>0){
                System.out.println("Substract: "+obj2.Subtract());
            }
            else throw new ArithmeticException("Numbers can not be negative. Please, enter only positive integers!!!");

            if(num3!=0 && num4!=0){
                System.out.println("Multiplication: "+obj3.Multiplication());
            }
            else throw new ArithmeticException("Numbers can not be zero. Please, enter only positive integers!!!");


            if(num3!=0 && num4!=0){
                System.out.println("Division: "+obj4.Division());
            }
            else throw new ArithmeticException("Numbers can not be zero. Please, enter only positive integers!!!");
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatExveption: Please, enter only integer numbers!!!");
        }
    }
}