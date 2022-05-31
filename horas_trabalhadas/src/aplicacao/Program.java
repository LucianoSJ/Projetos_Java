package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.ContratoHoras;
import entities.Colaborador;
import entities.enums.NivelDoColaborador;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o Nome: ");
		String departmentName = sc.nextLine();
		System.out.println("Digite a data:");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("N�vel: ");
		String workerLevel = sc.nextLine();
		System.out.print("Sal�rio base: ");
		double baseSalary = sc.nextDouble();
		Colaborador worker = new Colaborador(workerName, NivelDoColaborador.valueOf(workerLevel), baseSalary, new Departamento(departmentName));
		
		System.out.print("Quantos contratos para este trabalhador? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Digite o contrato #" + i + " data:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Dura��o (horas): ");
			int hours = sc.nextInt();
			ContratoHoras contract = new ContratoHoras(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Insira o m�s e o ano para calcular a renda (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Renda para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}