package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String n) {
        this.id = n;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String n) {
        this.group = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String n) {
        this.email = n;
    }
    /**
     * Constructor 1
     */

    Student() {
        // TODO:
        this.name="Studen";
        this.id="000";
        this.group="INT22041";
        this.email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name=n;
        this.id=sid;
        this.email=em;
        this.group="INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name=s.getName();
        this.id=s.getId();
        this.group=s.getGroup();
        this.email=s.getEmail();
    }

    String getInfo() {
        // TODO:
        System.out.println("Ten      :"+this.getName());
        System.out.println("Ma so SV :"+this.getId());
        System.out.println("Lop      :"+this.getGroup());
        System.out.println("Email    :"+this.getEmail());
    }
}
