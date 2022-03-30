package fasal.haryana.gov.layouttesting;

abstract public class myabstract implements mathInterface {

    /*Abstract class doesn't support multiple inheritance.*/

    private final int number=10;
    /*non abstract method*/
    void addnumber(int a, int b) {

    }

    /*abstract method*/
    abstract void multiply(int a, int b);

    /*abstract class can implement interface methods*/
    @Override
    public void subtracct(int x, int y) {

    }


}
