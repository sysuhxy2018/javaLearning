public class WhatIsThis{
    private int i = 5;
    private static double k = 0;

    public WhatIsThis(int i, double k) {
        this.i = i;
        //this.k++;
        WhatIsThis.k++;
        //this.setK(k);
    }

    public WhatIsThis() {
        //System.out.println("Are you OK?");
        this(6, 1.5);
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void setK(double k) {
        WhatIsThis.k = k;
        //this.k = k;
    }

    public static void main(String[] args) {
        System.out.println(WhatIsThis.k);
        WhatIsThis wThis = new WhatIsThis();
        WhatIsThis wThis2 = new WhatIsThis();
        System.out.println(WhatIsThis.k);
    }
}