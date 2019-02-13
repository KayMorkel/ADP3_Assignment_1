package za.ca.cput.kaylinmorkelassignment1;

public class Person
{
    private String name;
    private int age;
    private int yearStudy;
    //CONSTRUCTOR
    Person(String nm, int a, int yS)
    {
        name = nm;
        age = a;
        yearStudy = yS;
    }
    /////////////
//SETTERS
    /*public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }*/
/////////
//GETTERS
    private String getName() {
        return name;
    }
    private int getAge() {
        return age;
    }
    private int getYearStudy() {
        return yearStudy;
    }
    /////////
//TO STRING
    public String toString() {
        return ("Hi, nice to meet you, " + getName() + ". \nYou are " + getAge() + " years old and kudos to studying for"
                + getYearStudy() + " years.");
    }
///////////
}


