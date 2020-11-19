public class Dog extends Animal {
    public void setName(String name){
        super.name = name;
    }

    public void setAge(int age){
        super.age = age;
    }

    @Override
    public void talk(){
        System.out.println("Woof!");
    }
}
