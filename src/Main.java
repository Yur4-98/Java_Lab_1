import java.util.*;
import java.util.List;
public class Main {
    //Проверка студентов по среднему баллу
    public static void session(List<Student> students){
        int len = students.size();
        for (int i = 0; i < len; i++) {
            if (Arrays.stream(students.get(i).getMarks()).average().getAsDouble() > 3.0){
                students.get(i).setCourse(students.get(i).getCourse()+1);
            }else {
                students.remove(i);
                i--;
                len--;
            }
        }
    }
    //Вывод имён студентов определённого курса
    public static  void printStudents(List<Student> students, int course){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course){
                System.out.println(students.get(i).getName());
            }
        }
    }

    public static void main(String[] args) {
    //Коллекция
        List<Student> students = new ArrayList<Student>(){
//            public void session(){
//                for (int i = 0; i < this.size(); i++) {
//                    if (Arrays.stream(this.get(i).getMarks()).average().getAsDouble() > 3.0){
//                        this.get(i).setCourse(this.get(i).getCourse()+1);
//                    }else {
//                        this.remove(i);
//                    }
//                }
//            }
        };


        Student st1 = new Student("a1","g1",1,new int[]{1,2,3});
        Student st2 = new Student("a2","g1",1,new int[]{5,5,4});
        Student st3 = new Student("a3","g2",2,new int[]{4,3,5});
        Student st4 = new Student("a4","g3",3,new int[]{3,5,5});
        Student st5 = new Student("a5","g2",2,new int[]{1,4,1});
        students.add(0,st1);
        students.add(1,st2);
        students.add(2,st3);
        students.add(3,st4);
        students.add(4,st5);


        session(students);
        printStudents(students,2);

        //System.out.println(students.get(0).getCourse());
    }
}