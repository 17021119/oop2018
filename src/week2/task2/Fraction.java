package week2.task2;

public class Fraction {

    private int numerator;
    private int denomiator;

    int gcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
        this.denomiator=denominator;
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenomiator() {
        return denomiator;
    }
    public Fraction add(Fraction other) {
        int a=this.numerator*other.getDenomiator()+this.denomiator*other.getNumerator();
        int b=this.denomiator*other.getDenomiator();
        Fraction c=new Fraction(a,b);
        return c;
    }



    public Fraction subtract(Fraction other) {
        int a=this.numerator*other.getDenomiator()-this.denomiator*other.getNumerator();
        int b=this.denomiator*other.getDenomiator();
        Fraction c=new Fraction(a,b);
        return c;
    }

    public Fraction multiply(Fraction other) {
        int a=this.numerator*other.getNumerator();
        int b=this.denomiator*other.getDenomiator();
        Fraction c=new Fraction(a,b);
        return c;
    }

    public Fraction divide(Fraction other) {
        int a=this.numerator*other.getDenomiator();
        int b=this.denomiator*other.getNumerator();
        Fraction c=new Fraction(a,b);
        return c;
    }
    public void prin(){
        int a=gcd(this.numerator, this.denomiator);
        if(a!=0){
            if(this.denomiator/a==1){
                System.out.println(this.numerator/a);
            }
            else if(this.denomiator/a==-1){
                System.out.println((-this.numerator/a));
            }
            else if(this.denomiator/a==0){
                System.out.println("Phân số không xác định ^^");
            }
            else{
                if((this.numerator/a>0 && this.denomiator/a<0)|| (this.numerator/a<0 && this.denomiator/a<0)){
                    System.out.println((-this.numerator/a)+"/"+(-this.denomiator/a));
                }
                else {
                    System.out.println(this.numerator/a+"/"+this.denomiator/a);
                }
            }
        }
        else{
            System.out.println("Phân số không xác định ^^");
        }
    }
    public boolean equals(Object obj){
		Fraction Pso = new Fraction(0,0);
		Pso = this.subtract((Fraction)obj);
		if(Pso.numerator==0) return true;
		else return false;
	}
    /*public static void main(String[] args){
        Fraction a=new Fraction(2,3);
        Fraction b=new Fraction(4,1);
        Fraction c=new Fraction(-6,3);
//        c=a.add(b);
//        c=a.divide(b);
//        c=a.multiply(b);
//        c=a.subtract(b);
        c.prin();
        System.out.println(a.equals(b));
    }*/
}
