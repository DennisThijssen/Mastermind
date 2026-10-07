package mastermindbegin;

import java.util.Scanner;

public class MastermindBegin {

	public static void main(String[] args) {

		String roodPinnetje = "Rood";
		String groenPinnetje = "Groen";
		String geelPinnetje = "Geel";
		String blauwPinnetje = "Blauw";
		String oranjePinnetje = "Oranje";
		String paarsPinnetje = "Paars";
		String zwartPinnetje = "Zwart";
		String witPinnetje = "Wit";
		String leegPinnetje = "Leeg";

		String geheimeCode1 = roodPinnetje;
		String geheimeCode2 = groenPinnetje;
		String geheimeCode3 = blauwPinnetje;
		String geheimeCode4 = paarsPinnetje;

		String rij1pin1;
		String rij1pin2;
		String rij1pin3;
		String rij1pin4;

		int pogingen = 0;
		boolean codeGekraakt = false;

		Scanner scanner = new Scanner(System.in);

		for (pogingen = 0; pogingen < 10 && !codeGekraakt; pogingen++) {

			System.out.println("Poging " + (pogingen + 1));

			System.out.println("Pin 1: ");
			rij1pin1 = scanner.nextLine();

			System.out.println("Pin 2: ");
			rij1pin2 = scanner.nextLine();

			System.out.println("Pin 3: ");
			rij1pin3 = scanner.nextLine();

			System.out.println("Pin 4: ");
			rij1pin4 = scanner.nextLine();

			if (rij1pin1.equalsIgnoreCase(geheimeCode1)) {

				rij1pin1 = zwartPinnetje;

			} else if (rij1pin1.equalsIgnoreCase(geheimeCode2)
					|| rij1pin1.equalsIgnoreCase(geheimeCode3)
					|| rij1pin1.equalsIgnoreCase(geheimeCode4)) {

				rij1pin1 = witPinnetje;

			} else {

				rij1pin1 = leegPinnetje;
			}

			if (rij1pin2.equalsIgnoreCase(geheimeCode2)) {

				rij1pin2 = zwartPinnetje;

			} else if (rij1pin2.equalsIgnoreCase(geheimeCode1)
					|| rij1pin2.equalsIgnoreCase(geheimeCode3)
					|| rij1pin2.equalsIgnoreCase(geheimeCode4)) {

				rij1pin2 = witPinnetje;

			} else {

				rij1pin2 = leegPinnetje;
			}

			if (rij1pin3.equalsIgnoreCase(geheimeCode3)) {

				rij1pin3 = zwartPinnetje;

			} else if (rij1pin3.equalsIgnoreCase(geheimeCode1)
					|| rij1pin3.equalsIgnoreCase(geheimeCode2)
					|| rij1pin3.equalsIgnoreCase(geheimeCode4)) {

				rij1pin3 = witPinnetje;

			} else {

				rij1pin3 = leegPinnetje;
			}

			if (rij1pin4.equalsIgnoreCase(geheimeCode4)) {

				rij1pin4 = zwartPinnetje;

			} else if (rij1pin4.equalsIgnoreCase(geheimeCode1)
					|| rij1pin4.equalsIgnoreCase(geheimeCode2)
					|| rij1pin4.equalsIgnoreCase(geheimeCode3)) {

				rij1pin4 = witPinnetje;

			} else {

				rij1pin4 = leegPinnetje;
			}

			System.out.println("Pin 1: " + rij1pin1);
			System.out.println("Pin 2: " + rij1pin2);
			System.out.println("Pin 3: " + rij1pin3);
			System.out.println("Pin 4: " + rij1pin4);

			if (rij1pin1.equals(zwartPinnetje)
					&& rij1pin2.equals(zwartPinnetje)
					&& rij1pin3.equals(zwartPinnetje)
					&& rij1pin4.equals(zwartPinnetje)) {

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