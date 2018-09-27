package Source;

public class BookV {

	private String ten;
	private String tacgia;
	private float gia=10;
	//private int soluong=10;
	private int id;
	
	public void set(String t,String tg,int id) {
		ten=t;
		tacgia=tg;
		this.id=id;
	}
	public void get() {
		System.out.println(ten);
		System.out.println(tacgia);
		System.out.println(id);
	}
	public String getten() {
		return ten;
	}
	public String gettentacgia() {
		return tacgia;
	}
	public float getgia() {
		return gia;
	}
	public int getid() {
		return id;
	}
}
