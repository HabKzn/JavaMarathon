package day9;

public class Student extends Human {
    private String groupName;

    Student(String name, String groupName) {
        super(name);
        setGroupName(groupName);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;

    }



    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
