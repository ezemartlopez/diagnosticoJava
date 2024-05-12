import java.util.ArrayList;
import java.util.List;

class ListAnalyzer {
	//Los declaro estaticos para que se puedan acceder sin instanciar
    //como lo propone el ejemplo
    static int contadorImpares(List<Integer> lista) {
        int count = 0;
        for (Integer num : lista) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    static List<Integer> numerosConsecutivos(List<Integer> lista) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < lista.size() - 1; i++) {
            //comparo dos elementos consecutivos si:  anterior + 1 = siguiente
            if (lista.get(i) + 1 == lista.get(i + 1)) {
                consecutivos.add(lista.get(i));
                consecutivos.add(lista.get(i + 1));
            }
        }
        return consecutivos;
    }
}

public class App {
    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(27);
        miLista.add(6);
        miLista.add(14);
        miLista.add(8);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);

        int cantidadImpares = ListAnalyzer.contadorImpares(miLista);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        // Salida: Cantidad de números impares: 3

        List<Integer> numConsecutivos = ListAnalyzer.numerosConsecutivos(miLista);
        System.out.println("Números consecutivos de la lista: " + numConsecutivos);
        // Salida: Números consecutivos de la lista: [8, 9, 12, 13]
    }
}

