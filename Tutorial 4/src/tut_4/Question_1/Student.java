package tut_4.Question_1;

public class Student implements Printable{
    private String name;
    private String[] markArray;

    public Student(String name, String[] mark) {
        this.name = name;
        this.markArray = mark;
    }

    public void print(){
        System.out.println(name);
        for(String mark : markArray){
            System.out.println(mark);
        }
    }
}
