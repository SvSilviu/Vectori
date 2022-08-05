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


    //TODO:Să se determine maximul şi minimul valorilor elementelor unui vector.
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
//TODO: Se dă un șir cu n elemente, numere reale. Să se determine câte dintre elemente se află în afara intervalului închis determinat de primul și ultimul element.

    //todo functie ce primeste ca parametru 2 numere si returneaza numarul mai mare

    public static int maxim(int a, int b) {
        if (a < b) {

            return b;
        }

        return a;
    }

    public static int minim(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int elementInterval(int[] arr) {
        int contor = 0;
        int primul = arr[0];
        int ultimul = arr[arr.length - 1];
        int min = minim(primul, ultimul);
        int max = maxim(primul, ultimul);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= max && arr[i] >= min) {
                contor++;
            }
        }
        return contor;
    }


    //TODO: Se dă un vector x cu n elemente, numere naturale. Să se construiască un alt vector, y, care să conțină elementele pare din x;

    public static int[] elementePare(int[] arr) {

        int[] nou = new int[numerePare(arr)];
        int pozitie = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                nou[pozitie] = arr[i];
                pozitie++;
            }
        }

        return nou;


    }


    //todo functie ce retueneaza pozitia minmului
    public static int pozitiaMinimului(int[] arr) {
        int min = arr[0];
        int pozitie = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pozitie = i;
            }
        }
        return pozitie;
    }

    //todo: metoda2

    public static int pozitiaMinimuluiMetoda2(int[] arr) {
        int min = celMaiMicNr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {

                return i;
            }
        }
        return -1;
    }

    //todo fucntie ce returneaza pozitia maximului
    public static int pozitiaMaximului(int[] arr) {
        int max = arr[0];
        int pozitie = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pozitie = i;
            }
        }
        return pozitie;
    }

    public static int pozitiaMaximuluiMetoda2(int[] arr) {
        int max = celMaiMareNumar(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return i;
            }
        }
        return -1;
    }
    //todo:sa se afiseze toate numerele dintre maxim si minim

    public static void intervalMinSiMax(int[] arr) {

        int pozMin = pozitiaMinimului(arr);//3
        int pozMax = pozitiaMaximului(arr);//1
        int min = minim(pozMin, pozMax);//1
        int max = maxim(pozMin, pozMax);//3

        for (int i = min + 1; i < max; i++) {

            System.out.print(arr[i] + " ");
        }
    }
//todo:Se dau n numere întregi. Determinaţi câte dintre numerele date apar o singură dată.

    public static String numereUnice(int[] arr) {
        int contor = 0;
        for (int i = 0; i < arr.length; i++) {
            int aparitie = aparitieNr(arr, arr[i]);
            if (aparitie == 1) {
                contor++;
            }
        }
        String solutie = "Sunt " + contor + " numere unice";
        return solutie;
    }
//todo:Se citește un vector cu n elemente, numere naturale.
// Să se afișeze elementele vectorului în următoarea ordine: primul, ultimul, al doilea, penultimul, etc.

    public static void afisare2(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            System.out.print(arr[i] + " " + arr[j] + " ");
        }
    }

    //TODO: sa se determine suma elementelor pozitive din vector
// {12,43,-1,3,}
    public static int sumaVectorilorPozitivi(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                suma = suma+arr[i];
            }
        }
        return suma;
    }

    //todo: sa se afiseze elementele pozitive de rang impar dintr-un vector de numere intregi;

    public static void elementeDeRangImpar(int [] arr){
        int rangImpar = 0;
        int pozitie = 0;
        for(int i= 0;i<arr.length;i++){
            if (i%2!=0&&arr[i]>0){

                System.out.println(arr[i]);
            }
        }

    }

    //todo: Sa se scrie un program care numara elementele pozitive, negative si respectiv nule dintr-un vector,
   // parcurcurgandu-l o singura data.

    public static String sumaElemente(int[] arr) {
        int numerePozitive = 0;
        int numereNegative = 0;
        int numereNule = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                numerePozitive++;
            }
            if (arr[i] < 0) {
                numereNegative++;

            }
            if (arr[i] == 0) {
                numereNule++;

            }

        }
        String solutie = " Sunt " + numerePozitive + " numere pozitive " + " " + " Sunt " + numereNegative + " numere negaive " + " " + " Sunt " + numereNule + " numere nule";
        return solutie;
    }

    //TODO: Sa se calculeze suma elementelor negative si de valoare para dintr-un vector de numere intregi.

    public static String sumaElementelorPareNule(int[] arr) {
        int solutie = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] % 2 == 0) {
                solutie = solutie + arr[i];
            }
        }
        String rezulat = "Suma elementor pare nule este " + solutie;
        return rezulat;
    }
//TODO: Scrieti un program care calculeaza produsul si numarul elementelor negative aflate pe pozitii impare in vector.

    public static String problema9(int[] arr) {
        int pozitieImpara = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && i % 2 != 0) {
                pozitieImpara = arr[i];
                pozitieImpara = pozitieImpara * i;
            }
        }
        String solutie = "Rezultatul este : " + pozitieImpara;
        return solutie;
    }
}






