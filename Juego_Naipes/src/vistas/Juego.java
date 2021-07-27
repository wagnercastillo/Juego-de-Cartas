package vistas;

import Controlador.Baraja;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.applet.AudioClip;


public final class Juego extends javax.swing.JFrame {

    
    AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sounds/siguienteCarta.wav"));
    
    Baraja bar = new Baraja();
    public String baraja_new[] = bar.baraja;
    String Log = "";
    public int count1 = 0;
    public int count2 = 0;
    public int count3 = 0;
    public int count4 = 0;
    public int count5 = 0;
    public int count6 = 0;
    public int count7 = 0;
    public int count8 = 0;
    public int count9 = 0;
    public int count10 = 0;
    public int count11 = 0;
    public int count12 = 0;
    public int count13 = 0;

    public int nlis = 12;
    public int contl = 0;
    public List<List> rep = new ArrayList<>();
    public List<List> Listini = new ArrayList<>();

    int vueltas = 0;

    public Juego() {
        initComponents();
        cargarReparto();
        transparenciaBoton();
        Listini.add(rep.get(12));
        this.setLocationRelativeTo(null);

    }

    void transparenciaBoton() {
        tcarta.setContentAreaFilled(false);
        tcarta.setBorderPainted(false);

        reiniciar.setContentAreaFilled(false);
        reiniciar.setBorderPainted(false);
    }

    void cargarReparto() {
        if (rep.isEmpty()) {
            rep = bar.cargarReparto(baraja_new);

        }

    }

    void tomarcarta() {
        String dato = String.valueOf(rep.get(nlis).get(0));
        Log += "\n Carta escogida: " + dato.substring(8, 12);
        System.out.println(Log);
        if (vueltas == 0) {
            int combo = bar.getNumber(dato);
            switch (combo) {
                case 1:
                    Listini = rep.get(0);
                    rep.get(0).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 0;
                    switch (count1) {
                        case 0:
                            count1++;
                            a4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count1++;
                            a3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:

                            count1++;
                            a2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:

                            count1++;
                            a1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(0).size(); j++) {
                        //  System.out.println("Combo" + j + " " + rep.get(0).get(j));
                    }
                    break;
                case 2:
                    Listini = rep.get(1);
                    rep.get(1).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 1;
                    switch (count2) {
                        case 0:

                            count2++;
                            b4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count2++;
                            b3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count2++;
                            b2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:

                            count2++;
                            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(1).size(); j++) {
                        // System.out.println("Combo" + j + " " + rep.get(1).get(j));
                    }
                    break;
                case 3:
                    Listini = rep.get(2);
                    rep.get(2).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 2;
                    switch (count3) {
                        case 0:
                            count3++;
                            c4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:

                            count3++;
                            c3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:

                            count3++;
                            c2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:

                            count3++;
                            c1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(2).size(); j++) {
                        //  System.out.println("Combo" + j + " " + rep.get(2).get(j));
                    }
                    break;
                case 4:
                    Listini = rep.get(3);
                    rep.get(3).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 3;
                    switch (count4) {
                        case 0:
                            count4++;
                            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:

                            count4++;
                            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count4++;
                            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count4++;
                            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(3).size(); j++) {
                        //  System.out.println("Combo" + j + " " + rep.get(3).get(j));
                    }
                    break;
                case 5:
                    Listini = rep.get(4);
                    rep.get(4).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 4;
                    switch (count5) {
                        case 0:
                            count5++;
                            e4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count5++;
                            e3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count5++;
                            e2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count5++;
                            e1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(4).size(); j++) {
                        // System.out.println("Combo" + j + " " + rep.get(4).get(j));
                    }
                    break;
                case 6:
                    Listini = rep.get(5);
                    rep.get(5).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 5;
                    switch (count6) {
                        case 0:
                            count6++;
                            f4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count6++;
                            f3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count6++;
                            f2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count6++;
                            f1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(5).size(); j++) {
                        //System.out.println("Combo" + j + " " + rep.get(5).get(j));
                    }
                    break;
                case 7:
                    Listini = rep.get(6);
                    rep.get(6).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 6;
                    switch (count7) {
                        case 0:
                            count7++;
                            g4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count7++;
                            g3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count7++;
                            g2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count7++;
                            g1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            //   System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(6).size(); j++) {
                        //System.out.println("Combo" + j + " " + rep.get(6).get(j));
                    }
                    break;
                case 8:
                    Listini = rep.get(7);
                    rep.get(7).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 7;
                    switch (count8) {
                        case 0:
                            count8++;
                            h4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count8++;
                            h3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count8++;
                            h2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count8++;
                            h1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            // System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(7).size(); j++) {
                        // System.out.println("Combo" + j + " " + rep.get(7).get(j));
                    }
                    break;
                case 9:
                    Listini = rep.get(8);
                    rep.get(8).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 8;
                    switch (count9) {
                        case 0:
                            count9++;
                            i4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count9++;
                            i3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count9++;
                            i2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count9++;
                            i1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            // System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(8).size(); j++) {
                        //System.out.println("Combo" + j + " " + rep.get(8).get(j));
                    }
                    break;
                case 10:
                    Listini = rep.get(9);
                    rep.get(9).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 9;
                    switch (count10) {
                        case 0:
                            count10++;
                            j4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));

                            break;
                        case 1:
                            count10++;
                            j3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count10++;
                            j2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count10++;
                            j1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            //  System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(9).size(); j++) {
                        //System.out.println("Combo" + j + " " + rep.get(9).get(j));
                    }
                    break;
                case 11:
                    Listini = rep.get(10);
                    rep.get(10).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 10;
                    switch (count11) {
                        case 0:
                            count11++;
                            k4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count11++;
                            k3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count11++;
                            k2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count11++;
                            k1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
                            //  System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(10).size(); j++) {
                        //System.out.println("Combo" + j + " " + rep.get(10).get(j));
                    }
                    break;
                case 12:
                    Listini = rep.get(11);
                    rep.get(11).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 11;
                    switch (count12) {
                        case 0:
                            count12++;
                            l4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count12++;
                            l3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count12++;
                            l2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count12++;
                            l1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(11).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(11).get(j));
                    }
                    break;
                case 13:
                    Listini = rep.get(12);
                    rep.get(12).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 12;
                    switch (count13) {
                        case 0:
                            count13++;
                            m4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count13++;
                            m3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count13++;
                            m2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count13++;
                            m1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(12).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(12).get(j));
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "no existen mas opciones " + combo + "  dato " + dato);
                    break;
            }
            vueltas++;
