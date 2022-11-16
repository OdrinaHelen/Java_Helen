import static java.lang.Math.pow;

public class decimalization {

    public static void main(String[] args){



        int vosm = 0_345;
        System.out.println(vosm);

        int s = 8; //8nary system
        int icel = (int) (229/(pow(s,2)));
        int iost = (int) (229%(pow(s,2)));
        System.out.println(icel);
        System.out.println(iost);

        int kcel = (int) (iost/pow(8,1));
        int kost = (int) (iost%pow(8,1));
        System.out.println(kcel);
        System.out.println(kost);

        int lcel = (int) (kost/pow(8,0));
        int lost = (int) (kost%pow(8,0));
        System.out.println(lcel);
        System.out.println(lost);

        System.out.println(vosm + " in 8-ary system = " + icel + kcel + lcel + " in 10-ary system");

    }


}
