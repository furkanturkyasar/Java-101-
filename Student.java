public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarege;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarege = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int note1, int note2, int note3, int sozlu1, int sozlu2, int sozlu3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }

        if (note2 >= 0 && note1 <= 100){
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if (sozlu1 >= 0 && sozlu1 <= 100){
            this.c1.additionalNote = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100){
            this.c2.additionalNote = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100){
            this.c3.additionalNote = sozlu3;
        }

    }

    void isPass(){
        this.avarege = ((this.c1.note * 0.80 + this.c1.additionalNote) + (this.c2.note * 0.90 + this.c2.additionalNote) + (this.c3.note * 0.85 + this.c3.additionalNote)) / 6.0;
        if (avarege > 55){
            System.out.println("=============");
            System.out.println("Sinifi Gectiniz!");
            this.isPass = true;
        }else {
            System.out.println("=============");
            System.out.println("Sinifi Gecemediniz!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " notu: "+this.c1.note+ " Sozlu notu: " + this.c1.additionalNote);
        System.out.println(this.c2.name + " notu: "+this.c2.note+" Sozlu notu: " + this.c2.additionalNote);
        System.out.println(this.c3.name + " notu: "+this.c3.note+" Sozlu notu: " + this.c3.additionalNote);
        System.out.println("Ortalamaniz: "+this.avarege);
    }







}
