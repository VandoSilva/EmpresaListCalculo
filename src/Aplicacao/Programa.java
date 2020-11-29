package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Departamento;
import Entidade.HoraContrato;
import Entidade.Trabalho;
import Entidade.Enums.nivelTrabalho;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com nome do Departamento: ");
		String departamentName = sc.nextLine();
		System.out.print("Entre com a Data do Trabalho");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario Base: ");
		double baseSalary = sc.nextDouble();
		Trabalho trabalho = new Trabalho (workerName, nivelTrabalho.valueOf(workerLevel), baseSalary, new Departamento(departamentName));
		
		System.out.println("Quantos contratos esse trabalho vai ter?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com o Contrato #" + i + "data: ");
			System.out.print("Date (DD/MM/YYYY); ");
			Date contracteDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duracao (horas) ");
			int horas = sc.nextInt();
			HoraContrato contract = new HoraContrato();
			trabalho.addContract(contract);
		}
			System.out.println();
			System.out.print("Entre com o mes e o ano para calcular: ");
			String monthAndYear = sc.next();
			int monht = Integer.parseInt(monthAndYear.substring(0, 2));
			int year = Integer.parseInt(monthAndYear.substring(3));
			System.out.println("Name " + trabalho.getNome());
			System.out.println("Departamento: " + trabalho.getDepartamento().getNome());
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", trabalho.income(year, month));
		
		
		
		sc.close();

	}

}
