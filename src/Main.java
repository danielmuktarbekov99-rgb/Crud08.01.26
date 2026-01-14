//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Scanner scanner = new Scanner(System.in);

Student student = new Student();

Student student1= new Student(Long.parseLong(scanner.nextLine()),scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine()));

    Student student2= new Student(Long.parseLong(scanner.nextLine()),scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine()));

student.creatMethod(student1);
student.creatMethod(student2);


    System.out.println(Arrays.toString(student.getAllStudent()));
    System.out.println(student.getById(scanner.nextLong()));

    //student.deleteStudent(1);
    //System.out.println(Arrays.toString(student.getAllStudent()));
}
