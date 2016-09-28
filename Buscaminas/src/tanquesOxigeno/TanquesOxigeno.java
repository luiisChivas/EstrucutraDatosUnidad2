package tanquesOxigeno;

public class TanquesOxigeno {

		//Metodo para hacer la suma de las filas
		public static String mostrarDatos(int matriz[][]){ 
			String imprimir="";		
			
			for (int fila = 0; fila < matriz.length; fila++) {
				int total = 0;	
				
				for (int columna = 0; columna  < matriz[fila].length; columna ++) {
									
					imprimir = imprimir +matriz[fila][columna] + "      ";
					total = total + matriz[fila][columna];
					
				}
				imprimir = imprimir  + total +"\n";
			}
			return imprimir;
		}
		
		//Metodo para hacer la suma de las columnas
		public static String sumaColumnas (int matriz [][]){
			String imprimir="";		
			for (int columna = 0; columna < 6; columna++) {
				int total = 0;	
				for (int fila = 0; fila  < 3; fila ++) {
					total = total + matriz[fila][columna];
				}
				imprimir = imprimir + total  + "      ";
			}
			return imprimir;
		}

		//Main para imprimir los datos
		public static void main(String[] args) {
				int [][] matriz= {{25, 20, 20, 50, 50, 30},{20, 15, 15, 90, 80, 90},{15, 10, 10, 40, 30, 40}};		
				System.out.println("Enero   Febrero Marzo   Abril   Mayo    Junio   Total:");
				System.out.println(mostrarDatos(matriz));
				System.out.println("Suma de la columnas");
				System.out.println(sumaColumnas(matriz));
		}	
	}
	

