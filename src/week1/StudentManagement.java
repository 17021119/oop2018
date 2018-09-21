package week1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    ArrayList<Student> students=new ArrayList<Student>(100);

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {

    }

    void removeStudent(String id) {
        // TODO:
        for(int i=0;i<students.size();i++)
        {
            if( students.get(i).getId().equals(id)) students.remove(i);
        }
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement uetk62 = new StudentManagement();
        uetk62.students[0]=new Student();
        uetk62.students[1]=new Student("Nguyen Xuan Tu","17021119","ituet1119@gmail.com");
        uetk62.students[2]=new Student(s2);
        uetk62.students[3]=new Student();
        uetk62.students[4]=new Student();

        uetk62.students.add(s1);
        uetk62.students.add(s2);
        uetk62.students.add(s3);
        uetk62.students.add(s4);
        uetk62.students.add(s5);
    }
}
