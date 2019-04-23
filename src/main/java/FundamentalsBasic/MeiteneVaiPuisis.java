package FundamentalsBasic;

import java.util.Scanner;

//Programmiņa, kas pārbauda vai vārda lietotājs ir meitene vai zēns.


public class MeiteneVaiPuisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // izmantoju skaneri, lai iegūtu lietotāja ievadītus datus.
        System.out.println("Kā tevi sauc?");
        String vards = sc.next();
        int garums = vards.length()-1; //kad nosaka garumu, tad sāk skaitīt ar 1
        char burts = vards.charAt(garums);  // charAt  vārdu, kā array uztver un sāk skaitīt no 0, tādēļ lenght -1
        if (burts == 'a' || burts == 'e') { //meitenēm vārdi beidzas ar A un E. Protams, ir izņēmumi, bet šoreiz pieņemu,
            System.out.println("Tu esi meitene"); //ka tikai A un E.
        } else {
            System.out.println("Tu esi zēns");  //jebkas cits ir zēns. Šajā gadījumā arī "zzzxxxyyy" un "123" ir zēns
        }

    }
}

//projekta mērķis bja notestēt lenght/charAt nevis izveidot pilnīgu programmiņu, kas spēj noteikt vai ir ievadīts
//zēna/meitenes  vārds vai muļķības