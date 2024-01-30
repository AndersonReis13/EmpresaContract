package entites;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valurHouer;
	private Integer houer;
	
	public HourContract() {
	}

	public HourContract(Date date, Double valurHouer, Integer houer) {
		this.date = date;
		this.valurHouer = valurHouer;
		this.houer = houer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValurHouer() {
		return valurHouer;
	}

	public void setValurHouer(Double valurHouer) {
		this.valurHouer = valurHouer;
	}

	public Integer getHouer() {
		return houer;
	}

	public void setHouer(Integer houer) {
		this.houer = houer;
	}
	
	public double totalValue() {
		return valurHouer * houer;
	}
	
	
}
