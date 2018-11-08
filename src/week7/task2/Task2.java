package week7.task2;

import week4.task1.HoaQua;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Task2 {
    //@throws NullPointerException ngoại lệ NullPointerException nếu xâu bằng null
    public boolean getNullPointerException(String s) throws NullPointerException{
        if(s==null) throw new NullPointerException();
        return true;
    }
    //@throws ArrayIndexOutOfBoundsException ngoại lệ sinh ra khi vị trí truyền vào nhở hơn 0 hoặc lớn hơn size của mảng
    public int getArrayIndexOutOfBoundsException(int a[],int i) throws ArrayIndexOutOfBoundsException{
        if(i<0 || i>a.length) throw new ArrayIndexOutOfBoundsException();
        return a[i];
    }
    //@throws ArithmeticException sinh ra khi số chia bằng 0
    public double getArithmeticException(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException();
        return (1.0*a)/b;
    }
    //@throws ClassCastException sinh ra khi ta ép kiểu của object của subclass theo object của superclass
    public void getClassCastException() throws ClassCastException{
        HoaQua hq=new HoaQua();
        throw new ClassCastException();
    }
    //@throws IOException sinh ra khi đường dẫn không hợp lệ hoặc file không tồn tại
    public static void File() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    }
    //@throws IOException sinh ra khi đường dẫn không hợp lệ hoặc file không tồn tại
    public void getFileNotFoundException(String path) throws FileNotFoundException {
        File file = new File(path);
        if(file.canRead()==false) throw new FileNotFoundException();
    }


    public static void main(String[] args) throws java.io.IOException {
        Task2 task2=new Task2();

        //lỗi NullPointerException
        String s=null;
        try{
            System.out.println(task2.getNullPointerException(s));
        }catch(NullPointerException e){
            System.out.println("Lỗi NullPointerException");
        }

        //lỗi ArrayIndexOutOfBoundsException
        int a[]={1,2,3,4,5};
        try{
            System.out.println(task2.getArrayIndexOutOfBoundsException(a,6));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("lỗi ArrayIndexOutOfBoundsException");
        }


        //lỗi ArithmeticException
        try{
            System.out.println(task2.getArithmeticException(1,0));
        }catch(ArithmeticException e){
            System.out.println("lỗi ArithmeticException");
        }

        //Lỗi ClassCastException
        try {
            task2.getClassCastException();
        }
        catch (ClassCastException e){
            System.out.println("Lỗi ClassCastException");
        }

        //lỗi IOException
        try {
            task2.File();

        } catch (IOException e) {
            System.out.println("lỗi IOException");
        }
        //lỗi FileNotFoundException
        try{
            task2.getFileNotFoundException("cavoixanh.txt"); // file không tồn tại
        }
        catch (FileNotFoundException e){
            System.out.println("lỗi FileNotFoundException");
        }
    }
}
