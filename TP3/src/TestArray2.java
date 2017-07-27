public class TestArray2 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		double avg = 0.0;
		for(int i = 0;i<array.length;i++) {
			avg+=(double) array[i];
		}
		avg/=array.length-1;
		System.out.println("La moyenne des éléments du tableau est : "+avg);
		for(int i = 0;i<array.length;i++) {
			if(array[i] == 15) {
				System.out.println("L'index de l'élément du tableau qui vaut 15 est : "+i);
			}
		}
		
		int nbrDupVal = 0;
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array.length/2;j++) {
				if(i != j) {
					if(array[i] == array[j]) {
						nbrDupVal++;
					}
				}
			}
		}
		System.out.println("Le tableau contient "+nbrDupVal+" doublons");
	}
}
