public class Cuadrado {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,6,7,8,9,10};
		int S = 77;

		ordenar(array);
		imprimirArray(array);
		cuadrado(array);
		ordenar(array);
		imprimirArray(eliminar(array, S));
	}

	private static void imprimirArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] );
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void ordenar(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
		}
	}

	public static void cuadrado(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
		}
	}

	public static int[] eliminar(int[] array, int S) {
		int cont = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= S) {
				cont++;
			}
		}

		int[] res = new int[cont];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= S) {
				res[index++] = array[i];
			}
		}

		return res;
	}
}
