import java.util.*;

class Course{
    String courseName;
    int duration;
    double fee;
    static String instituteName = "LPU";
    
    Course(String name, int time, double pay){
        courseName = name;
        duration = time;
        fee = pay;
    }

    void displayCourseDetails(){
        System.out.println(courseName + " "+ duration + " " + fee + " -> " + instituteName);
    }

    static void updateInstituteName(String name){
        instituteName = name;
    }
}
public class Instp2 {
    public static void main(String[] args) {
        Course c1 =  new Course("btech", 4, 85000.0);
        Course c2 =  new Course("bech", 4, 8000.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Chitkara");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }


}
