package no.oslomet.cs.algdat;
import  java.util.NoSuchElementException;

public class Oblig1 {

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1;
    }

    // Oppgave 1
    public static int maks(int[] a) {
        if (a == null || a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom eller null, har ingen største verdi.");
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        if (a == null || a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom eller null.");
        }

        int antallOmbyttinger = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antallOmbyttinger++;
            }
        }
        return antallOmbyttinger;
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Tabellen kan ikke være null.");
        }
        if (a.length == 0) {
            return 0;
        }

        int unike = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Tabellen er ikke sortert stigende.");
            }
            if (a[i] != a[i + 1]) {
                unike++;
            }
        }
        return unike;
    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Tabellen kan ikke være null.");
        }
        if (a.length == 0) {
            return 0;
        }

        int unike = 0;
        for (int i = 0; i < a.length; i++) {
            boolean alleredeSett = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    alleredeSett = true;
                    break;
                }
            }
            if (!alleredeSett) {
                unike++;
            }
        }
        return unike;
    }

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        if (a == null) {
            throw new IllegalArgumentException("Tabellen kan ikke være null.");
        }
        if (fra < 0 || til > a.length) {
            throw new IndexOutOfBoundsException("Indeks er utenfor tabellens grenser.");
        }
        if (fra >= til) {
            return;
        }

        quicksort(a, fra, til - 1);
    }

    private static void quicksort(int[] a, int venstre, int hoyre) {
        if (venstre < hoyre) {
            int pIndeks = partisjoner(a, venstre, hoyre);
            quicksort(a, venstre, pIndeks - 1);
            quicksort(a, pIndeks + 1, hoyre);
        }
    }

    private static int partisjoner(int[] a, int venstre, int hoyre) {
        int midt = venstre + (hoyre - venstre) / 2;
        bytt(a, midt, hoyre);

        int pivot = a[hoyre];
        int i = venstre - 1;

        for (int j = venstre; j < hoyre; j++) {
            if (a[j] <= pivot) {
                i++;
                bytt(a, i, j);
            }
        }
        bytt(a, i + 1, hoyre);
        return i + 1;
    }

    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Oppgave 5
    public static void delsortering(int[] a) {
        if (a == null || a.length <= 1) {
            if (a != null && a.length == 1) {
            }
            return;
        }

        int venstre = 0;
        int hoyre = a.length - 1;

        while (venstre <= hoyre) {
            while (venstre <= hoyre && a[venstre] % 2 != 0) {
                venstre++;
            }
            while (venstre <= hoyre && a[hoyre] % 2 == 0) {
                hoyre--;
            }
            if (venstre < hoyre) {
                bytt(a, venstre, hoyre);
                venstre++;
                hoyre--;
            }
        }

        // Sorterer oddetallene til venstre, og partallene til høyre
        sorter(a, 0, venstre);
        sorter(a, venstre, a.length);

    }

    // Oppgave 6
    public static void rotasjon(char[] a) {
        if (a == null || a.length <= 1) {
            return;
        }

        char siste = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = siste;
    }


    // Oppgave 7
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 8
    public static String flett(String... s) {
        StringBuilder resultat = new StringBuilder();

        int maksLengde = 0;

        for (String tekst : s) {
            if (tekst.length() > maksLengde) {
                maksLengde = tekst.length();
            }
        }

        for (int j = 0; j < maksLengde; j++) {
            for (int i = 0; i < s.length; i++) {
                if (j < s[i].length()) {
                    resultat.append(s[i].charAt(j));
                }
            }
        }
        return resultat.toString();
    }


    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}