public class Student implements Comparable<Student>{
    private int studentId;
    private String name;

    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    @Override
    public String toString() {
        return "Student{" +  
        "studentId=" + studentId +
        ", name='" + name + '\'' +
        '}';
    }
    @Override
    public int compareTo(Student o) {
        if (studentId > o.getStudentId()) {
            return 1;
        }
        else if (studentId < o.getStudentId()) {
            return -1;
        }
        return 0;
    }
}
