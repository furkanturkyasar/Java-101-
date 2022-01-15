public class Teacher {
    String name;
    String no;
    String branch;


    Teacher(String name, String no, String branch){
        this.name = name;
        this.no = no;
        this.branch = branch;
    }

    void print(){
        System.out.println(" Ismi: "+name+ "\n No: "+no+"\n Bolumu: "+branch);
    }



}
