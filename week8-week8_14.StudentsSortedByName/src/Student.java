public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student student) {
        String studentName = student.getName();
        if(this.name.compareToIgnoreCase(studentName) == studentName.compareToIgnoreCase(this.name)) {
            return 0;
        } else if (this.name.compareToIgnoreCase(studentName) > studentName.compareToIgnoreCase(this.name)) {
            return 1;
        } else {
            return -1;
        }
    }    

}
