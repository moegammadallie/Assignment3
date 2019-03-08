package Assignment3;

public class Student {
    String FName;
    String LName;
    String university;

    public String name(String firstName){
        this.FName = firstName;
        return FName;
    }
    public String surname(String lastName){
        this.LName = lastName;
        return LName;
    }
    public String uni(String varsity){
        this.university = varsity;
        return university;
    }
}
