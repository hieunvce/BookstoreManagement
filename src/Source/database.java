package Source;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.sun.org.apache.xpath.internal.Arg;


public class  database {
	
	
	public void sachdaban(BookV b[],int sosach,float t) {
		//truyen ID cua sach da ban 	
			
	}		
	public BookV laysach(int id) {
		//truyen ID nhan thong tin BookV
		BookV b = new BookV();
		if(id<10)
			b.set(1,"a","a");
		if(id>=10 && id<20)
			b.set(2,"b","b");
		if(id>=20 && id<30)
			b.set(3,"c","c");
		if(id>=30 && id<40)
			b.set(4,"d","d");
		if(id>=40)
			b.set(5,"e","e");
		return b;
	}
	public boolean chuyenkho(String t) {
		////lay gia tri password de chuyen man hinh sang kho
		if(t.equals("abc"))
			return true;
		return false;
	}
	
	public void laytatca(String[][] danhsach) {
		//nhan toan bo so sach dang chuoi BookV[]
		BookV b =new BookV();
		b.set(1,"t", "tg");
		////////////
		
		for(int i=0;i<gettongsosach();i++) {
			danhsach[i][1]=b.getten();
			danhsach[i][2]=b.gettentacgia();
			danhsach[i][3]=String.valueOf(10);
			danhsach[i][4]=String.valueOf((float)10);
			danhsach[i][0]=String.valueOf(i);
		}
	}
	public void themsach(String id,String ten,String tgia,String soluong,String gia) {
		//gui di thong tin cua sach moi
		System.out.println("sach moi :");
		System.out.println("id : "+id);
		System.out.println("ten : "+ten);
		System.out.println("tac gia : "+tgia);
		System.out.println("so luong : "+soluong);
		System.out.println("gia : "+gia);
	}
	public void xoasach(String id) {
		//gui di  ID cua sach bi xoa
		System.out.println("id sach bi xoa: "+id);
	}
	public void suasach(String[][] b,int sl) {
		//cap nhat toan bo sach len sever duoi dang arraylist bookv
		BookV bk = new BookV();
		ArrayList arb  =new ArrayList();

		for(int i=0;i<sl;i++) {
			arb.add(new BookV(Integer.parseInt(b[i][0]),b[i][1],b[i][2],Integer.parseInt(b[i][3]),Float.parseFloat(b[i][4])));	
		}
		for(int i=0;i<sl;i++) {
			bk = (BookV) arb.get(i);
			bk.get();
		}
	}
	public int gettongsosach() {
		//nnhan tu sever tong so luong sach
		return 20;
	}
}
