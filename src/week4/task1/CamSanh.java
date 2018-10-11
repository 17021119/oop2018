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