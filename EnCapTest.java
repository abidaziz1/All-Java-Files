class Person{
    private String name;
    private int age;

    public void SetName(String name){
        this.name = name;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public void GetName(){
        System.out.println(this.name);
    }

    public void GetAge(){
        System.out.println(this.age);
    }
}

public class EnCapTest {
    public static void main(String[] args){
        Person p = new Person();
        p.SetName("AbiD");
        p.SetAge(18);

        p.GetName();
        p.GetAge();
    }
}
