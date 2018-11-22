package week11;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public <T extends Comparable> T max(ArrayList<T> input){
        T m=input.get(0);
        for(int i=1;i<input.size();i++){
            if(m.compareTo(input.get(i))<0){
                m=input.get(i);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intArray=new ArrayList<>();
        ArrayList<String> stringArray=new ArrayList<>();
        for(int i=0;i<10;i++){
            Random rd=new Random();
            intArray.add(rd.nextInt(1000));
        }
        for(int i=0;i<10;i++){
            System.out.print(intArray.get(i)+" ");
        }
        Task2 t2=new Task2();
        System.out.println("max: "+t2.max(intArray));
        stringArray.add("nguyen");
        stringArray.add("xuan");
        stringArray.add("tu");
        stringArray.add("oop");
        stringArray.add("zre");
        System.out.println(t2.max(stringArray));
    }
}