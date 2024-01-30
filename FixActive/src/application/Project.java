package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Departament;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkerLevel;

public class Project {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do departamento: ");
		String departament = sc.nextLine();
		System.out.print("Informação dos trabalhadores: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Salario: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level),baseSalary, new Departament(departament));
		
		System.out.print("Quantos contratosw?");
		int x = sc.nextInt();
		
		for(int i=0;i<x;i++) {
			System.out.print("Contrato " + i + "informação:");
			System.out.print("Data (DD/MM/YYYY");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valueHour = sc.nextDouble();
			System.out.print("Horas: ");
			int hour = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valueHour, hour);
			worker.addContract(contract);
		}
		
		
		
		
		
		
		
		sc.close();
	}
}
