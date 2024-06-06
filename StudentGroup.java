import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;//его будем перебирать через встроенный итератор

    public StudentGroup(List<Student> studentList){//конструктор для готового списка
        this.studentList = studentList;
    }
    public StudentGroup(){
        this.studentList = new ArrayList<>();//конструктор для путого списка,будет делаться новый список
    }

    //метод по добавлению студента
    public void addStudent(Student student){//метод добавления новых студентов
        studentList.add(student);
    }
    //метод который возвращает весь список наших студентов
    public List<Student> getStudentList(){
        return studentList;
    }
    public Iterator<Student> iterator(){
        return new StudentGroupIterator(this);  //возвращаем то как мы можем перебирать студентгруп, внутри указали студентгруп
    }
}
