package fr.operateur.console;

import java.util.Scanner;

public class OperateurApp {

	public static void main(String[] args) {
		System.out.println("***** Application Opérateurs *****");
		System.out.println("Veuillez saisir le premier nombre…");
		Scanner questionUser = new Scanner(System.in) ;
		int firstOp = questionUser.nextInt();
		System.out.println("Veuillez saisir le second nombre...");
		int ScnOp = questionUser.nextInt();
		System.out.println(firstOp+" + "+ScnOp+" = "+(firstOp+ScnOp));
		System.out.println(firstOp+" - "+ScnOp+" = "+(firstOp-ScnOp));
		System.out.println(firstOp+" * "+ScnOp+" = "+(firstOp*ScnOp));
		System.out.println(firstOp+" / "+ScnOp+" = "+(firstOp/ScnOp));
		System.out.println(firstOp+" % "+ScnOp+" = "+(firstOp%ScnOp));
	}

}
