package week10;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class Task1 {
    public List<String> getAllFunctions(String path){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = new String();
            String line = new String();
            while((s = br.readLine()) != null){
                if(s.contains("static")){ // trả về true nếu trong s có "static"
                    String addition = new String();
                    addition += (s + "\n");
                    while((line = br.readLine())!= null &&  !line.equals("")){
                        addition += (line + "\n");
                    }
                    list.add(addition);
                }
            }
        }
        catch (IOException e){
            System.out.println("Exception: " + e);
        }
        return list;
    }

    public String findFunctionByName(String name){
        boolean check = false;
        try {
            Class cls = Class.forName("week9.Utils"); //trả về đối tượng Class được liên kết với lớp hoặc giao diện với tên chuỗi đã cho
            Method m[] = cls.getDeclaredMethods(); //trả về một mảng các phương thức
            for(int i = 0; i < m.length; i++) {
                if(name.contains(m[i].getName())){ // true <=> m[i].getName có trong String name
                    check = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        if(check) return "Method: " + name + " có trong class Utils!";
        else return "Method: " + name + " không có trong class Utils!";
    }

    public static void main (String[] args){
        Task1 w10 = new Task1();
        List<String> list = w10.getAllFunctions("C:\\Users\\Tu Nguyen\\IdeaProjects\\oop2018\\src\\week9\\Utils.java");
        System.out.println(list);
        System.out.println(w10.findFunctionByName("findFileByName(String,String)"));
    }
}
