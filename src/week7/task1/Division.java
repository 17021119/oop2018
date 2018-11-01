package week7.task1;

public class Division extends BinaryExpression{

    Expression left,right;
    Division(Expression left,Expression right){
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
        return "Division: left: "+this.left +" right: "+this.right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }

}
