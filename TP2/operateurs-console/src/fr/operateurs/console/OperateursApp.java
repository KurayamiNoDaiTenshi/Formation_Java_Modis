package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		System.out.println("***** Application Opérateurs *****");
		System.out.println("Veuillez saisir le premier nombre…");
		Scanner scan = new Scanner(System.in);
		int fOp = scan.nextInt();
		System.out.println("Veuillez saisir le second nombre…");
		int sOp = scan.nextInt();
		System.out.println(fOp+" + "+sOp+" = "+(fOp+sOp));
		System.out.println(fOp+" - "+sOp+" = "+(fOp-sOp));
		System.out.println(fOp+" * "+sOp+" = "+(fOp*sOp));
		System.out.println(fOp+" / "+sOp+" = "+(fOp/sOp));
		System.out.println(fOp+" % "+sOp+" = "+(fOp%sOp));
		scan.close();
	}

}
