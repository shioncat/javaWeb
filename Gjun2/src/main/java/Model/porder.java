package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="porder")
public class porder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String Desk;
	private Integer A;
	private Integer B;
	private Integer C;
	private Integer sum;
	public porder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public porder(String desk, Integer a, Integer b, Integer c) {
		super();
		Desk = desk;
		A = a;
		B = b;
		C = c;
		
		sum=A*120+B*130+C*200;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesk() {
		return Desk;
	}
	public void setDesk(String desk) {
		Desk = desk;
	}
	public Integer getA() {
		return A;
	}
	public void setA(Integer a) {
		A = a;
	}
	public Integer getB() {
		return B;
	}
	public void setB(Integer b) {
		B = b;
	}
	public Integer getC() {
		return C;
	}
	public void setC(Integer c) {
		C = c;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		sum=A*120+B*130+C*200;
		this.sum = sum;
	}
	
	
	
	
	

}