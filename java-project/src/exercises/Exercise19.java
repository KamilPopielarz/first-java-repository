package exercises;

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge(){
        return age;
    }
}


public class Exercise19 {  // Getters and Return Values
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Kamil";
        person1.age = 23;

        person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirement:" + years);

        int age = person1.getAge();

        System.out.println("Age is " + age);

    }


}
