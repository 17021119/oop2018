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