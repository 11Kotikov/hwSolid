package isp;

import isp.impl.Eatable;
import isp.impl.Workable;

//public class HumanWorker implements Worker{
public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("работаю");
    }

    @Override
    public void eat() {
        System.out.println("ем");
    }
}
