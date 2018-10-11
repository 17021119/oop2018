
import week4.task1.HoaQua;

class Cam extends HoaQua{
    private String color;
    private int soluong;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public void Cam(String color,int soluong){
        this.color=color;
        this.soluong=soluong;
    }
    public void printfCam(){
        System.out.println("Trung bình khoảng: "+this.soluong+" quả/kg");
        System.out.println("Màu vỏ: "+this.color);
    }
}