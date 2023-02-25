package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
// CAST 1 - NAKRESLI ROVNOSTRANNY TROJUHELNIK, CTVEREC, OBDELNIK, KOLECKO(MNOHOUHELNIK).

//        zofka.setLocation(100.0, 100.0);
//        nakresliRovnostrannyTrojuhelnik(60.0);
//
//        zofka.setLocation(200.0, 100.0);
//        nakresliCtverec(60.0);
//
//        zofka.setLocation(300.0, 100.0);
//        nakresliObdelnik(60.0, 30.0);
//
//        zofka.setLocation(400.0, 100.0);
//        nakresliTrojuhelnikMasinka(60.0);
//
//        zofka.setLocation(500.0, 100.0);
//        nakresliKolecko(6.0, 10);


// CAST 2 -NAKRESLI ZMRZLINU
        zofka.setLocation(100, 300);
        zofka.setPenColor(Color.ORANGE);
        zofka.turnRight(15);
        zofka.move(120);
        zofka.setLocation(100, 300);
        zofka.turnLeft(30);
        zofka.move(120);
        zofka.turnRight(105);
        zofka.move(60);
        zofka.turnLeft(90);
        var zmrzlinaY = zofka.getY();
        var zmrzlinaX = zofka.getX();
        zofka.setLocation(zmrzlinaX + 2, zmrzlinaY - 8);
        zofka.setPenColor(Color.pink);
        nakresliKolecko(5.5);

// CAST2 NAKRESLI SNEHULAKA
        zofka.setLocation(400.0, 200.0);
        zofka.setPenColor(Color.blue);
        // nastav velikosti bricha, hlavy, nohou, rukou
        nakresliSnehulaka(13, 8, 17, 5);

//    CAST 2 NAKRESLI MASINKU
        zofka.setLocation(600, 300);
        zofka.turnRight(180);

        //korekce
        zofka.turnRight(3);

        zofka.setPenColor(Color.red);
        nakresliTrojuhelnikMasinka(70);
        zofka.turnLeft(90);
        zofka.move(20);

        zofka.setPenColor(Color.green);
        nakresliObdelnik(70, 140);
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnLeft(90);
        nakresliObdelnik(140, 90);
        zofka.turnLeft(180);

        zofka.setPenColor(Color.black);
        nakresliKolecko(8);
        zofka.turnRight(90);
        zofka.setLocation(650, 280);
        nakresliKolecko(4);
        zofka.setLocation(710, 280);
        nakresliKolecko(4);

        zofka.setLocation(50, 50);
    }

    public void nakresliSnehulaka(double krokBricho, double krokHlava, double krokNohy, double krokRuky) {
//odecte souradnice Y pro pravou ruku
        var souradnicePravaRukaY = zofka.getY();
        var souradnicePravaRukaX = zofka.getX();

// nakreslí 1. cast bricha a odecte souradnice X pro hlavu
        for (int i = 0; i < 9; i++) {
            zofka.move(krokBricho);
            zofka.turnLeft(10);
        }
        var souradniceHlavaX = zofka.getX();
        var souradniceHlavaY = zofka.getY();

// nakreslí 2. cast bricha a odecte souradnice Y pro levou ruku
        for (int i = 0; i < 9; i++) {
            zofka.move(krokBricho);
            zofka.turnLeft(10);
        }
        var souradniceLevaRukaY = zofka.getY();
        var souradniceLevaRukaX = zofka.getX();

// nakreslí 3. cast bricha a odecte souradnice X pro nohy
        for (int i = 0; i < 9; i++) {
            zofka.move(krokBricho);
            zofka.turnLeft(10);
        }
        var souradniceNohyX = zofka.getX();
        var souradniceNohyY = zofka.getY();

// nakreslí 4. cast bricha
        for (int i = 0; i < 9; i++) {
            zofka.move(krokBricho);
            zofka.turnLeft(10);
        }

// otoč zofku
        zofka.turnRight(77);

// nakresli hlavu snehulaka
        zofka.setLocation(souradniceHlavaX - (krokHlava / 2), souradniceHlavaY);
        nakresliKolecko(krokHlava);
        zofka.turnRight(180);

// nakresli nohy sněhuláka
        zofka.setLocation(souradniceNohyX - (krokNohy / 2), souradniceNohyY);
        nakresliKolecko(krokNohy);
        zofka.turnRight(90);

//nakresli levou ruku
        zofka.setLocation(souradniceLevaRukaX, souradniceLevaRukaY);
        nakresliKolecko(krokRuky);
        zofka.turnRight(180);

// nakresli pravou ruku
        zofka.setLocation(souradnicePravaRukaX, souradnicePravaRukaY - (krokRuky / 2));
        nakresliKolecko(krokRuky);
        zofka.turnRight(10);

    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(120.0);
        }
    }

    public void nakresliCtverec(double velikostStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90.0);
        }
    }

    public void nakresliObdelnik(double velikostStranyA, double velikostStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(90.0);
            zofka.move(velikostStranyB);
            zofka.turnRight(90.0);
        }
    }

    public void nakresliKolecko(double delkaCary) {
        for (int i = 0; i < (36); i++) {
            zofka.move(delkaCary);
            zofka.turnLeft(10);
        }
    }

    public void nakresliTrojuhelnikMasinka(double delkaStrany) {
        double vypocenaPrepona = Math.sqrt(2 * Math.pow(delkaStrany, 2));
        zofka.move(delkaStrany);
        zofka.turnLeft(135.0);
        zofka.move(vypocenaPrepona);
        zofka.turnLeft(135.0);
        zofka.move(delkaStrany);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