//       
        } else {

            int combo = bar.getNumber(dato);
            switch (combo) {
                case 1:
                    Listini = rep.get(0);
                    rep.get(0).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 0;
                    switch (count1) {
                        case 0:
                            count1++;
                            a4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count1++;
                            a3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:

                            count1++;
                            a2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:

                            count1++;
                            a1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(0).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(0).get(j));
                    }
                    break;
                case 2:
                    Listini = rep.get(1);
                    rep.get(1).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 1;
                    switch (count2) {
                        case 0:

                            count2++;
                            b4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count2++;
                            b3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count2++;
                            b2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:

                            count2++;
                            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(1).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(1).get(j));
                    }
                    break;
                case 3:
                    Listini = rep.get(2);
                    rep.get(2).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 2;
                    switch (count3) {
                        case 0:
                            count3++;
                            c4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:

                            count3++;
                            c3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:

                            count3++;
                            c2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:

                            count3++;
                            c1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(2).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(2).get(j));
                    }
                    break;
                case 4:
                    Listini = rep.get(3);
                    rep.get(3).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 3;
                    switch (count4) {
                        case 0:
                            count4++;
                            d4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count4++;
                            d3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count4++;
                            d2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count4++;
                            d1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(3).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(3).get(j));
                    }
                    break;
                case 5:
                    Listini = rep.get(4);
                    rep.get(4).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 4;
                    switch (count5) {
                        case 0:
                            count5++;
                            e4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count5++;
                            e3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count5++;
                            e2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count5++;
                            e1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(4).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(4).get(j));
                    }
                    break;
                case 6:
                    Listini = rep.get(5);
                    rep.get(5).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 5;
                    switch (count6) {
                        case 0:
                            count6++;
                            f4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count6++;
                            f3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count6++;
                            f2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count6++;
                            f1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(5).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(5).get(j));
                    }
                    break;
                case 7:
                    Listini = rep.get(6);
                    rep.get(6).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 6;
                    switch (count7) {
                        case 0:

                            count7++;
                            g4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count7++;
                            g3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count7++;
                            g2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count7++;
                            g1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(6).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(6).get(j));
                    }
                    break;
                case 8:
                    Listini = rep.get(7);
                    rep.get(7).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 7;
                    switch (count8) {
                        case 0:
                            count8++;
                            h4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count8++;
                            h3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count8++;
                            h2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count8++;
                            h1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(7).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(7).get(j));
                    }
                    break;
                case 9:
                    Listini = rep.get(8);
                    rep.get(8).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 8;
                    switch (count9) {
                        case 0:
                            count9++;
                            i4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count9++;
                            i3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count9++;
                            i2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count9++;
                            i1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(8).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(8).get(j));
                    }
                    break;
                case 10:
                    Listini = rep.get(9);
                    rep.get(9).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 9;
                    switch (count10) {
                        case 0:
                            count10++;
                            j4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));

                            break;
                        case 1:
                            count10++;
                            j3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count10++;
                            j2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count10++;
                            j1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(9).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(9).get(j));
                    }
                    break;
                case 11:
                    Listini = rep.get(10);
                    rep.get(10).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 10;
                    switch (count11) {
                        case 0:
                            count11++;
                            k4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count11++;
                            k3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count11++;
                            k2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count11++;
                            k1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(10).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(10).get(j));
                    }
                    break;
                case 12:
                    Listini = rep.get(11);
                    rep.get(11).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 11;
                    switch (count12) {
                        case 0:
                            count12++;
                            l4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count12++;
                            l3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count12++;
                            l2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count12++;
                            l1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(11).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(11).get(j));
                    }
                    break;
                case 13:
                    Listini = rep.get(12);
                    rep.get(12).add(dato);
                    rep.get(nlis).remove(0);
                    nlis = 12;
