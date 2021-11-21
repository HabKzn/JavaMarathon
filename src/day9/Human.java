//task1
package day9;

public abstract class Human {
    private String name;

    Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("Этот человек с именем " + getName());
    }

}
