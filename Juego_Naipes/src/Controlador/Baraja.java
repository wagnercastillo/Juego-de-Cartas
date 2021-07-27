
package Controlador;

import java.util.List;  
import java.util.ArrayList;
import java.util.Collections;
public class Baraja {

    public String baraja[] = {
        "/assets/1CN.png", "/assets/2CN.png", "/assets/3CN.png", "/assets/4CN.png",
        "/assets/5CN.png", "/assets/6CN.png", "/assets/7CN.png", "/assets/8CN.png",
        "/assets/9CN.png", "/assets/10CN.png", "/assets/11CN.png", "/assets/12CN.png",
        "/assets/13CN.png", "/assets/1CR.png", "/assets/2CR.png", "/assets/3CR.png",
        "/assets/4CR.png", "/assets/5CR.png", "/assets/6CR.png", "/assets/7CR.png",
        "/assets/8CR.png", "/assets/9CR.png", "/assets/10CR.png", "/assets/11CR.png",
        "/assets/12CR.png", "/assets/13CR.png", "/assets/1TR.png", "/assets/2TR.png",
        "/assets/3TR.png", "/assets/4TR.png", "/assets/5TR.png", "/assets/6TR.png",
        "/assets/7TR.png", "/assets/8TR.png", "/assets/9TR.png", "/assets/10TR.png",
        "/assets/11TR.png", "/assets/12TR.png", "/assets/13TR.png", "/assets/1DT.png",
        "/assets/2DT.png", "/assets/3DT.png", "/assets/4DT.png", "/assets/5DT.png",
        "/assets/6DT.png", "/assets/7DT.png", "/assets/8DT.png", "/assets/9DT.png",
        "/assets/10DT.png", "/assets/11DT.png", "/assets/12DT.png", "/assets/13DT.png"};

    public List<List> cargarReparto(String[] baraja) {
        Baraja ex = new Baraja();
        List<String> lista = ex.convertir(baraja);
        List<List> combosre = new ArrayList<>();
        combosre = ex.repartir(lista);
        return combosre;
    }

    public List<String> convertir(String[] baraja) {
        List<String> lista = new ArrayList<>();
        for (int j = 0; j < baraja.length; j++) {
            lista.add(baraja[j]);
        }
        return lista;
    }

    public List<List> repartir(List<String> barajas) {
        List<List> combos = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            List<String> combo = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                int n = (int) (Math.random() * (barajas.size() - 0)) + 0;
                combo.add(barajas.get(n));
                barajas.remove(n);

            }
            combos.add(combo);
        }
        return combos;
    }

    public String[] Mezclar_baraja(List<String> barajas) {
        try {
            Collections.shuffle(barajas);
            String mix_baraja[] = new String[barajas.size()];

            for (int i = 0; i < barajas.size(); i++) {
                mix_baraja[i] = (String) barajas.get(i);
            }
            return mix_baraja;
        } catch (Exception e) {
            System.out.println("Controlador.ctr_baraja.Mezclar_baraja() " + e.getCause() + " " + e.toString());
            return null;
        }
    }

    public int getNumber(String cadena) {
        char[] cadena_aux = cadena.toCharArray();
        String n = "";
        int num = 0;
        for (int i = 0; i < cadena_aux.length; i++) {
            if (Character.isDigit(cadena_aux[i])) {
                n += cadena_aux[i];
            }
        }
        num = Integer.parseInt(n);
        return num;
    }
}
