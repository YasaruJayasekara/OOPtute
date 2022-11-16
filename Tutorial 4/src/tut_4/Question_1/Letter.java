package tut_4.Question_1;

public class Letter implements Printable{
    String field;

    public Letter(String field) {
        this.field = field;
    }

    public void print(){
        System.out.println(field);
    }
}
