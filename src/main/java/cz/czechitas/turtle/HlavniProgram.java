package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        // CAST 1 - NAKRESLI ROVNOSTRANNY TROJUHELNIK, CTVEREC, OBDELNIK, KOLECKO(MNOHOUHELNIK).
        zofka.setLocation(100.0, 100.0);
        nakresliRovnostrannyTrojuhelnik(60.0);

        zofka.setLocation(200.0, 100.0);
        nakresliCtverec(60.0);

        zofka.setLocation(300.0, 100.0);
        nakresliObdelnik(60.0, 30.0);

        zofka.setLocation(400.0, 100.0);
        nakresliTrojuhelnikMasinka(60.0);

        zofka.setLocation(500.0, 100.0);
        nakresliKolecko(6.0, 10);
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
            zofka.turnLeft(90.0);
            zofka.move(velikostStranyB);
            zofka.turnLeft(90.0);
        }
    }

    public void nakresliKolecko(double delkaCary, double uhel) {
        for (int i = 0; i < (36); i++) {
            zofka.move(delkaCary);
            zofka.turnLeft(uhel);
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
