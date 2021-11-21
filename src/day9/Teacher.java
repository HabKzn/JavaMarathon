//task1
package day9;

public class Teacher extends Human {
    private String className;

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    Teacher(String name, String className) {
        super(name);
        setClassName(className);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Этот учитель с именем " + getName());
    }
}
