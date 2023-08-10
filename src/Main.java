import dip.Printable;
import dip.Printer;
import dip.Text;
import isp.HumanWorker;
import isp.RobotWorker;

public class Main {
    public static void main(String[] args) {
        iSP();
        System.out.println("-----------------------------------------------------");
        dIP();
    }

    private static void iSP() { //принцип ISP
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();
        human.work();
        human.eat();
        robot.work();
    }

    private static void dIP() { //принцип dIP
        Printable hello = new Text("Hi there!");
        Printer printer = new Printer();
        printer.print(hello);
    }
}