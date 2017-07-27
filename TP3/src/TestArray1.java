
public class TestArray1 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle : ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("Afficher l’ensemble des éléments dans l’ordre inverse du tableau : ");
		for(int i = array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		System.out.println("Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]>=3) {
				System.out.println(array[i]);
			}
		}
		System.out.println("Faire une boucle qui affiche uniquement les entiers pairs : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		}
		int max = 0;
		for(int i=0;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("La plus grande valeur dans le tableau est : "+max);

		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("La plus petite valeur dans le tableau est : "+min);
	}

}
