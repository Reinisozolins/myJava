package easyTask;

public class EurToXRP {
    public static void main(String[] args) {
        double xrp;
        double usd;
        double kurss;
        double nauda;
        double kripto;
        xrp = 0.4806;        // usdx
        kurss = 1.1492;      //eur/usd
        nauda = 999;        // ieguldīts 999 eur
        usd = nauda * kurss;
        kripto = usd / xrp;


        System.out.println("Ja tiktu ieguldīts " +nauda+" eur, tad tas būtu līdzvērtīgs " + usd+ " usd." );
        System.out.println("Ieguldot " + nauda+ "eur kopā var nopirkt " +kripto+ " Ripple :)");
    }
}
