package week7.task1;

public class Subtraction extends BinaryExpression {
    Expression left,right;

    public Subtraction(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }
    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return "Subtraction: left: "+this.left+ " right "+this.right;
    }

    @Override
    public int evaluate() {
        int i = left.evaluate() - right.evaluate();
        return i;
    }
}
