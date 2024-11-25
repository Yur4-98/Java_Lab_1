
public class Student {
    String name;
    String group;
    int course;
    int[] marks;

    void setName(String name){
        this.name = name;
    }
    void setGroup(String group){
        this.group = group;
    }
    void setCourse(int course){
        this.course = course;
    }
    void setMarks(int[] marks){
        this.marks = marks;
    }
    String getName(){
        return  name;
    }
    String getGroup(){
        return group;
    }
    int getCourse(){
        return course;
    }
    int[] getMarks(){
        return  marks;
    }

    Student(){
        name = "a";
        group = "g";
        course = 1;
        marks = new int[10];
    };
    Student(String name, String group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    };

}
