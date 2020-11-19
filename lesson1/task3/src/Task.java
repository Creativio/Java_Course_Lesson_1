

public class Task {
    private String name;
    private String surname;
    private int age;
    private String description;


    public static void main(String[] args) {
        Task task = new Task("Arthur","Kornyy",26,"i can");

        System.out.println(task.toString());
    }

   public Task(String name, String surname, int age, String desc){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.description = desc;
   }

    @Override
    public String toString() {
        return "My name is " + name + " " + surname + " I am " + age + " years old"
                + "I learn Java because " + description;

    }
}