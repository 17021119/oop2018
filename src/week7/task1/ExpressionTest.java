package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression num1 = new Numeral(10);
        Expression num2 = new Numeral(1);
        Expression num3 = new Numeral(2);
        Expression num4 = new Numeral(3);

        Expression s1=new Square(num1);
        Expression s2=new Multiplication(num3,num4);
        Expression s3=new Subtraction(s1,num2);
        Expression s4=new Addition(s3,s2);
        System.out.println("(10^2 - 1 + 2*3)^2 ="+new Square(s4).evaluate());

        Expression num5 =new Numeral(0);
        try {
            System.out.println(num1.evaluate()+ "/"+num5.evaluate()+"="+new Division(num1,num5).evaluate());
        }catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }

        try {
            System.out.println(num1.evaluate()+ "/"+num3.evaluate()+"="+new Division(num1,num3).evaluate());
        }catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
