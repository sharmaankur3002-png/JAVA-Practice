
// Design a Course class.
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any course.
// • Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
// • Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.
public class Course {

    String courseName;
    int enrolledStudents = 0;
    static int maxCapacity;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public static void main(String[] args) {


        Course.setMaxCapacity(2);
        
        Course bio = new Course("bio");
        Course maths = new Course("maths");
        Course hindi = new Course("hindi");
        

        bio.enrollStudent("Ankur");
        bio.enrollStudent("ram");
        maths.enrollStudent("neha");
        hindi.enrollStudent("priti");
        maths.enrollStudent("krish");
        maths.enrollStudent("Ankur");
        hindi.enrollStudent("ritu");
        bio.unenrollStudent("rahul");
        maths.unenrollStudent("rahul");
        hindi.unenrollStudent("rakesh");
        bio.unenrollStudent("rahul");

    }

    public void enrollStudent(String studentName) {

        if (enrolledStudents < maxCapacity) {

            System.out.println(studentName + " enrolled in the course successfully .");
            enrolledStudents++;
        } else {
            System.out.println("Sorry,Seats are full !");
        }

    }

    public void unenrollStudent(String studentName) {

        if (enrolledStudents > 0) {
            System.out.println(studentName + " Unenrolled from the course");
            enrolledStudents--;
        } else {
            System.out.println("You are not enroll in this course !");
        }

    }

    public static void setMaxCapacity(int Capacity) {
        maxCapacity = Capacity;
        
    }

}
