package Source;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.sun.org.apache.xpath.internal.Arg;


public class  database {
	
	
	public void sachdaban(BookV b[]) {
  		/**gui di mang 1 chieu cua sach da ban **/
		
		//in ra log de test
		for(int i =0;i<b.length;i++)
		{
			b[i].get();
		}	
	}		
	public BookV laysach(int id) {
		/**gui ID cua sach can lay thong tin **/
		
		
		
		//tao mau de test
		BookV b = new BookV();
		if(id<10)
			b.set(1,"a","a",10,1);
		if(id>=10 && id<20)
			b.set(2,"b","b",20,2);
		if(id>=20 && id<30)
			b.set(3,"c","c",30,3);
		if(id>=30 && id<40)
			b.set(4,"d","d",40,4);
		if(id>=40)
			b.set(5,"e","e",50,5);
		return b;
	}
	public boolean chuyenkho(String t) {
		/**lay gia tri password de chuyen man hinh sang kho**/
		if(t.equals("abc"))
			return true;
		return false;
	}
	
	public void laytatca(String[][] danhsach) {
		/**lay ve arraylist<book> toan bo sach**/
		
		
		// tao mau de test view
		ArrayList<BookV> b =new ArrayList<BookV>();
		for(int i=0;i<gettongsosach();i++)
		b.add(new BookV(i,"ten","tacgia",10,10));
		//cap nhat danh sach toan bo sach len view
		for(int i=0;i<gettongsosach();i++) {
			danhsach[i][0]=String.valueOf(b.get(i).getid());
			danhsach[i][1]=b.get(i).getten();
			danhsach[i][2]=b.get(i).gettentacgia();
			danhsach[i][3]=String.valueOf(b.get(i).getsoluong());
			danhsach[i][4]=String.valueOf((float)b.get(i).getgia());
			
		}
	}
	public void themsach(int id,String ten,String tgia,int soluong,double gia) {
		/**gui di thong tin sach moi vua nhap vao**/
		System.out.println("sach moi :");
		System.out.println("id : "+id);
		System.out.println("ten : "+ten);
		System.out.println("tac gia : "+tgia);
		System.out.println("so luong : "+soluong);
		System.out.println("gia : "+gia);
	}
	public void xoasach(int id) {
		/**gui di  ID cua sach bi xoa**/
		System.out.println("id sach bi xoa: "+id);
	}
	public void suasach(ArrayList<BookV> b) {
		/**gui di arraylist<BookV> sach da sua**/
		int index=0;
		for (BookV bookV : b) {
			b.get(index).get();
			index++;
		}
	}
	public int gettongsosach() {
		/**lay ve tong so luong sach**/
		return 20;
	}
}
