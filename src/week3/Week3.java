package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        return m>n?m:n;
    }

    public static int minOfArray(int[] array) {
        int min=array[0];
        for(int i=1;i<array.length;i++)
            if (min > array[i]) {
                min = array[i];
            }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double BMI;
        BMI=weight/(height*height);
        if(BMI<18.5) return "Thiếu Cân";
        else if(BMI>=18.5 && BMI<23) return "Bình Thường";
        else if(BMI>=23 && BMI<25) return "Thừa Cân";
        else return "Béo Phì";
    }
//    public static void main(String [] args){
//        System.out.println(max(3,4));
//        int a[]={1,2,7,2,4};
//        System.out.println(minOfArray(a));
//        System.out.println(calculateBMI(50, 1.60));
//    }
}
