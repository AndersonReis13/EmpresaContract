package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	
	
	
	//Composição - associação.
	private Departament department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker(){
	}
	
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = departament;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Departament getDepartment() {
		return department;
	}


	public void setDepartment(Departament department) {
		this.department = department;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract){
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		//criando um calenadario
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_month = cal.get(Calendar.MONTH);
		    int c_year = cal.get(Calendar.YEAR);
				if(c_year == year && c_month == month) {
				sum += c.totalValue();
				}
		}
		return sum;
	}
	
}
