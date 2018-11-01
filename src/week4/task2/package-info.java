//package week4.task2;
//public class Shape {
//    private String color;
//    private boolean filled;
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//    public Shape(){
//        // khởi tạo thông tin mặc định cho Shape
//        this.color="red";
//        this.filled=true;
//    }
//    public Shape(String color,boolean filled){
//        this.color=color;
//        this.filled=filled;
//    }
//    public String toString(){
//        // biểu diễn đối tượng Shape dưới dạng chuỗi
//        return this.getColor()+" "+this.filled;
//    }
//}
//class Circle extends Shape{
//    final double PI=3.14;
//    private double radius;
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    Circle(){
//        this.radius=1.0;
//    }
//    Circle(double radius){
//        this.radius=radius;
//    }
//    Circle(double radius,String color,boolean filled){
//        this.radius=radius;
//        this.setColor(color);
//        this.setFilled(filled);
//    }
//    public double getArea(){
//        //Diện tích hình tròn
//        return this.radius*this.radius*PI;
//    }
//    public double getPerimeter(){
//        //chu vi hình tròn
//        return 2*PI*this.radius;
//    }
//    public String toString(){
//        return this.radius+" "+this.getArea()+" "+this.getPerimeter()+" "+this.getColor()+" "+this.isFilled();
//    }
//
//}
//class Rectangle extends Shape{
//    private double width;
//    private double length;
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    Rectangle() {
//        this.length=1.0;
//        this.width=1.0;
//    }
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public Rectangle(double width, double length, String color, boolean filled) {
//        //kế thừa từ lớp cha Shape
//        super(color, filled);
//        this.width = width;
//        this.length = length;
//    }
//    public double getArea(){
//        return this.length*this.width;
//    }
//    public double getPerimeter(){
//        return 2*(this.length+this.width);
//    }
//    public String toString(){
//        return this.width+" "+this.length+" "+this.getArea()+" "+this.getPerimeter()+
//                " "+this.getColor()+" "+this.isFilled();
//    }
//}
//class Square extends Rectangle{
//    private double side;
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//    public Square() {
//        this.side=this.getLength();
//    }
//
//    public Square(double side) {
//        this.side = side;
//    }
//
////    Square(double side,String color,boolean filled){
////        this.setColor(color);
////        this.setFilled(filled);
////        this.side=side;
////    }
////    public void setWidth(double side){
////        this.setWidth(side);
////    }
////    public void setLength(double side){
////        this.setLength(side);
////    }
//
//    public Square(double side,String color, boolean filled){
//        super(side, side, color, filled);
//        this.side = side;
//    }
//
//    public String toString() {
//        return this.side+" "+this.getArea()+" "+this.getPerimeter()+" "+this.getColor()
//                +" "+this.isFilled();
//    }
//    public static void main(String[] args) {
//        System.out.println("Hình tròn");
//        Circle c=new Circle(3.8, "blue", true);
//        System.out.println(c.toString());
//        System.out.println("Hình Vuông");
//        Square s=new Square(1.2);
//        s=new Square(1.2, "red", false);
//        System.out.println(s.toString());
//
//    }
//}
