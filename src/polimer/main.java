package polimer;

public class main {

    public static void main(String[] args) {
        person s = new Student("1","2");
        s.HelloPerson();
        ((Student) s).Hello();

    }
}
