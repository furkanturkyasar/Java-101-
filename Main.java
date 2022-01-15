public class Main{

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","123","TRH");
        Teacher t2 = new Teacher("Graham Bell", "1234", "FZK");
        Teacher t3 = new Teacher("Kul yutmaz", "12345", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH", 0.20);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", 0.10);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO", 0.15);
        biyo.addTeacher(t3);


        Student s1 = new Student("Inek Saban", "144", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,78,50,80,60,70);
        s1.isPass();

        Student s2 = new Student("Duduk Necmi", "256", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(10,20,30,45,26,50);
        s2.isPass();

    }


}
