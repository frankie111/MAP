package P2;

public class Student {
    private Integer studentId;
    private String course_code;
    private Integer semester;
    private Integer grade;
    private String status;

    public Student(Integer studentId, String course_code, Integer semester, Integer grade, String status) {
        this.studentId = studentId;
        this.course_code = course_code;
        this.semester = semester;
        this.grade = grade;
        this.status = status;
    }

    public static Student fromString(String str){
        String[] elems = str.split("_");
        return new Student(Integer.parseInt(elems[0]), elems[1], Integer.parseInt(elems[2]), Integer.parseInt(elems[3]), elems[4]);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
