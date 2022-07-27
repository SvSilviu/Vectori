package mycode;

public class Functii {


    public static void declaratie() {
        int[] x = {17, -1, 25, 31, 34, 56, 7, 6, 34};// are dimensiuena 9 dar ultima pozitie =8
        String[] y = {"Ana", "are", "mere"};
        double[] z = {21.5, 37.2, 19.7};
        //todo:Accesare


//        System.out.println(x[2]);
//        System.out.println(y[1]);
//        System.out.println(z[0]);

        //afisam toate elementele lui x

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("\n====================");
        for (int j = 0; j < y.length; j++) {
            System.out.print(y[j] + " ");
        }
        System.out.println("\n====================");
        for (int k = 0; k < z.length; k++) {
            System.out.print(z[k] + " ");
        }

    }

    //todo:functie ce afiseaza elemente unui vector de numere intregi

    public static void afisare(int[] arr) {


        System.out.println("\nElementele vectorului sunt: ");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println("\n===========================");
    }

    //todo:functie ce primeste ca parametru un vector si returneaza numarul de elementele pare

    public static int numerePare(int[] array) {
        int contor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contor++;
            }
        }
        return contor;
    }

    //todo:functie ce primeste ca prametru un vector si returneaza numarul de elemente impare

    public static int numereImpare(int[] arr) {
        int contor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                contor++;
            }
        }
        return contor;
    }
    //todo:ce returneaza cel mai mare element din vector

    public static int ceaMaiMareCifra(int[] arr) {
        int cifra = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > cifra) {
                cifra = arr[i];
            }
        }
        return cifra;
    }

    //todo: Se dă un şir cu n elemente, numere naturale. Să se verifice dacă toate elementele şirului sunt pare.

    public static boolean cifrePare(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //TODO:Se dă un vector cu n elemente numere naturale. Să se verifice dacă toate elementele vectorului sunt egale.
    public static boolean cifreEgale(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    //todo:functie ce returneaza nuamrul de paritii a unu numar in vector
    //ex:{12,212,32,43,12} pentr v si 12 =>2
    public static int aparitieNr(int[] arr, int numar) {
        int contor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numar) {
                contor++;
            }
        }
        return contor;
    }


    //TODO:Se dă un vector cu n elemente numere naturale.
    // Să se verifice dacă toate elementele vectorului sunt diferite două câte două.

    public static boolean elementeDouaCateDoua(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (aparitieNr(arr, arr[i]) > 1) {
                return false;
            }
        }
        return true;
    }

    //TODO:Se dă un şir cu n elemente, numere naturale. Să se verifice dacă toate elementele şirului au număr par de cifre.

    //todo:functie ce primeste ca parametru un numar si returneaza numarul de cifre
    public static int numarulDeCifre(int numar) {

        int contor = 0;
        while (numar != 0) {
            contor++;
            numar = numar / 10;
        }
        return contor;
    }

    public static boolean numarParDeCifre(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int cifre = numarulDeCifre(arr[i]);
            if (cifre % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //TODO:Se citește un vector cu n elemente, numere naturale.
    // Să se determine câte elemente ale vectorului sunt egale cu diferența dintre cea mai mare și cea mai mică valoare din vector.

    public static int celMaiMareNumar(int[] arr) {
        int nrMax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > nrMax) {
                nrMax = arr[i];
            }
        }
        return nrMax;
    }

    public static int celMaiMicNr(int[] arr) {
        int nrMin = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < nrMin) {
                nrMin = arr[i];
            }
        }
        return nrMin;
    }

    public static int diferentaNr(int[] arr) {
        int diferenta = celMaiMareNumar(arr) - celMaiMicNr(arr);
        int contor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (diferenta == arr[i]) {
                contor++;
            }
        }
        return contor;
    }



}



