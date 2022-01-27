package ExerciciosRepeticao;

public class Exercicio01 {
	
		public static void main(String[] args) {
			//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
			//obtemos resto = 5. (FOR)
			
			int num = 1000;
			
			for(num=1000;num<=1999;num++) {
				if((num % 11) == 5) {
					System.out.println(num);
				}
				
			}
			
		}
}