//                    System.out.println("vistas.Repartir.tomarcarta()   img " + dato);
                    switch (count13) {
                        case 0:
                            count13++;
                            m4.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 1:
                            count13++;
                            m3.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 2:
                            count13++;
                            m2.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        case 3:
                            count13++;
                            m1.setIcon(new javax.swing.ImageIcon(getClass().getResource(dato)));
                            break;
                        default:
//                            System.out.println("carga interna");
                            break;
                    }
                    for (int j = 0; j < rep.get(12).size(); j++) {
//                        System.out.println("Combo" + j + " " + rep.get(12).get(j));
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No hay más" + combo + "  dato " + dato);
                    break;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a4 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        k4 = new javax.swing.JLabel();
        k3 = new javax.swing.JLabel();
        k2 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        tcarta = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(770, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        f4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        f3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        f2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 80, -1));

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        k4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(k4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));
        k4.getAccessibleContext().setAccessibleDescription("");

        k3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(k3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(k2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        k1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(k1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        m4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        m3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/REVES.png"))); // NOI18N
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        tcarta.setBackground(new java.awt.Color(255, 255, 255));
        tcarta.setForeground(new java.awt.Color(255, 255, 255));
        tcarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FinalSiguiente.png"))); // NOI18N
        tcarta.setOpaque(false);
        tcarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcartaMouseClicked(evt);
            }
        });
        tcarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcartaActionPerformed(evt);
            }
        });
        getContentPane().add(tcarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 60, 60));

        reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FinalReiniciar.png"))); // NOI18N
        reiniciar.setOpaque(false);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/MESA.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 780, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcartaActionPerformed
        sonido.play();
        Lose l = new Lose();
        Winner w = new Winner();
    
        int sumacount = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count11 + count12 + count13;
        if (count1 >= 4 || count2 >= 4 || count3 >= 4 || count4 >= 4 || count5 >= 4
                || count6 >= 4 || count7 >= 4 || count8 >= 4 || count9 >= 4 || count10 >= 4
                || count11 >= 4 || count12 >= 4 || count13 >= 4 && sumacount < 52) {
//            JOptionPane.showMessageDialog(null, "Perdiste. Quizas la proxima!");
            contl++;
            if (contl == 1) {
                l.setVisible(true);
                l.setLocationRelativeTo(null);
            }

        } else {
            tomarcarta();
            if (sumacount >= 51) {
                if (contl==0) {
                    w.setVisible(true);
                    w.setLocationRelativeTo(null);
                }

                //JOptionPane.showMessageDialog(null, "GANAAAAASTE!");
            }

        }
    }//GEN-LAST:event_tcartaActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        dispose();
        Juego r = new Juego();
        r.setVisible(true);
    }//GEN-LAST:event_reiniciarActionPerformed

    private void tcartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcartaMouseClicked
        sonido.play();
    }//GEN-LAST:event_tcartaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Juego().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i4;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel k1;
    private javax.swing.JLabel k2;
    private javax.swing.JLabel k3;
    private javax.swing.JLabel k4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton tcarta;
    // End of variables declaration//GEN-END:variables

}
