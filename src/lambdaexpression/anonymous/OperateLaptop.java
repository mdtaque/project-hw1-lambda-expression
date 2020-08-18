package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {

        //Please implement anonymous class for interface laptop
//        Laptop laptop = null;

        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("The memory size is " + memorySize + " mb");
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("The screensize is " + screenSize + " inch");
            }
        };

        laptop.ramSize(2048);
        laptop.monitorSize(15);


        //please implement anonymous function for Phone FunctionalInterface

        Phone phone = (n)-> System.out.println("There is more network coverage from " + n);
        phone.cellularNetwork("AT&T");


    }
}
