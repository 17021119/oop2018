package week7.task1;
public class Addition extends BinaryExpression{

    Expression left,right;
    public Addition(Expression left ,Expression right){
        this.left=left;
        this.right=right;
    }
    @Override
    public String toString() {
        return "Addition: left " +left+" right "+right;
    }

    @Override
    public int evaluate() {
        return left.evaluate()+right.evaluate();
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return  right;
    }
}
