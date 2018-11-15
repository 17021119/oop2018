package week9;
import java.io.*;
import java.util.Scanner;
public class Utils {
    public static String readContentFromFile(String path){
        File file =new File (path);
        String str="";
        try(Scanner sc=new Scanner(file)){
            String a;
            while(sc.hasNext()){
                str+=sc.nextLine()+"\n";
            }
        } catch (Exception e) {
        }
        return str;
    }
    public static void writeContentToFile(String path){
        File file =new File (path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(PrintWriter pw =new PrintWriter(file)) {
            pw.println("Ghi đè");
        } catch (Exception e) {
        }
    }
    public static void writeContentToFile1(String path){
        File file =new File (path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(FileWriter fw=new FileWriter(file,true);
            BufferedWriter bf=new BufferedWriter(fw);
            PrintWriter pw =new PrintWriter(bf)) {
            pw.println("Ghi vào cuối file");
        } catch (Exception e) {
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath + "/" + fileName);
        if(file.exists()){
            return file;
        }
        return null;
    }
    public static void main(String[] args) {
        File p=findFileByName("C:\\Users\\Tu Nguyen\\IdeaProjects\\oop2018","test.txt");
        System.out.println(p);
        writeContentToFile("C:\\Users\\Tu Nguyen\\IdeaProjects\\oop2018\\test.txt");
        //writeContentToFile1("test.txt");
        String a=readContentFromFile("test.txt");
        System.out.println(a);
    }
}