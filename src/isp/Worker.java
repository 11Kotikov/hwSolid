package isp;
//как интерфейс этот класс нормальный, но как абстракция для нашей задаче - не годен
//поэтому, следуя принципу ISP, использовать его не нужно!
//неоьходимо сегрегировать его на два соответствующих интерфейса
//хоть Java и не поддерживает множественное наследование, но интерфейсов можно впихнуть много...
public interface Worker {
    void work();
    void eat();
}
