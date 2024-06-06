import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{ //здесь реализуем интерфейс итератор
     private List<Student> studentList;

     private int count=0;

     public StudentGroupIterator(StudentGroup studentGroup){
        this.studentList = studentGroup.getStudentList();
    }
    @Override
    public boolean hasNext() {//говорит есть ли следующий элемент
        
        return count < studentList.size();//если меньше то вернется true, если больше то вернется false
    }
    @Override
    public Student next() {//возвращает след. элемент и увеличивает индекс++
        if (!hasNext()) {//ЕСЛИ has next вернул false
            return null;//то вернем null
        }
        return studentList.get(count++); //сперва вернет count, потом увеличит индекс на 1
    }
    @Override//здесь удаляется текущий наш элемент
    public void remove() {
        
        studentList.remove(count);
    }
}
