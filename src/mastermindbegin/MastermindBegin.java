package mastermindbegin;

import java.util.Scanner;

public class MastermindBegin {

    public static void main(String[] args) {

        String[] kleurenkraker = {
            "Rood", "Groen", "Geel", "Blauw", "Oranje", "Paars"
        };

        String[] maker = {
            "Zwart", "Wit", "Leeg"
        };

        String[] geheimecode = new String[4];

        geheimecode[0] = kleurenkraker[0];
        geheimecode[1] = kleurenkraker[1];
        geheimecode[2] = kleurenkraker[3];
        geheimecode[3] = kleurenkraker[5];

        String[][] rij = new String[10][4];

        int pogingen = 0;
        boolean codeGekraakt = false;

        Scanner scanner = new Scanner(System.in);

        for (pogingen = 0; pogingen < 10 && !codeGekraakt; pogingen++) {

            System.out.println("Poging " + (pogingen + 1));

            System.out.println("Pin 1: ");
            rij[pogingen][0] = scanner.nextLine();

            System.out.println("Pin 2: ");
            rij[pogingen][1] = scanner.nextLine();

            System.out.println("Pin 3: ");
            rij[pogingen][2] = scanner.nextLine();

            System.out.println("Pin 4: ");
            rij[pogingen][3] = scanner.nextLine();

            if (rij[pogingen][0].equalsIgnoreCase(geheimecode[0])) {
                rij[pogingen][0] = maker[0];
            } else if (rij[pogingen][0].equalsIgnoreCase(geheimecode[1])
                    || rij[pogingen][0].equalsIgnoreCase(geheimecode[2])
                    || rij[pogingen][0].equalsIgnoreCase(geheimecode[3])) {
                rij[pogingen][0] = maker[1];
            } else {
                rij[pogingen][0] = maker[2];
            }

            if (rij[pogingen][1].equalsIgnoreCase(geheimecode[1])) {
                rij[pogingen][1] = maker[0];
            } else if (rij[pogingen][1].equalsIgnoreCase(geheimecode[0])
                    || rij[pogingen][1].equalsIgnoreCase(geheimecode[2])
                    || rij[pogingen][1].equalsIgnoreCase(geheimecode[3])) {
                rij[pogingen][1] = maker[1];
            } else {
                rij[pogingen][1] = maker[2];
            }

            if (rij[pogingen][2].equalsIgnoreCase(geheimecode[2])) {
                rij[pogingen][2] = maker[0];
            } else if (rij[pogingen][2].equalsIgnoreCase(geheimecode[0])
                    || rij[pogingen][2].equalsIgnoreCase(geheimecode[1])
                    || rij[pogingen][2].equalsIgnoreCase(geheimecode[3])) {
                rij[pogingen][2] = maker[1];
            } else {
                rij[pogingen][2] = maker[2];
            }

            if (rij[pogingen][3].equalsIgnoreCase(geheimecode[3])) {
                rij[pogingen][3] = maker[0];
            } else if (rij[pogingen][3].equalsIgnoreCase(geheimecode[0])
                    || rij[pogingen][3].equalsIgnoreCase(geheimecode[1])
                    || rij[pogingen][3].equalsIgnoreCase(geheimecode[2])) {
                rij[pogingen][3] = maker[1];
            } else {
                rij[pogingen][3] = maker[2];
            }

            System.out.println("Pin 1: " + rij[pogingen][0]);
            System.out.println("Pin 2: " + rij[pogingen][1]);
            System.out.println("Pin 3: " + rij[pogingen][2]);
            System.out.println("Pin 4: " + rij[pogingen][3]);

            if (rij[pogingen][0].equals(maker[0])
                    && rij[pogingen][1].equals(maker[0])
                    && rij[pogingen][2].equals(maker[0])
                    && rij[pogingen][3].equals(maker[0])) {

                codeGekraakt = true;
                System.out.println("Code gekraakt!");
            }
        }

        if (!codeGekraakt) {
            System.out.println("Je hebt 10 pogingen gebruikt.");
        }

        scanner.close();
    }
}