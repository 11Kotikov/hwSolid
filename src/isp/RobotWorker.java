package isp;

import isp.impl.Workable;

//public class RobotWorker implements Worker{
public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("работаю");
    }
}
