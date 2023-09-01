package Class;

public class Teacher extends User {
    private String Tid;
    private String Dept;
    private String Office;
    Courses[] courses = new Courses[4];

    public Teacher() {
    }

    public Teacher(String tid, String dept, String office) {
        Tid = tid;
        Dept = dept;
        Office = office;
    }

    public Teacher(String name, String password, String tid, String dept, String office) {
        super(name, password);
        Tid = tid;
        Dept = dept;
        Office = office;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public void addCourse(Courses course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                break;
            }
        }
    }

    public void show() {
        super.show();
        System.out.println("Dept: " + Dept + "\n" + "Office: " + Office);
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                courses[i].show();
            }
        }
    }

}
