package com.infosys;
class Student{
    private int studid;
    private String name;
    private int yearofenrollment;
    public static int counter;
    static{
        Student.counter = 500;
    }
    public Student(String name, int yearofenrollment){
        this.name = name;
        this.yearofenrollment = yearofenrollment;
        this.studid = ++Student.counter;
    }

    public static int getNoOfStudents(){
        return (Student.counter -500);
    }
}
class GFG {
    public static void main(String[] args){
        Student student = new Student("ravi", 2020);
        Student student2 = new Student("ravi", 2020);
        Student student3 = new Student("ravi", 2020);
        System.out.println(student.getNoOfStudents());
    }
    }