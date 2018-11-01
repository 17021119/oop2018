package week7.task1;

public class Numeral extends Expression{
    int value;
    public Numeral(int value){
        this.value=value;
    }
    public Numeral(){
        this.value=0;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Numeral: value: "+value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
