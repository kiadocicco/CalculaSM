import java.util.Scanner;

public class CalculaSM {

	public static void main(String[] args) {
		// Calcula quantos salários minimos há em um valor
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Informe o valor do seu salário");
		float SeuSalario=teclado.nextFloat();
		float SalarioM=788;
		
		float calculo=(SeuSalario/SalarioM);
		
		System.out.println("A quantidade de salários mínimos\n correspondentes ao seu salário é: "+calculo);
		

	}

}
