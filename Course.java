public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double additionalNote;
    double note;

    Course(String name, String code, String prefix, double additionalNote){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.additionalNote = additionalNote;
        int note = 0;
    }

    void printTeacher(){
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;


        }else {
            System.out.print("Ogretmen ve ders bolumleri uyusmuyor!");
        }

    }



}
