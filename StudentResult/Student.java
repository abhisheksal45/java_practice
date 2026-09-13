package StudentResult;

public abstract class Student {
    String Subname1;
    String Subname2;
    String Subname3;
    String Subname4;

    String Studname;
    int marks1;
    int marks2;
    int marks3;
    int marks4;


    public Student(String subname1, String subname2, String subname3, String subname4, String studname, int marks1, int marks2, int marks3, int marks4) {
       this. Subname1 = subname1;
       this. Subname2 = subname2;
     this.   Subname3 = subname3;
      this.  Subname4 = subname4;
       this. Studname = studname;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    public String getSubname1() {
        return Subname1;
    }

    public void setSubname1(String subname1) {
        Subname1 = subname1;
    }

    public String getSubname2() {
        return Subname2;
    }

    public void setSubname2(String subname2) {
        Subname2 = subname2;
    }

    public String getSubname3() {
        return Subname3;
    }

    public void setSubname3(String subname3) {
        Subname3 = subname3;
    }

    public String getSubname4() {
        return Subname4;
    }

    public void setSubname4(String subname4) {
        Subname4 = subname4;
    }

    public String getStudname() {
        return Studname;
    }

    public void setStudname(String studname) {
        Studname = studname;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks4() {
        return marks4;
    }

    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }
public abstract void Grade();
}
