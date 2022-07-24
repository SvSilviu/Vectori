package mycode;

public class Functii {


    public static void declaratie() {
        int[] x = {17, -1, 25, 31,34,56,7,6,34};// are dimensiuena 4 dar ultima pozitie =3
        String[] y = {"Ana", "are", "mere"};
        double[] z = {21.5, 37.2, 19.7};
        //todo:Accesare


//        System.out.println(x[2]);
//        System.out.println(y[1]);
//        System.out.println(z[0]);

        //afisam toate elementele lui x

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] +" ");
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
        System.out.println("\n=======================");
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

}
