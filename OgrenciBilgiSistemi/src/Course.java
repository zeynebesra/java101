public class Course
{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

    //constructor
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
        this.sNote = 0.0;
    }

    //Metotlar
    void addTeacher(Teacher teacher)
    {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else
            System.out.println("Öğretmen/Ders uyuşmazlığı!");
    }

    void printTeacher()
    {
        this.teacher.print();
    }

}
