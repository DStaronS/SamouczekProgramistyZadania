package pl.swieczkowski.zadania.objekty;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(41, 78, 186, "Rafał", "Male");
        System.out.println(human.toString());
        human.isMale(human.getSex());
    }
}
