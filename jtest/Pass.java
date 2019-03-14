/*public class Pass{
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        System.out.println(t1.i + " " + t1.j);
        System.out.println(t2.i + " " + t2.j);
    }
}

class T{
    static int i = 0;
    int j = 0;
    T() {
        i++;
        j = 1;
    }
}*/

import java.util.Date;

public class Pass {
    public static void m1(Date date) {
        //date = new Date(7654321);
        //date.setTime(7654321);
        date = null;
    }
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
}