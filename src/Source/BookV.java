package Source;

import java.awt.datatransfer.FlavorTable;

public class BookV {

	private String ten;
	private String tacgia;
	private double gia;
	private int soluong;
	private int id;
	
	public BookV() {
		ten=" ";
		tacgia=" ";
		id=0;
		soluong=0;
		gia=0;
	}
	public BookV(int id,String t,String tg,int sl,double g) {
		ten=t;
		tacgia=tg;
		this.id=id;
		soluong=sl;
		gia=g;
	}
	public void set(int id,String t,String tg,int sl,double g) {
		ten=t;
		tacgia=tg;
		this.id=id;
		soluong=sl;
		gia=g;
	}
	
	public void get() {
		System.out.print(id+"\t");
		System.out.print(ten+"\t");
		System.out.print(tacgia+"\t");
		System.out.print(soluong+"\t");
		System.out.println(gia);	
	}
	public String getten() {
		return ten;
	}
	public String gettentacgia() {
		return tacgia;
	}
	public double getgia() {
		return gia;
	}
	public int getid() {
		return id;
	}
	public int getsoluong() {
		return soluong;
	}
}
