public class TesterClass {
    // if anything takes more than a few seconds to run, something was messed up
    // the normal run time is around a couple of milliseconds
    // 1 * 10^-3 seconds

    // the toString method returns a string representation of the class

    private String name;
    private int age;

    public TesterClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "TesterClass{name = " + name + ", age = " + age + "}";
    } // toString


}
