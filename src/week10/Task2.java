package week10;

import java.util.Random;

public class Task2{
    public void sort(int a[],int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=i;j<n;j++) {
                if(a[i]>a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String [] args){
        int a[]=new int[1000];
        Random rd = new Random();   // khai báo 1 đối tượng Random
        for(int i=0;i<1000;i++){
            a[i]= rd.nextInt(1000);  // trả về 1 số nguyên bất kỳ trong đoạn [0...1000]
        }
        Task2 t2=new Task2();
        t2.sort(a,1000);
        for(int i=0;i<1000;i++){
            System.out.print(a[i]+" ");
        }
    }
}
