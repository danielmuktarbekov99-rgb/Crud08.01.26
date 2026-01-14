import java.util.Objects;

public class Student {
    private Long id;
    private String lastname;
    private String firstName;
    private int age;

    public Student() {
    }

    public Student(Long id, String lastname, String firstName, int age) {
        this.id = id;
        this.lastname = lastname;
        this.firstName = firstName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // CRUD
    Student[] students = new Student[2];

    int count = 0;


    public void creatMethod(Student student){
        students[count++]=student;

    }

public Student[] getAllStudent(){
        return students;
}
public Student getById(Long id){
        for (Student student:students){
            if (student.getId()==id){
                return student;
            }else {
                System.out.println("Мындай айди жок "+id);
            }
        }
        return null;

}
public void updateStudent(Long id,Student newStudent){
Student oldStudent=getById(id);
oldStudent.setLastname(newStudent.getLastname());
oldStudent.setFirstName(newStudent.getFirstName());
oldStudent.setAge(newStudent.getAge());
}

public void deleteStudent(long id){
        int deletedIndex = -1;

    for (int i = 0; i < students.length; i++) {
        if (students[i].getId()==id){
            deletedIndex=i;
        }

    }
    Student[] newStudent = new Student[students.length-1];
    for (int i = 0; i < deletedIndex; i++) {
        newStudent[i]=students[i];

    }
    for (int i = deletedIndex; i < newStudent.length ; i++) {
        newStudent[i]=students[i+1];

    }
    students=newStudent;



}


















    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + lastname+ '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
