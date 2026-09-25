package mastermindbegin;

import java.util.Scanner;

public class MastermindBegin {

	public static void main(String[] args)

	// **TODO** Auto-generated method stub

	{
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
		String codeGekraakt;

		String rij1pin1;
		String rij1pin2;
		String rij1pin3;
		String rij1pin4;

		String rij2pin1;
		String rij2pin2;
		String rij2pin3;
		String rij2pin4;

		String rij3pin1;
		String rij3pin2;
		String rij3pin3;
		String rij3pin4;

		String rij4pin1;
		String rij4pin2;
		String rij4pin3;
		String rij4pin4;

		String rij5pin1;
		String rij5pin2;
		String rij5pin3;
		String rij5pin4;

		String rij6pin1;
		String rij6pin2;
		String rij6pin3;
		String rij6pin4;

		String rij7pin1;
		String rij7pin2;
		String rij7pin3;
		String rij7pin4;

		String rij8pin1;
		String rij8pin2;
		String rij8pin3;
		String rij8pin4;

		String rij9pin1;
		String rij9pin2;
		String rij9pin3;
		String rij9pin4;

		String rij10pin1;
		String rij10pin2;
		String rij10pin3;
		String rij10pin4;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Rij 1 pin 1: ");
		rij1pin1 = scanner.nextLine();

		System.out.println("Rij 1 pin 2: ");
		rij1pin2 = scanner.nextLine();

		System.out.println("Rij 1 pin 3: ");
		rij1pin3 = scanner.nextLine();

		System.out.println("Rij 1 pin 4: ");
		rij1pin4 = scanner.nextLine();

		if (rij1pin1.equalsIgnoreCase(geheimeCode1)) {
			rij1pin1 = zwartPinnetje;
		} else if (rij1pin1.equalsIgnoreCase(geheimeCode2) || rij1pin1.equalsIgnoreCase(geheimeCode3)
				|| rij1pin1.equalsIgnoreCase(geheimeCode4)) {
			rij1pin1 = witPinnetje;
		} else {
			rij1pin1 = leegPinnetje;
		}

		if (rij1pin2.equalsIgnoreCase(geheimeCode2)) {
			rij1pin2 = zwartPinnetje;
		} else if (rij1pin2.equalsIgnoreCase(geheimeCode1) || rij1pin2.equalsIgnoreCase(geheimeCode3)
				|| rij1pin2.equalsIgnoreCase(geheimeCode4)) {
			rij1pin2 = witPinnetje;
		} else {
			rij1pin2 = leegPinnetje;
		}

		if (rij1pin3.equalsIgnoreCase(geheimeCode3)) {
			rij1pin3 = zwartPinnetje;
		} else if (rij1pin3.equalsIgnoreCase(geheimeCode1) || rij1pin3.equalsIgnoreCase(geheimeCode2)
				|| rij1pin3.equalsIgnoreCase(geheimeCode4)) {
			rij1pin3 = witPinnetje;
		} else {
			rij1pin3 = leegPinnetje;
		}

		if (rij1pin4.equalsIgnoreCase(geheimeCode4)) {
			rij1pin4 = zwartPinnetje;
		} else if (rij1pin4.equalsIgnoreCase(geheimeCode1) || rij1pin4.equalsIgnoreCase(geheimeCode2)
				|| rij1pin4.equalsIgnoreCase(geheimeCode3)) {
			rij1pin4 = witPinnetje;
		} else {
			rij1pin4 = leegPinnetje;
		}
		System.out.println("Pin 1: " + rij1pin1);
		System.out.println("Pin 2: " + rij1pin2);
		System.out.println("Pin 3: " + rij1pin3);
		System.out.println("Pin 4: " + rij1pin4);

		System.out.println("Rij 2 pin 1: ");
		rij2pin1 = scanner.nextLine();

		System.out.println("Rij 2 pin 2: ");
		rij2pin2 = scanner.nextLine();

		System.out.println("Rij 2 pin 3: ");
		rij2pin3 = scanner.nextLine();

		System.out.println("Rij 2 pin 4: ");
		rij2pin4 = scanner.nextLine();

		System.out.println("Rij 3 pin 1: ");
		rij3pin1 = scanner.nextLine();

		System.out.println("Rij 3 pin 2: ");
		rij3pin2 = scanner.nextLine();

		System.out.println("Rij 3 pin 3: ");
		rij3pin3 = scanner.nextLine();

		System.out.println("Rij 3 pin 4: ");
		rij3pin4 = scanner.nextLine();

		System.out.println("Rij 4 pin 1: ");
		rij4pin1 = scanner.nextLine();

		System.out.println("Rij 4 pin 2: ");
		rij4pin2 = scanner.nextLine();

		System.out.println("Rij 4 pin 3: ");
		rij4pin3 = scanner.nextLine();

		System.out.println("Rij 4 pin 4: ");
		rij4pin4 = scanner.nextLine();

		System.out.println("Rij 5 pin 1: ");
		rij5pin1 = scanner.nextLine();

		System.out.println("Rij 5 pin 2: ");
		rij5pin2 = scanner.nextLine();

		System.out.println("Rij 5 pin 3: ");
		rij5pin3 = scanner.nextLine();

		System.out.println("Rij 5 pin 4: ");
		rij5pin4 = scanner.nextLine();

		System.out.println("Rij 6 pin 1: ");
		rij6pin1 = scanner.nextLine();

		System.out.println("Rij 6 pin 2: ");
		rij6pin2 = scanner.nextLine();

		System.out.println("Rij 6 pin 3: ");
		rij6pin3 = scanner.nextLine();

		System.out.println("Rij 6 pin 4: ");
		rij6pin4 = scanner.nextLine();

		System.out.println("Rij 7 pin 1: ");
		rij7pin1 = scanner.nextLine();

		System.out.println("Rij 7 pin 2: ");
		rij7pin2 = scanner.nextLine();

		System.out.println("Rij 7 pin 3: ");
		rij7pin3 = scanner.nextLine();

		System.out.println("Rij 7 pin 4: ");
		rij7pin4 = scanner.nextLine();

		System.out.println("Rij 8 pin 1: ");
		rij8pin1 = scanner.nextLine();

		System.out.println("Rij 8 pin 2: ");
		rij8pin2 = scanner.nextLine();

		System.out.println("Rij 8 pin 3: ");
		rij8pin3 = scanner.nextLine();

		System.out.println("Rij 8 pin 4: ");
		rij8pin4 = scanner.nextLine();

		System.out.println("Rij 9 pin 1: ");
		rij9pin1 = scanner.nextLine();

		System.out.println("Rij 9 pin 2: ");
		rij9pin2 = scanner.nextLine();

		System.out.println("Rij 9 pin 3: ");
		rij9pin3 = scanner.nextLine();

		System.out.println("Rij 9 pin 4: ");
		rij9pin4 = scanner.nextLine();

		System.out.println("Rij 10 pin 1: ");
		rij10pin1 = scanner.nextLine();

		System.out.println("Rij 10 pin 2: ");
		rij10pin2 = scanner.nextLine();

		System.out.println("Rij 10 pin 3: ");
		rij10pin3 = scanner.nextLine();

		System.out.println("Rij 10 pin 4: ");
		rij10pin4 = scanner.nextLine();

	}
}
