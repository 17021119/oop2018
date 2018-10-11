package week4.task1;

import java.util.Date;

public class HoaQua {
    private String ten;
    private int giaban;
    private String nguongoc;
    private String noisanxuat;


    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNoisanxuat() {
        return noisanxuat;
    }

    public void setNoisanxuat(String noisanxuat) {
        this.noisanxuat = noisanxuat;
    }
    public void HoaQua(String ten,int giaban,String nguongoc,String noisanxuat){
        this.ten=ten;
        this.giaban=giaban;
        this.nguongoc=nguongoc;
        this.noisanxuat=noisanxuat;
    }
    public void printHoaQua(){
        System.out.println("Tên loại quả: "+this.ten);
        System.out.println("Giá bán: "+this.giaban+" VNĐ/kg");
        System.out.println("Nguồn gốc: "+this.nguongoc);
        System.out.println("Nơi sản Xuất: "+this.noisanxuat);
    }
}
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
class Tao extends HoaQua{
    private int trongluongTB;
    private String loaitao;

    public int getTrongluongTB() {
        return trongluongTB;
    }

    public void setTrongluongTB(int trongluongTB) {
        this.trongluongTB = trongluongTB;
    }

    public String getLoaitao() {
        return loaitao;
    }

    public void setLoaitao(String loaitao) {
        this.loaitao = loaitao;
    }
    public void Tao(int trongluongTB,String loaitao){
        this.trongluongTB=trongluongTB;
        this.loaitao=loaitao;
    }
    public void printfTao(){
        System.out.println("Trọng lượng trung bình: "+this.trongluongTB+" gam/quả");
        System.out.println("Loại táo: "+this.loaitao);
    }
}
class CamThanhPhong extends Cam{
    private String vicam;

    public String getVicam() {
        return vicam;
    }

    public void setVicam(String vicam) {
        this.vicam = vicam;
    }
    public void CamThanhPhong(String vicam){
        this.vicam=vicam;
    }
    public void printfCamThanhPhong(){
        System.out.println("Cam "+this.vicam);
    }
}
class CamSanh extends CamThanhPhong{
    public static void main(String[] args) {
        CamSanh cs=new CamSanh();
        cs.CamThanhPhong("chua");
        cs.Cam("màu xanh lá cây đậm", 3);
        cs.HoaQua("Cam Sành",20000, "Thanh Phong, Thành phố Phủ Lý, Hà Nam", "Công ty Cam Sành Thanh Phong");
        cs.printHoaQua();
        cs.printfCam();
        cs.printfCamThanhPhong();
        System.out.println("===========================================================");
        Tao t=new Tao();
        t.Tao(300, "Táo ta");
        t.HoaQua("Táo",30000, "Duyên Hải, Hưng Hà, Thái Bình", "Công ty TNHH Kết Thành");
        t.printHoaQua();
        t.printfTao();

    }
}

