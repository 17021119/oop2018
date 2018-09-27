package week2.task3;



public class Task3 {
    public static void main(String[] args){
        Coder a=new Coder();
        a.prinCoder();
        System.out.println("=================");
        Cat b=new Cat(1,"red",true);
        b.prinCat();
        System.out.println("=================");
        CEO c=new CEO();
        c.prinCEO();
    }
}
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Coder{
    private String name;
    private String group;
    private int age;
    //TODO: khai báo phương thức setter và getter cho lập trình viên
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Coder(){
        // TODO: khởi tạo cho thuộc tính
        this.name="Vô Danh";
        this.group="UET K62 CF";
        this.age=0;
    }
    public Coder(String name,String group, int age){
        this.name=name;
        this.group=group;
        this.age=age;
    }
    public void prinCoder(){
        //TODO: In ra thông tin lập trình viên
        System.out.println("Tên: "+this.name+"\nNhóm: "+this.group+"\nTuổi: "+this.age);
    }

}
class Cat{
    private int age;
    private boolean fa;
    private String color;
    //TODO: khai báo phương thức getter và setter cho Cat
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFa() {
        return fa;
    }

    public void setFa(boolean fa) {
        this.fa = fa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(){
        //TODO: khởi tạo thông tin cho con mèo
        this.age=0;
        this.color="black";
        this.fa=false;
    }
    public Cat(int age,String color,boolean fa){
        this.age=age;
        this.color=color;
        this.fa=fa;
    }
    public void prinCat(){
        //TODO: In ra màn hình thông tin của mèo
        System.out.println("Con mèo này được: "+this.age
                +" tuổi\nMàu lông: "+this.color+"\nCon mèo này đã có người yêu: "+this.fa);
    }

}
class CEO{
    private String name;
    private String phone;
    private int wife;
    private String company;
    //TODO: khai báo phương thức getter và setter cho CEO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWife() {
        return wife;
    }

    public void setWife(int wife) {
        this.wife = wife;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public CEO(){
        //TODE: khởi tạo thông tin cho CEO
        this.name="Vô danh";
        this.phone="Đen trắng";
        this.wife=0;
        this.company="Tập đoàn Tia Chớp";
    }
    public CEO(String name,String phone ,int wife,String company){
        this.name=name;
        this.phone=phone;
        this.wife=wife;
        this.company=company;
    }
    public void prinCEO(){
        //TODO: In ra màn hình thông tin của CEO
        System.out.println("CEO: "+this.name+"\nĐiện thoại đang dùng: "+this.phone+
                "\nTổng số vợ:"+this.wife+"\nCông ty: "+this.company);
    }

}
