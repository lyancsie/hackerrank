package core_java;
import java.util.*;

class Student{
  private int id;
  private String fname;
  private double cgpa;
  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }
  public int getId() {
    return id;
  }
  public String getFname() {
    return fname;
  }
  public double getCgpa() {
    return cgpa;
  }
  static Comparator<Student> byCpga = Comparator.comparing(Student::getCgpa).reversed();
  static Comparator<Student> byName = Comparator.comparing(Student::getFname);
  static Comparator<Student> byId = Comparator.comparing(Student::getId);
}

//Complete the code
public class ComparatorSortImpl{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    List<Student> studentList = new ArrayList<Student>();
    while(testCases>0){
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);

      testCases--;
    }

    studentList.sort(Student.byCpga.thenComparing(Student.byName).thenComparing(Student.byId));

    for (int i = 0; i < studentList.size(); i++) {
      System.out.println(studentList.get(i).getFname());
    }
  }
}



