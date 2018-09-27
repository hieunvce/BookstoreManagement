package Source;

import javax.swing.JOptionPane;


public class  database {
	
	//private String[][] dansach=new String[50][3];
	
	public void sachdaban(BookV b[],int sosach,float t) {
		//chuyen di id cua sach da ban 	
		JOptionPane.showMessageDialog(null,"Hoan tat", "Bien Lai", JOptionPane.INFORMATION_MESSAGE);

		
	}		
	public BookV laysach(int id) {
		//truyen int nhan BookV
		BookV b = new BookV();
		if(id<10)
			b.set("a","a",1);
		if(id>=10 && id<20)
			b.set("b","b",2);
		if(id>=20 && id<30)
			b.set("c","c",2);
		if(id>=30 && id<40)
			b.set("d","d",2);
		if(id>=40)
			b.set("e","e",2);
		return b;
	}
	public boolean chuyenkho(String t) {
		////lay gia tri password de chuyen man hinh sang kho
		if(t.equals("abc"))
			return true;
		return false;
	}
	
	public void laytatca(String[][] danhsach) {
		//nhan tu sever BookV[]
		BookV b =new BookV();
		b.set("t", "tg", 1);
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
	public int gettongsosach() {
		//nnhan tu sever tong so luong sach
		return 20;
	}
}
