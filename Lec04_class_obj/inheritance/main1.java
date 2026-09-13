package Lec04_class_obj.inheritance;

public class main1 {
    public static void main(String[] args) {
//        //vehicle ve=new vehicle("Toyota","160 Km/h");
//        car ca=new car("Toyota","160 Km/h");
//        ca.Cardetails();
//        ca.noofdoors();
//        Person pe=new Person();
//        pe.name="jayesh";
//        pe.age=29;
//
//        Teacher te=new Teacher();
//        te.name="Karan";
//        te.age=23;
//        te.Persondetails();
//        te.Teacherdetails();
//        te.SubjectForTeaching();
//
//        Student st=new Student();
//        st.name="ram";
//        st.age=19;
//
//        st.StudentDetails();
//
        Employee em=new Employee();
        em.name="sallu";
        em.age=58;
        em.salary=1234567;
        em.empdetails();

        manager ma=new manager();
        ma.teamsize=6;
        ma.name="sharukh";
        ma.manage();



    }
}
